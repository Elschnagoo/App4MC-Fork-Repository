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
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Weibull Estimators Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeWeibullEstimatorsDistributionImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeWeibullEstimatorsDistributionImpl#getPRemainPromille <em>PRemain Promille</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeWeibullEstimatorsDistributionImpl extends BoundedTimeDistributionImpl implements TimeWeibullEstimatorsDistribution {
	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected Time average;

	/**
	 * The default value of the '{@link #getPRemainPromille() <em>PRemain Promille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRemainPromille()
	 * @generated
	 * @ordered
	 */
	protected static final double PREMAIN_PROMILLE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getPRemainPromille() <em>PRemain Promille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRemainPromille()
	 * @generated
	 * @ordered
	 */
	protected double pRemainPromille = PREMAIN_PROMILLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeWeibullEstimatorsDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTimeWeibullEstimatorsDistribution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getAverage() {
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAverage(Time newAverage, NotificationChain msgs) {
		Time oldAverage = average;
		average = newAverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE, oldAverage, newAverage);
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
	public void setAverage(Time newAverage) {
		if (newAverage != average) {
			NotificationChain msgs = null;
			if (average != null)
				msgs = ((InternalEObject)average).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE, null, msgs);
			if (newAverage != null)
				msgs = ((InternalEObject)newAverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE, null, msgs);
			msgs = basicSetAverage(newAverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE, newAverage, newAverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPRemainPromille() {
		return pRemainPromille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRemainPromille(double newPRemainPromille) {
		double oldPRemainPromille = pRemainPromille;
		pRemainPromille = newPRemainPromille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE, oldPRemainPromille, pRemainPromille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				return basicSetAverage(null, msgs);
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
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				return getAverage();
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE:
				return getPRemainPromille();
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
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				setAverage((Time)newValue);
				return;
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE:
				setPRemainPromille((Double)newValue);
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
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				setAverage((Time)null);
				return;
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE:
				setPRemainPromille(PREMAIN_PROMILLE_EDEFAULT);
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
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				return average != null;
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE:
				return pRemainPromille != PREMAIN_PROMILLE_EDEFAULT;
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
		result.append(" (pRemainPromille: ");
		result.append(pRemainPromille);
		result.append(')');
		return result.toString();
	}

} //TimeWeibullEstimatorsDistributionImpl
