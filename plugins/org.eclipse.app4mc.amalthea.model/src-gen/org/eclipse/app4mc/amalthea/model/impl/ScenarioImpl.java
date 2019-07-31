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
import org.eclipse.app4mc.amalthea.model.Clock;
import org.eclipse.app4mc.amalthea.model.Scenario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ScenarioImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ScenarioImpl#getSamplingOffset <em>Sampling Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ScenarioImpl#getSamplingRecurrence <em>Sampling Recurrence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends BaseObjectImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected Clock clock;

	/**
	 * The default value of the '{@link #getSamplingOffset() <em>Sampling Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double SAMPLING_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSamplingOffset() <em>Sampling Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingOffset()
	 * @generated
	 * @ordered
	 */
	protected double samplingOffset = SAMPLING_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplingRecurrence() <em>Sampling Recurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRecurrence()
	 * @generated
	 * @ordered
	 */
	protected static final double SAMPLING_RECURRENCE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSamplingRecurrence() <em>Sampling Recurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRecurrence()
	 * @generated
	 * @ordered
	 */
	protected double samplingRecurrence = SAMPLING_RECURRENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getScenario();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (Clock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SCENARIO__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClock(Clock newClock) {
		Clock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCENARIO__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSamplingOffset() {
		return samplingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamplingOffset(double newSamplingOffset) {
		double oldSamplingOffset = samplingOffset;
		samplingOffset = newSamplingOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCENARIO__SAMPLING_OFFSET, oldSamplingOffset, samplingOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSamplingRecurrence() {
		return samplingRecurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamplingRecurrence(double newSamplingRecurrence) {
		double oldSamplingRecurrence = samplingRecurrence;
		samplingRecurrence = newSamplingRecurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCENARIO__SAMPLING_RECURRENCE, oldSamplingRecurrence, samplingRecurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.SCENARIO__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case AmaltheaPackage.SCENARIO__SAMPLING_OFFSET:
				return getSamplingOffset();
			case AmaltheaPackage.SCENARIO__SAMPLING_RECURRENCE:
				return getSamplingRecurrence();
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
			case AmaltheaPackage.SCENARIO__CLOCK:
				setClock((Clock)newValue);
				return;
			case AmaltheaPackage.SCENARIO__SAMPLING_OFFSET:
				setSamplingOffset((Double)newValue);
				return;
			case AmaltheaPackage.SCENARIO__SAMPLING_RECURRENCE:
				setSamplingRecurrence((Double)newValue);
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
			case AmaltheaPackage.SCENARIO__CLOCK:
				setClock((Clock)null);
				return;
			case AmaltheaPackage.SCENARIO__SAMPLING_OFFSET:
				setSamplingOffset(SAMPLING_OFFSET_EDEFAULT);
				return;
			case AmaltheaPackage.SCENARIO__SAMPLING_RECURRENCE:
				setSamplingRecurrence(SAMPLING_RECURRENCE_EDEFAULT);
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
			case AmaltheaPackage.SCENARIO__CLOCK:
				return clock != null;
			case AmaltheaPackage.SCENARIO__SAMPLING_OFFSET:
				return samplingOffset != SAMPLING_OFFSET_EDEFAULT;
			case AmaltheaPackage.SCENARIO__SAMPLING_RECURRENCE:
				return samplingRecurrence != SAMPLING_RECURRENCE_EDEFAULT;
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
		result.append(" (samplingOffset: ");
		result.append(samplingOffset);
		result.append(", samplingRecurrence: ");
		result.append(samplingRecurrence);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
