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
import org.eclipse.app4mc.amalthea.model.DataPlatformMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Platform Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataPlatformMappingImpl#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataPlatformMappingImpl#getPlatformType <em>Platform Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPlatformMappingImpl extends BaseObjectImpl implements DataPlatformMapping {
	/**
	 * The default value of the '{@link #getPlatformName() <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformName() <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformName()
	 * @generated
	 * @ordered
	 */
	protected String platformName = PLATFORM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformType() <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformType()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformType() <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformType()
	 * @generated
	 * @ordered
	 */
	protected String platformType = PLATFORM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPlatformMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDataPlatformMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatformName() {
		return platformName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformName(String newPlatformName) {
		String oldPlatformName = platformName;
		platformName = newPlatformName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_NAME, oldPlatformName, platformName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatformType() {
		return platformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformType(String newPlatformType) {
		String oldPlatformType = platformType;
		platformType = newPlatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_TYPE, oldPlatformType, platformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_NAME:
				return getPlatformName();
			case AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_TYPE:
				return getPlatformType();
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
			case AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_NAME:
				setPlatformName((String)newValue);
				return;
			case AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_TYPE:
				setPlatformType((String)newValue);
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
			case AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_NAME:
				setPlatformName(PLATFORM_NAME_EDEFAULT);
				return;
			case AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_TYPE:
				setPlatformType(PLATFORM_TYPE_EDEFAULT);
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
			case AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_NAME:
				return PLATFORM_NAME_EDEFAULT == null ? platformName != null : !PLATFORM_NAME_EDEFAULT.equals(platformName);
			case AmaltheaPackage.DATA_PLATFORM_MAPPING__PLATFORM_TYPE:
				return PLATFORM_TYPE_EDEFAULT == null ? platformType != null : !PLATFORM_TYPE_EDEFAULT.equals(platformType);
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
		result.append(" (platformName: ");
		result.append(platformName);
		result.append(", platformType: ");
		result.append(platformType);
		result.append(')');
		return result.toString();
	}

} //DataPlatformMappingImpl
