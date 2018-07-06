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

import org.eclipse.app4mc.amalthea.model.AccessMultiplicity;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Atomic Data Coherency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.NonAtomicDataCoherencyImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.NonAtomicDataCoherencyImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.NonAtomicDataCoherencyImpl#getAccessMultiplicity <em>Access Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonAtomicDataCoherencyImpl extends AmaltheaExtendedEObjectImpl implements NonAtomicDataCoherency {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonAtomicDataCoherencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getNonAtomicDataCoherency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMultiplicity getAccessMultiplicity() {
		return accessMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMultiplicity(AccessMultiplicity newAccessMultiplicity) {
		AccessMultiplicity oldAccessMultiplicity = accessMultiplicity;
		accessMultiplicity = newAccessMultiplicity == null ? ACCESS_MULTIPLICITY_EDEFAULT : newAccessMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ACCESS_MULTIPLICITY, oldAccessMultiplicity, accessMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ENABLED:
				return isEnabled();
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ALGORITHM:
				return getAlgorithm();
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ACCESS_MULTIPLICITY:
				return getAccessMultiplicity();
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
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ACCESS_MULTIPLICITY:
				setAccessMultiplicity((AccessMultiplicity)newValue);
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
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ACCESS_MULTIPLICITY:
				setAccessMultiplicity(ACCESS_MULTIPLICITY_EDEFAULT);
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
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY__ACCESS_MULTIPLICITY:
				return accessMultiplicity != ACCESS_MULTIPLICITY_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(", accessMultiplicity: ");
		result.append(accessMultiplicity);
		result.append(')');
		return result.toString();
	}

} //NonAtomicDataCoherencyImpl
