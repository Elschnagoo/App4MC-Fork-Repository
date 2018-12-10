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

import org.apache.commons.math3.special.Gamma;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullParametersDistribution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Weibull Parameters Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DiscreteWeibullParametersDistributionImpl#getKappa <em>Kappa</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DiscreteWeibullParametersDistributionImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteWeibullParametersDistributionImpl extends DiscreteWeibullDistributionImpl implements DiscreteWeibullParametersDistribution {
	/**
	 * The default value of the '{@link #getKappa() <em>Kappa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKappa()
	 * @generated
	 * @ordered
	 */
	protected static final double KAPPA_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getKappa() <em>Kappa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKappa()
	 * @generated
	 * @ordered
	 */
	protected double kappa = KAPPA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambda() <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected static final double LAMBDA_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getLambda() <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected double lambda = LAMBDA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteWeibullParametersDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDiscreteWeibullParametersDistribution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKappa() {
		return kappa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKappa(double newKappa) {
		double oldKappa = kappa;
		kappa = newKappa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__KAPPA, oldKappa, kappa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLambda() {
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLambda(double newLambda) {
		double oldLambda = lambda;
		lambda = newLambda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__LAMBDA, oldLambda, lambda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAverage() {
		double _xblockexpression = (double) 0;
		{
			double _lambda = this.getLambda();
			double _divide = (1.0 / _lambda);
			double _kappa = this.getKappa();
			double _divide_1 = (1.0 / _kappa);
			double _plus = (1.0 + _divide_1);
			double _gamma = Gamma.gamma(_plus);
			final double ratio = (_divide * _gamma);
			Long _lowerBound = this.getLowerBound();
			Long _upperBound = this.getUpperBound();
			Long _lowerBound_1 = this.getLowerBound();
			long _minus = ((_upperBound).longValue() - (_lowerBound_1).longValue());
			double _multiply = (_minus * ratio);
			_xblockexpression = ((_lowerBound).longValue() + _multiply);
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
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__KAPPA:
				return getKappa();
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__LAMBDA:
				return getLambda();
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
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__KAPPA:
				setKappa((Double)newValue);
				return;
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__LAMBDA:
				setLambda((Double)newValue);
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
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__KAPPA:
				setKappa(KAPPA_EDEFAULT);
				return;
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__LAMBDA:
				setLambda(LAMBDA_EDEFAULT);
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
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__KAPPA:
				return kappa != KAPPA_EDEFAULT;
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__LAMBDA:
				return lambda != LAMBDA_EDEFAULT;
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
		if (baseClass == DiscreteDeviation.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.DISCRETE_DEVIATION___GET_AVERAGE: return AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION___GET_AVERAGE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == BoundedDiscreteDistribution.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.BOUNDED_DISCRETE_DISTRIBUTION___GET_AVERAGE: return AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION___GET_AVERAGE;
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
			case AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION___GET_AVERAGE:
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
		result.append(" (kappa: ");
		result.append(kappa);
		result.append(", lambda: ");
		result.append(lambda);
		result.append(')');
		return result.toString();
	}

} //DiscreteWeibullParametersDistributionImpl
