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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.SchedulingParameters;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulingParametersImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulingParametersImpl#getMinBudget <em>Min Budget</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulingParametersImpl#getMaxBudget <em>Max Budget</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulingParametersImpl#getReplenishment <em>Replenishment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingParametersImpl extends AmaltheaExtendedEObjectImpl implements SchedulingParameters {
	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMinBudget() <em>Min Budget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBudget()
	 * @generated
	 * @ordered
	 */
	protected Time minBudget;

	/**
	 * The cached value of the '{@link #getMaxBudget() <em>Max Budget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBudget()
	 * @generated
	 * @ordered
	 */
	protected Time maxBudget;

	/**
	 * The cached value of the '{@link #getReplenishment() <em>Replenishment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishment()
	 * @generated
	 * @ordered
	 */
	protected Time replenishment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSchedulingParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULING_PARAMETERS__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMinBudget() {
		return minBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinBudget(Time newMinBudget, NotificationChain msgs) {
		Time oldMinBudget = minBudget;
		minBudget = newMinBudget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET, oldMinBudget, newMinBudget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinBudget(Time newMinBudget) {
		if (newMinBudget != minBudget) {
			NotificationChain msgs = null;
			if (minBudget != null)
				msgs = ((InternalEObject)minBudget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET, null, msgs);
			if (newMinBudget != null)
				msgs = ((InternalEObject)newMinBudget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET, null, msgs);
			msgs = basicSetMinBudget(newMinBudget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET, newMinBudget, newMinBudget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMaxBudget() {
		return maxBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxBudget(Time newMaxBudget, NotificationChain msgs) {
		Time oldMaxBudget = maxBudget;
		maxBudget = newMaxBudget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET, oldMaxBudget, newMaxBudget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBudget(Time newMaxBudget) {
		if (newMaxBudget != maxBudget) {
			NotificationChain msgs = null;
			if (maxBudget != null)
				msgs = ((InternalEObject)maxBudget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET, null, msgs);
			if (newMaxBudget != null)
				msgs = ((InternalEObject)newMaxBudget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET, null, msgs);
			msgs = basicSetMaxBudget(newMaxBudget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET, newMaxBudget, newMaxBudget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getReplenishment() {
		return replenishment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplenishment(Time newReplenishment, NotificationChain msgs) {
		Time oldReplenishment = replenishment;
		replenishment = newReplenishment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT, oldReplenishment, newReplenishment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplenishment(Time newReplenishment) {
		if (newReplenishment != replenishment) {
			NotificationChain msgs = null;
			if (replenishment != null)
				msgs = ((InternalEObject)replenishment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT, null, msgs);
			if (newReplenishment != null)
				msgs = ((InternalEObject)newReplenishment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT, null, msgs);
			msgs = basicSetReplenishment(newReplenishment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT, newReplenishment, newReplenishment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET:
				return basicSetMinBudget(null, msgs);
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET:
				return basicSetMaxBudget(null, msgs);
			case AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT:
				return basicSetReplenishment(null, msgs);
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
			case AmaltheaPackage.SCHEDULING_PARAMETERS__PRIORITY:
				return getPriority();
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET:
				return getMinBudget();
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET:
				return getMaxBudget();
			case AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT:
				return getReplenishment();
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
			case AmaltheaPackage.SCHEDULING_PARAMETERS__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET:
				setMinBudget((Time)newValue);
				return;
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET:
				setMaxBudget((Time)newValue);
				return;
			case AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT:
				setReplenishment((Time)newValue);
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
			case AmaltheaPackage.SCHEDULING_PARAMETERS__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET:
				setMinBudget((Time)null);
				return;
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET:
				setMaxBudget((Time)null);
				return;
			case AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT:
				setReplenishment((Time)null);
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
			case AmaltheaPackage.SCHEDULING_PARAMETERS__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MIN_BUDGET:
				return minBudget != null;
			case AmaltheaPackage.SCHEDULING_PARAMETERS__MAX_BUDGET:
				return maxBudget != null;
			case AmaltheaPackage.SCHEDULING_PARAMETERS__REPLENISHMENT:
				return replenishment != null;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //SchedulingParametersImpl
