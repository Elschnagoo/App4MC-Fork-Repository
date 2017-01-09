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
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.NumericStatistic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Access Statistic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessStatisticImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessStatisticImpl#getCacheMisses <em>Cache Misses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelAccessStatisticImpl extends BaseObjectImpl implements LabelAccessStatistic {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected NumericStatistic value;

	/**
	 * The cached value of the '{@link #getCacheMisses() <em>Cache Misses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheMisses()
	 * @generated
	 * @ordered
	 */
	protected NumericStatistic cacheMisses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelAccessStatisticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLabelAccessStatistic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStatistic getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(NumericStatistic newValue, NotificationChain msgs) {
		NumericStatistic oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(NumericStatistic newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStatistic getCacheMisses() {
		return cacheMisses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCacheMisses(NumericStatistic newCacheMisses, NotificationChain msgs) {
		NumericStatistic oldCacheMisses = cacheMisses;
		cacheMisses = newCacheMisses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES, oldCacheMisses, newCacheMisses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheMisses(NumericStatistic newCacheMisses) {
		if (newCacheMisses != cacheMisses) {
			NotificationChain msgs = null;
			if (cacheMisses != null)
				msgs = ((InternalEObject)cacheMisses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES, null, msgs);
			if (newCacheMisses != null)
				msgs = ((InternalEObject)newCacheMisses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES, null, msgs);
			msgs = basicSetCacheMisses(newCacheMisses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES, newCacheMisses, newCacheMisses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE:
				return basicSetValue(null, msgs);
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES:
				return basicSetCacheMisses(null, msgs);
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
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE:
				return getValue();
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES:
				return getCacheMisses();
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
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE:
				setValue((NumericStatistic)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES:
				setCacheMisses((NumericStatistic)newValue);
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
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE:
				setValue((NumericStatistic)null);
				return;
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES:
				setCacheMisses((NumericStatistic)null);
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
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__VALUE:
				return value != null;
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC__CACHE_MISSES:
				return cacheMisses != null;
		}
		return super.eIsSet(featureID);
	}

} //LabelAccessStatisticImpl
