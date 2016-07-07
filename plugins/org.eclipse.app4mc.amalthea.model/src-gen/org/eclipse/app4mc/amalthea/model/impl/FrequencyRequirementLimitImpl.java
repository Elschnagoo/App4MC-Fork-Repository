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
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyMetric;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.FrequencyRequirementLimitImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.FrequencyRequirementLimitImpl#getLimitValue <em>Limit Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyRequirementLimitImpl extends RequirementLimitImpl implements FrequencyRequirementLimit {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final FrequencyMetric METRIC_EDEFAULT = FrequencyMetric._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected FrequencyMetric metric = METRIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLimitValue() <em>Limit Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitValue()
	 * @generated
	 * @ordered
	 */
	protected Frequency limitValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyRequirementLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getFrequencyRequirementLimit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(FrequencyMetric newMetric) {
		FrequencyMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frequency getLimitValue() {
		if (limitValue != null && limitValue.eIsProxy()) {
			InternalEObject oldLimitValue = (InternalEObject)limitValue;
			limitValue = (Frequency)eResolveProxy(oldLimitValue);
			if (limitValue != oldLimitValue) {
				InternalEObject newLimitValue = (InternalEObject)limitValue;
				NotificationChain msgs = oldLimitValue.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE, null, null);
				if (newLimitValue.eInternalContainer() == null) {
					msgs = newLimitValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE, oldLimitValue, limitValue));
			}
		}
		return limitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frequency basicGetLimitValue() {
		return limitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitValue(Frequency newLimitValue, NotificationChain msgs) {
		Frequency oldLimitValue = limitValue;
		limitValue = newLimitValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE, oldLimitValue, newLimitValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitValue(Frequency newLimitValue) {
		if (newLimitValue != limitValue) {
			NotificationChain msgs = null;
			if (limitValue != null)
				msgs = ((InternalEObject)limitValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE, null, msgs);
			if (newLimitValue != null)
				msgs = ((InternalEObject)newLimitValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE, null, msgs);
			msgs = basicSetLimitValue(newLimitValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE, newLimitValue, newLimitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE:
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
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__METRIC:
				return getMetric();
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE:
				if (resolve) return getLimitValue();
				return basicGetLimitValue();
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
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__METRIC:
				setMetric((FrequencyMetric)newValue);
				return;
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((Frequency)newValue);
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
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((Frequency)null);
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
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__METRIC:
				return metric != METRIC_EDEFAULT;
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //FrequencyRequirementLimitImpl
