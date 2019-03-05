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

import org.eclipse.app4mc.amalthea.model.AccessMultiplicity;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataStability;
import org.eclipse.app4mc.amalthea.model.DataStabilityLevel;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Stability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataStabilityImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataStabilityImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataStabilityImpl#getAccessMultiplicity <em>Access Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataStabilityImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStabilityImpl extends AmaltheaExtendedEObjectImpl implements DataStability {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessMultiplicity() <em>Access Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMultiplicity ACCESS_MULTIPLICITY_EDEFAULT = AccessMultiplicity._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAccessMultiplicity() <em>Access Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected AccessMultiplicity accessMultiplicity = ACCESS_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DataStabilityLevel LEVEL_EDEFAULT = DataStabilityLevel._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected DataStabilityLevel level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDataStability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_STABILITY__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_STABILITY__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessMultiplicity getAccessMultiplicity() {
		return accessMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessMultiplicity(AccessMultiplicity newAccessMultiplicity) {
		AccessMultiplicity oldAccessMultiplicity = accessMultiplicity;
		accessMultiplicity = newAccessMultiplicity == null ? ACCESS_MULTIPLICITY_EDEFAULT : newAccessMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_STABILITY__ACCESS_MULTIPLICITY, oldAccessMultiplicity, accessMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStabilityLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(DataStabilityLevel newLevel) {
		DataStabilityLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_STABILITY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.DATA_STABILITY__ENABLED:
				return isEnabled();
			case AmaltheaPackage.DATA_STABILITY__ALGORITHM:
				return getAlgorithm();
			case AmaltheaPackage.DATA_STABILITY__ACCESS_MULTIPLICITY:
				return getAccessMultiplicity();
			case AmaltheaPackage.DATA_STABILITY__LEVEL:
				return getLevel();
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
			case AmaltheaPackage.DATA_STABILITY__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case AmaltheaPackage.DATA_STABILITY__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case AmaltheaPackage.DATA_STABILITY__ACCESS_MULTIPLICITY:
				setAccessMultiplicity((AccessMultiplicity)newValue);
				return;
			case AmaltheaPackage.DATA_STABILITY__LEVEL:
				setLevel((DataStabilityLevel)newValue);
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
			case AmaltheaPackage.DATA_STABILITY__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case AmaltheaPackage.DATA_STABILITY__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case AmaltheaPackage.DATA_STABILITY__ACCESS_MULTIPLICITY:
				setAccessMultiplicity(ACCESS_MULTIPLICITY_EDEFAULT);
				return;
			case AmaltheaPackage.DATA_STABILITY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case AmaltheaPackage.DATA_STABILITY__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case AmaltheaPackage.DATA_STABILITY__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case AmaltheaPackage.DATA_STABILITY__ACCESS_MULTIPLICITY:
				return accessMultiplicity != ACCESS_MULTIPLICITY_EDEFAULT;
			case AmaltheaPackage.DATA_STABILITY__LEVEL:
				return level != LEVEL_EDEFAULT;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(", accessMultiplicity: ");
		result.append(accessMultiplicity);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //DataStabilityImpl
