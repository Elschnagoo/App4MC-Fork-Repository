/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *     Generated using Eclipse EMF
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Range Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeRangeElementTypeImpl#getLatency <em>Latency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeRangeElementTypeImpl extends VirtualElementTypeImpl implements TimeRangeElementType {
	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final LatencyTypeEnum LATENCY_EDEFAULT = LatencyTypeEnum.AGE;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected LatencyTypeEnum latency = LATENCY_EDEFAULT;

	/**
	 * This is true if the Latency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean latencyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRangeElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TIME_RANGE_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyTypeEnum getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(LatencyTypeEnum newLatency) {
		LatencyTypeEnum oldLatency = latency;
		latency = newLatency == null ? LATENCY_EDEFAULT : newLatency;
		boolean oldLatencyESet = latencyESet;
		latencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIME_RANGE_ELEMENT_TYPE__LATENCY, oldLatency, latency, !oldLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLatency() {
		LatencyTypeEnum oldLatency = latency;
		boolean oldLatencyESet = latencyESet;
		latency = LATENCY_EDEFAULT;
		latencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TIME_RANGE_ELEMENT_TYPE__LATENCY, oldLatency, LATENCY_EDEFAULT, oldLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLatency() {
		return latencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.TIME_RANGE_ELEMENT_TYPE__LATENCY:
				return getLatency();
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
			case OT1Package.TIME_RANGE_ELEMENT_TYPE__LATENCY:
				setLatency((LatencyTypeEnum)newValue);
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
			case OT1Package.TIME_RANGE_ELEMENT_TYPE__LATENCY:
				unsetLatency();
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
			case OT1Package.TIME_RANGE_ELEMENT_TYPE__LATENCY:
				return isSetLatency();
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
		result.append(" (latency: ");
		if (latencyESet) result.append(latency); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimeRangeElementTypeImpl
