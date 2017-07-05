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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Specific Scheduling Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.UserSpecificSchedulingAlgorithmImpl#getAlgorithmParameters <em>Algorithm Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserSpecificSchedulingAlgorithmImpl extends TaskSchedulingAlgorithmImpl implements UserSpecificSchedulingAlgorithm {
	/**
	 * The cached value of the '{@link #getAlgorithmParameters() <em>Algorithm Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> algorithmParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSpecificSchedulingAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getUserSpecificSchedulingAlgorithm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getAlgorithmParameters() {
		if (algorithmParameters == null) {
			algorithmParameters = new EcoreEMap<String,String>(AmaltheaPackage.eINSTANCE.getAlgorithmParameter(), AlgorithmParameterImpl.class, this, AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__ALGORITHM_PARAMETERS);
		}
		return algorithmParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__ALGORITHM_PARAMETERS:
				return ((InternalEList<?>)getAlgorithmParameters()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__ALGORITHM_PARAMETERS:
				if (coreType) return getAlgorithmParameters();
				else return getAlgorithmParameters().map();
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
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__ALGORITHM_PARAMETERS:
				((EStructuralFeature.Setting)getAlgorithmParameters()).set(newValue);
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
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__ALGORITHM_PARAMETERS:
				getAlgorithmParameters().clear();
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
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__ALGORITHM_PARAMETERS:
				return algorithmParameters != null && !algorithmParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserSpecificSchedulingAlgorithmImpl
