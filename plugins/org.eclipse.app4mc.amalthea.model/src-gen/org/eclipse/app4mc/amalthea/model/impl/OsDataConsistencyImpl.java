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
import org.eclipse.app4mc.amalthea.model.DataStability;
import org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsDataConsistencyMode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Data Consistency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsDataConsistencyImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsDataConsistencyImpl#getDataStability <em>Data Stability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsDataConsistencyImpl#getNonAtomicDataCoherency <em>Non Atomic Data Coherency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsDataConsistencyImpl extends BaseObjectImpl implements OsDataConsistency {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final OsDataConsistencyMode MODE_EDEFAULT = OsDataConsistencyMode._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected OsDataConsistencyMode mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataStability() <em>Data Stability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStability()
	 * @generated
	 * @ordered
	 */
	protected DataStability dataStability;

	/**
	 * The cached value of the '{@link #getNonAtomicDataCoherency() <em>Non Atomic Data Coherency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonAtomicDataCoherency()
	 * @generated
	 * @ordered
	 */
	protected NonAtomicDataCoherency nonAtomicDataCoherency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsDataConsistencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsDataConsistency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsDataConsistencyMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(OsDataConsistencyMode newMode) {
		OsDataConsistencyMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_DATA_CONSISTENCY__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStability getDataStability() {
		return dataStability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStability(DataStability newDataStability, NotificationChain msgs) {
		DataStability oldDataStability = dataStability;
		dataStability = newDataStability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY, oldDataStability, newDataStability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStability(DataStability newDataStability) {
		if (newDataStability != dataStability) {
			NotificationChain msgs = null;
			if (dataStability != null)
				msgs = ((InternalEObject)dataStability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY, null, msgs);
			if (newDataStability != null)
				msgs = ((InternalEObject)newDataStability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY, null, msgs);
			msgs = basicSetDataStability(newDataStability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY, newDataStability, newDataStability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonAtomicDataCoherency getNonAtomicDataCoherency() {
		return nonAtomicDataCoherency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonAtomicDataCoherency(NonAtomicDataCoherency newNonAtomicDataCoherency, NotificationChain msgs) {
		NonAtomicDataCoherency oldNonAtomicDataCoherency = nonAtomicDataCoherency;
		nonAtomicDataCoherency = newNonAtomicDataCoherency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY, oldNonAtomicDataCoherency, newNonAtomicDataCoherency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonAtomicDataCoherency(NonAtomicDataCoherency newNonAtomicDataCoherency) {
		if (newNonAtomicDataCoherency != nonAtomicDataCoherency) {
			NotificationChain msgs = null;
			if (nonAtomicDataCoherency != null)
				msgs = ((InternalEObject)nonAtomicDataCoherency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY, null, msgs);
			if (newNonAtomicDataCoherency != null)
				msgs = ((InternalEObject)newNonAtomicDataCoherency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY, null, msgs);
			msgs = basicSetNonAtomicDataCoherency(newNonAtomicDataCoherency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY, newNonAtomicDataCoherency, newNonAtomicDataCoherency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY:
				return basicSetDataStability(null, msgs);
			case AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY:
				return basicSetNonAtomicDataCoherency(null, msgs);
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
			case AmaltheaPackage.OS_DATA_CONSISTENCY__MODE:
				return getMode();
			case AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY:
				return getDataStability();
			case AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY:
				return getNonAtomicDataCoherency();
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
			case AmaltheaPackage.OS_DATA_CONSISTENCY__MODE:
				setMode((OsDataConsistencyMode)newValue);
				return;
			case AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY:
				setDataStability((DataStability)newValue);
				return;
			case AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY:
				setNonAtomicDataCoherency((NonAtomicDataCoherency)newValue);
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
			case AmaltheaPackage.OS_DATA_CONSISTENCY__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY:
				setDataStability((DataStability)null);
				return;
			case AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY:
				setNonAtomicDataCoherency((NonAtomicDataCoherency)null);
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
			case AmaltheaPackage.OS_DATA_CONSISTENCY__MODE:
				return mode != MODE_EDEFAULT;
			case AmaltheaPackage.OS_DATA_CONSISTENCY__DATA_STABILITY:
				return dataStability != null;
			case AmaltheaPackage.OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY:
				return nonAtomicDataCoherency != null;
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //OsDataConsistencyImpl
