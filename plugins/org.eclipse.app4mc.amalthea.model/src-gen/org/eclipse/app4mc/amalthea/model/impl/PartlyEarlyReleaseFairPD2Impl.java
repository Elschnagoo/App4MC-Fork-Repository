/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partly Early Release Fair PD2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PartlyEarlyReleaseFairPD2Impl#getQuantSizeNs <em>Quant Size Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartlyEarlyReleaseFairPD2Impl extends TaskSchedulingAlgorithmImpl implements PartlyEarlyReleaseFairPD2 {
	/**
	 * The default value of the '{@link #getQuantSizeNs() <em>Quant Size Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantSizeNs()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANT_SIZE_NS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantSizeNs() <em>Quant Size Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantSizeNs()
	 * @generated
	 * @ordered
	 */
	protected int quantSizeNs = QUANT_SIZE_NS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartlyEarlyReleaseFairPD2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getPartlyEarlyReleaseFairPD2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantSizeNs() {
		return quantSizeNs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantSizeNs(int newQuantSizeNs) {
		int oldQuantSizeNs = quantSizeNs;
		quantSizeNs = newQuantSizeNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2__QUANT_SIZE_NS, oldQuantSizeNs, quantSizeNs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2__QUANT_SIZE_NS:
				return getQuantSizeNs();
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
			case AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2__QUANT_SIZE_NS:
				setQuantSizeNs((Integer)newValue);
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
			case AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2__QUANT_SIZE_NS:
				setQuantSizeNs(QUANT_SIZE_NS_EDEFAULT);
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
			case AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2__QUANT_SIZE_NS:
				return quantSizeNs != QUANT_SIZE_NS_EDEFAULT;
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
		result.append(" (quantSizeNs: ");
		result.append(quantSizeNs);
		result.append(')');
		return result.toString();
	}

} //PartlyEarlyReleaseFairPD2Impl
