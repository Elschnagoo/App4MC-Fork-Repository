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
import org.eclipse.app4mc.amalthea.model.DataAgeCycle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Age Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeCycleImpl#getMinimumCycle <em>Minimum Cycle</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeCycleImpl#getMaximumCycle <em>Maximum Cycle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAgeCycleImpl extends DataAgeImpl implements DataAgeCycle {
	/**
	 * The default value of the '{@link #getMinimumCycle() <em>Minimum Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCycle()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_CYCLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumCycle() <em>Minimum Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCycle()
	 * @generated
	 * @ordered
	 */
	protected int minimumCycle = MINIMUM_CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumCycle() <em>Maximum Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCycle()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_CYCLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumCycle() <em>Maximum Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCycle()
	 * @generated
	 * @ordered
	 */
	protected int maximumCycle = MAXIMUM_CYCLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAgeCycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDataAgeCycle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimumCycle() {
		return minimumCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCycle(int newMinimumCycle) {
		int oldMinimumCycle = minimumCycle;
		minimumCycle = newMinimumCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_CYCLE__MINIMUM_CYCLE, oldMinimumCycle, minimumCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumCycle() {
		return maximumCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumCycle(int newMaximumCycle) {
		int oldMaximumCycle = maximumCycle;
		maximumCycle = newMaximumCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_CYCLE__MAXIMUM_CYCLE, oldMaximumCycle, maximumCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.DATA_AGE_CYCLE__MINIMUM_CYCLE:
				return getMinimumCycle();
			case AmaltheaPackage.DATA_AGE_CYCLE__MAXIMUM_CYCLE:
				return getMaximumCycle();
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
			case AmaltheaPackage.DATA_AGE_CYCLE__MINIMUM_CYCLE:
				setMinimumCycle((Integer)newValue);
				return;
			case AmaltheaPackage.DATA_AGE_CYCLE__MAXIMUM_CYCLE:
				setMaximumCycle((Integer)newValue);
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
			case AmaltheaPackage.DATA_AGE_CYCLE__MINIMUM_CYCLE:
				setMinimumCycle(MINIMUM_CYCLE_EDEFAULT);
				return;
			case AmaltheaPackage.DATA_AGE_CYCLE__MAXIMUM_CYCLE:
				setMaximumCycle(MAXIMUM_CYCLE_EDEFAULT);
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
			case AmaltheaPackage.DATA_AGE_CYCLE__MINIMUM_CYCLE:
				return minimumCycle != MINIMUM_CYCLE_EDEFAULT;
			case AmaltheaPackage.DATA_AGE_CYCLE__MAXIMUM_CYCLE:
				return maximumCycle != MAXIMUM_CYCLE_EDEFAULT;
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
		result.append(" (minimumCycle: ");
		result.append(minimumCycle);
		result.append(", maximumCycle: ");
		result.append(maximumCycle);
		result.append(')');
		return result.toString();
	}

} //DataAgeCycleImpl
