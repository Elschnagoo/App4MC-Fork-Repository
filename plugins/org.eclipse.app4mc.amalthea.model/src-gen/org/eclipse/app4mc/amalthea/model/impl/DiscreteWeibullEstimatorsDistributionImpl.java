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
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullEstimatorsDistribution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Weibull Estimators Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DiscreteWeibullEstimatorsDistributionImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DiscreteWeibullEstimatorsDistributionImpl#getPRemainPromille <em>PRemain Promille</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteWeibullEstimatorsDistributionImpl extends BoundedDiscreteDistributionImpl implements DiscreteWeibullEstimatorsDistribution {
	/**
	 * The default value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected static final Double AVERAGE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected Double average = AVERAGE_EDEFAULT;

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
	protected DiscreteWeibullEstimatorsDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDiscreteWeibullEstimatorsDistribution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAverage() {
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverage(Double newAverage) {
		Double oldAverage = average;
		average = newAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE, oldAverage, average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPRemainPromille() {
		return pRemainPromille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRemainPromille(double newPRemainPromille) {
		double oldPRemainPromille = pRemainPromille;
		pRemainPromille = newPRemainPromille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE, oldPRemainPromille, pRemainPromille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				return getAverage();
			case AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE:
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
			case AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				setAverage((Double)newValue);
				return;
			case AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE:
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
			case AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				setAverage(AVERAGE_EDEFAULT);
				return;
			case AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE:
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
			case AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE:
				return AVERAGE_EDEFAULT == null ? average != null : !AVERAGE_EDEFAULT.equals(average);
			case AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE:
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
		result.append(" (average: ");
		result.append(average);
		result.append(", pRemainPromille: ");
		result.append(pRemainPromille);
		result.append(')');
		return result.toString();
	}

} //DiscreteWeibullEstimatorsDistributionImpl
