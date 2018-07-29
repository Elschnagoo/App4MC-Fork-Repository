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
import org.eclipse.app4mc.amalthea.model.WeibullParameters;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weibull Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.WeibullParametersImpl#getKappa <em>Kappa</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.WeibullParametersImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeibullParametersImpl<T> extends WeibullDistributionImpl<T> implements WeibullParameters<T> {
	/**
	 * The default value of the '{@link #getKappa() <em>Kappa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKappa()
	 * @generated
	 * @ordered
	 */
	protected static final double KAPPA_EDEFAULT = 0.0;

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
	protected static final double LAMBDA_EDEFAULT = 0.0;

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
	protected WeibullParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getWeibullParameters();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.WEIBULL_PARAMETERS__KAPPA, oldKappa, kappa));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.WEIBULL_PARAMETERS__LAMBDA, oldLambda, lambda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.WEIBULL_PARAMETERS__KAPPA:
				return getKappa();
			case AmaltheaPackage.WEIBULL_PARAMETERS__LAMBDA:
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
			case AmaltheaPackage.WEIBULL_PARAMETERS__KAPPA:
				setKappa((Double)newValue);
				return;
			case AmaltheaPackage.WEIBULL_PARAMETERS__LAMBDA:
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
			case AmaltheaPackage.WEIBULL_PARAMETERS__KAPPA:
				setKappa(KAPPA_EDEFAULT);
				return;
			case AmaltheaPackage.WEIBULL_PARAMETERS__LAMBDA:
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
			case AmaltheaPackage.WEIBULL_PARAMETERS__KAPPA:
				return kappa != KAPPA_EDEFAULT;
			case AmaltheaPackage.WEIBULL_PARAMETERS__LAMBDA:
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

} //WeibullParametersImpl
