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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.FrequencyDomainImpl#getPossibleValues <em>Possible Values</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.FrequencyDomainImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.FrequencyDomainImpl#isClockGating <em>Clock Gating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyDomainImpl extends HwDomainImpl implements FrequencyDomain {
	/**
	 * The cached value of the '{@link #getPossibleValues() <em>Possible Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Frequency> possibleValues;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Frequency defaultValue;

	/**
	 * The default value of the '{@link #isClockGating() <em>Clock Gating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockGating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOCK_GATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClockGating() <em>Clock Gating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockGating()
	 * @generated
	 * @ordered
	 */
	protected boolean clockGating = CLOCK_GATING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getFrequencyDomain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Frequency> getPossibleValues() {
		if (possibleValues == null) {
			possibleValues = new EObjectContainmentEList<Frequency>(Frequency.class, this, AmaltheaPackage.FREQUENCY_DOMAIN__POSSIBLE_VALUES);
		}
		return possibleValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frequency getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(Frequency newDefaultValue, NotificationChain msgs) {
		Frequency oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(Frequency newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClockGating() {
		return clockGating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockGating(boolean newClockGating) {
		boolean oldClockGating = clockGating;
		clockGating = newClockGating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.FREQUENCY_DOMAIN__CLOCK_GATING, oldClockGating, clockGating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.FREQUENCY_DOMAIN__POSSIBLE_VALUES:
				return ((InternalEList<?>)getPossibleValues()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case AmaltheaPackage.FREQUENCY_DOMAIN__POSSIBLE_VALUES:
				return getPossibleValues();
			case AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE:
				return getDefaultValue();
			case AmaltheaPackage.FREQUENCY_DOMAIN__CLOCK_GATING:
				return isClockGating();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.FREQUENCY_DOMAIN__POSSIBLE_VALUES:
				getPossibleValues().clear();
				getPossibleValues().addAll((Collection<? extends Frequency>)newValue);
				return;
			case AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE:
				setDefaultValue((Frequency)newValue);
				return;
			case AmaltheaPackage.FREQUENCY_DOMAIN__CLOCK_GATING:
				setClockGating((Boolean)newValue);
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
			case AmaltheaPackage.FREQUENCY_DOMAIN__POSSIBLE_VALUES:
				getPossibleValues().clear();
				return;
			case AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE:
				setDefaultValue((Frequency)null);
				return;
			case AmaltheaPackage.FREQUENCY_DOMAIN__CLOCK_GATING:
				setClockGating(CLOCK_GATING_EDEFAULT);
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
			case AmaltheaPackage.FREQUENCY_DOMAIN__POSSIBLE_VALUES:
				return possibleValues != null && !possibleValues.isEmpty();
			case AmaltheaPackage.FREQUENCY_DOMAIN__DEFAULT_VALUE:
				return defaultValue != null;
			case AmaltheaPackage.FREQUENCY_DOMAIN__CLOCK_GATING:
				return clockGating != CLOCK_GATING_EDEFAULT;
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
		result.append(" (clockGating: ");
		result.append(clockGating);
		result.append(')');
		return result.toString();
	}

} //FrequencyDomainImpl
