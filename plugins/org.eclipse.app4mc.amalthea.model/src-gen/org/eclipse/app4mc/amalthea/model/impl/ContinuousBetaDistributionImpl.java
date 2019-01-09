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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ContinuousBetaDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousInterval;
import org.eclipse.app4mc.amalthea.model.IContinuousDeviation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.lib.DoubleExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Beta Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ContinuousBetaDistributionImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ContinuousBetaDistributionImpl#getBeta <em>Beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinuousBetaDistributionImpl extends BoundedContinuousDistributionImpl implements ContinuousBetaDistribution {
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final double ALPHA_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected double alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeta() <em>Beta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeta()
	 * @generated
	 * @ordered
	 */
	protected static final double BETA_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getBeta() <em>Beta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeta()
	 * @generated
	 * @ordered
	 */
	protected double beta = BETA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousBetaDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getContinuousBetaDistribution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(double newAlpha) {
		double oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBeta() {
		return beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeta(double newBeta) {
		double oldBeta = beta;
		beta = newBeta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__BETA, oldBeta, beta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAverage() {
		double _xblockexpression = (double) 0;
		{
			double _beta = this.getBeta();
			double _alpha = this.getAlpha();
			double _divide = (_beta / _alpha);
			double _plus = (1.0 + _divide);
			final double ratio = (1.0 / _plus);
			Double _lowerBound = this.getLowerBound();
			Double _upperBound = this.getUpperBound();
			Double _lowerBound_1 = this.getLowerBound();
			double _minus = DoubleExtensions.operator_minus(_upperBound, _lowerBound_1);
			double _multiply = (_minus * ratio);
			_xblockexpression = ((_lowerBound).doubleValue() + _multiply);
		}
		return Double.valueOf(_xblockexpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__ALPHA:
				return getAlpha();
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__BETA:
				return getBeta();
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
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__ALPHA:
				setAlpha((Double)newValue);
				return;
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__BETA:
				setBeta((Double)newValue);
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
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__BETA:
				setBeta(BETA_EDEFAULT);
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
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__BETA:
				return beta != BETA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ContinuousInterval.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.CONTINUOUS_INTERVAL___GET_AVERAGE: return AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION___GET_AVERAGE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == IContinuousDeviation.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.ICONTINUOUS_DEVIATION___GET_AVERAGE: return AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION___GET_AVERAGE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION___GET_AVERAGE:
				return getAverage();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (alpha: ");
		result.append(alpha);
		result.append(", beta: ");
		result.append(beta);
		result.append(')');
		return result.toString();
	}

} //ContinuousBetaDistributionImpl
