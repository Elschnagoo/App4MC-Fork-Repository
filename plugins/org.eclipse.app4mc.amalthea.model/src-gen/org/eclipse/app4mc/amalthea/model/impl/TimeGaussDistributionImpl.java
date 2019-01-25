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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Gauss Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeGaussDistributionImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeGaussDistributionImpl#getSd <em>Sd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeGaussDistributionImpl extends TruncatedTimeDistributionImpl implements TimeGaussDistribution {
	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected Time mean;

	/**
	 * The cached value of the '{@link #getSd() <em>Sd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSd()
	 * @generated
	 * @ordered
	 */
	protected Time sd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeGaussDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTimeGaussDistribution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMean(Time newMean, NotificationChain msgs) {
		Time oldMean = mean;
		mean = newMean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN, oldMean, newMean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(Time newMean) {
		if (newMean != mean) {
			NotificationChain msgs = null;
			if (mean != null)
				msgs = ((InternalEObject)mean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN, null, msgs);
			if (newMean != null)
				msgs = ((InternalEObject)newMean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN, null, msgs);
			msgs = basicSetMean(newMean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN, newMean, newMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getSd() {
		return sd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSd(Time newSd, NotificationChain msgs) {
		Time oldSd = sd;
		sd = newSd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD, oldSd, newSd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSd(Time newSd) {
		if (newSd != sd) {
			NotificationChain msgs = null;
			if (sd != null)
				msgs = ((InternalEObject)sd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD, null, msgs);
			if (newSd != null)
				msgs = ((InternalEObject)newSd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD, null, msgs);
			msgs = basicSetSd(newSd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD, newSd, newSd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getAverage() {
		if (((this.getLowerBound() == null) && (this.getUpperBound() == null))) {
			return this.getMean();
		}
		return AmaltheaServices.getAverageOfTruncatedNormalDistribution(this.getLowerBound(), this.getUpperBound(), this.getMean(), this.getSd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN:
				return basicSetMean(null, msgs);
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD:
				return basicSetSd(null, msgs);
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
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN:
				return getMean();
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD:
				return getSd();
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
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN:
				setMean((Time)newValue);
				return;
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD:
				setSd((Time)newValue);
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
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN:
				setMean((Time)null);
				return;
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD:
				setSd((Time)null);
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
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN:
				return mean != null;
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD:
				return sd != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION___GET_AVERAGE:
				return getAverage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TimeGaussDistributionImpl
