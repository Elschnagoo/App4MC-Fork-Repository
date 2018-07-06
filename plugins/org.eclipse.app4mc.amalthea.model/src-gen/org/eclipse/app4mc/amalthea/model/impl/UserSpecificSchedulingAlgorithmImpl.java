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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.UserSpecificSchedulingAlgorithmImpl#getParameterExtensions <em>Parameter Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserSpecificSchedulingAlgorithmImpl extends TaskSchedulingAlgorithmImpl implements UserSpecificSchedulingAlgorithm {
	/**
	 * The cached value of the '{@link #getParameterExtensions() <em>Parameter Extensions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterExtensions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> parameterExtensions;

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
	public EMap<String, String> getParameterExtensions() {
		if (parameterExtensions == null) {
			parameterExtensions = new EcoreEMap<String,String>(AmaltheaPackage.eINSTANCE.getParameterExtension(), ParameterExtensionImpl.class, this, AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__PARAMETER_EXTENSIONS);
		}
		return parameterExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__PARAMETER_EXTENSIONS:
				return ((InternalEList<?>)getParameterExtensions()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__PARAMETER_EXTENSIONS:
				if (coreType) return getParameterExtensions();
				else return getParameterExtensions().map();
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
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__PARAMETER_EXTENSIONS:
				((EStructuralFeature.Setting)getParameterExtensions()).set(newValue);
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
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__PARAMETER_EXTENSIONS:
				getParameterExtensions().clear();
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
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM__PARAMETER_EXTENSIONS:
				return parameterExtensions != null && !parameterExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserSpecificSchedulingAlgorithmImpl
