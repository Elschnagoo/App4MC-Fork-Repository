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
import org.eclipse.app4mc.amalthea.model.LatencyConstant;
import org.eclipse.app4mc.amalthea.model.Quartz;
import org.eclipse.app4mc.amalthea.model.RWType;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyConstantImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyConstantImpl#getTransferSize <em>Transfer Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyConstantImpl#getQuartz <em>Quartz</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyConstantImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyConstantImpl extends AmaltheaExtendedEObjectImpl implements LatencyConstant {
	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final RWType ACCESS_TYPE_EDEFAULT = RWType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected RWType accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransferSize() <em>Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferSize()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSFER_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransferSize() <em>Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferSize()
	 * @generated
	 * @ordered
	 */
	protected long transferSize = TRANSFER_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuartz() <em>Quartz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuartz()
	 * @generated
	 * @ordered
	 */
	protected Quartz quartz;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLatencyConstant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWType getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(RWType newAccessType) {
		RWType oldAccessType = accessType;
		accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_CONSTANT__ACCESS_TYPE, oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransferSize() {
		return transferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferSize(long newTransferSize) {
		long oldTransferSize = transferSize;
		transferSize = newTransferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_CONSTANT__TRANSFER_SIZE, oldTransferSize, transferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz getQuartz() {
		if (quartz != null && quartz.eIsProxy()) {
			InternalEObject oldQuartz = (InternalEObject)quartz;
			quartz = (Quartz)eResolveProxy(oldQuartz);
			if (quartz != oldQuartz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LATENCY_CONSTANT__QUARTZ, oldQuartz, quartz));
			}
		}
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz basicGetQuartz() {
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuartz(Quartz newQuartz) {
		Quartz oldQuartz = quartz;
		quartz = newQuartz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_CONSTANT__QUARTZ, oldQuartz, quartz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(long newValue) {
		long oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_CONSTANT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.LATENCY_CONSTANT__ACCESS_TYPE:
				return getAccessType();
			case AmaltheaPackage.LATENCY_CONSTANT__TRANSFER_SIZE:
				return getTransferSize();
			case AmaltheaPackage.LATENCY_CONSTANT__QUARTZ:
				if (resolve) return getQuartz();
				return basicGetQuartz();
			case AmaltheaPackage.LATENCY_CONSTANT__VALUE:
				return getValue();
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
			case AmaltheaPackage.LATENCY_CONSTANT__ACCESS_TYPE:
				setAccessType((RWType)newValue);
				return;
			case AmaltheaPackage.LATENCY_CONSTANT__TRANSFER_SIZE:
				setTransferSize((Long)newValue);
				return;
			case AmaltheaPackage.LATENCY_CONSTANT__QUARTZ:
				setQuartz((Quartz)newValue);
				return;
			case AmaltheaPackage.LATENCY_CONSTANT__VALUE:
				setValue((Long)newValue);
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
			case AmaltheaPackage.LATENCY_CONSTANT__ACCESS_TYPE:
				setAccessType(ACCESS_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.LATENCY_CONSTANT__TRANSFER_SIZE:
				setTransferSize(TRANSFER_SIZE_EDEFAULT);
				return;
			case AmaltheaPackage.LATENCY_CONSTANT__QUARTZ:
				setQuartz((Quartz)null);
				return;
			case AmaltheaPackage.LATENCY_CONSTANT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case AmaltheaPackage.LATENCY_CONSTANT__ACCESS_TYPE:
				return accessType != ACCESS_TYPE_EDEFAULT;
			case AmaltheaPackage.LATENCY_CONSTANT__TRANSFER_SIZE:
				return transferSize != TRANSFER_SIZE_EDEFAULT;
			case AmaltheaPackage.LATENCY_CONSTANT__QUARTZ:
				return quartz != null;
			case AmaltheaPackage.LATENCY_CONSTANT__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(" (accessType: ");
		result.append(accessType);
		result.append(", transferSize: ");
		result.append(transferSize);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //LatencyConstantImpl
