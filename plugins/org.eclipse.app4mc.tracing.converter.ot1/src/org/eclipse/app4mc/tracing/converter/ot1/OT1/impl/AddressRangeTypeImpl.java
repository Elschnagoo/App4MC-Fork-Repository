/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import java.math.BigInteger;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AddressRangeTypeImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AddressRangeTypeImpl#getStartAddress <em>Start Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressRangeTypeImpl extends EObjectImpl implements AddressRangeType {
	/**
	 * The default value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endAddress = END_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startAddress = START_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.ADDRESS_RANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndAddress() {
		return endAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAddress(BigInteger newEndAddress) {
		BigInteger oldEndAddress = endAddress;
		endAddress = newEndAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.ADDRESS_RANGE_TYPE__END_ADDRESS, oldEndAddress, endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartAddress() {
		return startAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAddress(BigInteger newStartAddress) {
		BigInteger oldStartAddress = startAddress;
		startAddress = newStartAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.ADDRESS_RANGE_TYPE__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.ADDRESS_RANGE_TYPE__END_ADDRESS:
				return getEndAddress();
			case OT1Package.ADDRESS_RANGE_TYPE__START_ADDRESS:
				return getStartAddress();
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
			case OT1Package.ADDRESS_RANGE_TYPE__END_ADDRESS:
				setEndAddress((BigInteger)newValue);
				return;
			case OT1Package.ADDRESS_RANGE_TYPE__START_ADDRESS:
				setStartAddress((BigInteger)newValue);
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
			case OT1Package.ADDRESS_RANGE_TYPE__END_ADDRESS:
				setEndAddress(END_ADDRESS_EDEFAULT);
				return;
			case OT1Package.ADDRESS_RANGE_TYPE__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
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
			case OT1Package.ADDRESS_RANGE_TYPE__END_ADDRESS:
				return END_ADDRESS_EDEFAULT == null ? endAddress != null : !END_ADDRESS_EDEFAULT.equals(endAddress);
			case OT1Package.ADDRESS_RANGE_TYPE__START_ADDRESS:
				return START_ADDRESS_EDEFAULT == null ? startAddress != null : !START_ADDRESS_EDEFAULT.equals(startAddress);
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
		result.append(" (endAddress: ");
		result.append(endAddress);
		result.append(", startAddress: ");
		result.append(startAddress);
		result.append(')');
		return result.toString();
	}

} //AddressRangeTypeImpl
