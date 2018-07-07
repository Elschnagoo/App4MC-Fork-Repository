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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Range Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataRangeElementTypeImpl#getAddressRange <em>Address Range</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataRangeElementTypeImpl#getSymbolRange <em>Symbol Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRangeElementTypeImpl extends DataElementTypeImpl implements DataRangeElementType {
	/**
	 * The cached value of the '{@link #getAddressRange() <em>Address Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressRange()
	 * @generated
	 * @ordered
	 */
	protected AddressRangeType addressRange;

	/**
	 * The cached value of the '{@link #getSymbolRange() <em>Symbol Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolRange()
	 * @generated
	 * @ordered
	 */
	protected SymbolRangeType symbolRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRangeElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.DATA_RANGE_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressRangeType getAddressRange() {
		return addressRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressRange(AddressRangeType newAddressRange, NotificationChain msgs) {
		AddressRangeType oldAddressRange = addressRange;
		addressRange = newAddressRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE, oldAddressRange, newAddressRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressRange(AddressRangeType newAddressRange) {
		if (newAddressRange != addressRange) {
			NotificationChain msgs = null;
			if (addressRange != null)
				msgs = ((InternalEObject)addressRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE, null, msgs);
			if (newAddressRange != null)
				msgs = ((InternalEObject)newAddressRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE, null, msgs);
			msgs = basicSetAddressRange(newAddressRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE, newAddressRange, newAddressRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolRangeType getSymbolRange() {
		return symbolRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbolRange(SymbolRangeType newSymbolRange, NotificationChain msgs) {
		SymbolRangeType oldSymbolRange = symbolRange;
		symbolRange = newSymbolRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE, oldSymbolRange, newSymbolRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolRange(SymbolRangeType newSymbolRange) {
		if (newSymbolRange != symbolRange) {
			NotificationChain msgs = null;
			if (symbolRange != null)
				msgs = ((InternalEObject)symbolRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE, null, msgs);
			if (newSymbolRange != null)
				msgs = ((InternalEObject)newSymbolRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE, null, msgs);
			msgs = basicSetSymbolRange(newSymbolRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE, newSymbolRange, newSymbolRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE:
				return basicSetAddressRange(null, msgs);
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE:
				return basicSetSymbolRange(null, msgs);
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
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE:
				return getAddressRange();
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE:
				return getSymbolRange();
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
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE:
				setAddressRange((AddressRangeType)newValue);
				return;
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE:
				setSymbolRange((SymbolRangeType)newValue);
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
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE:
				setAddressRange((AddressRangeType)null);
				return;
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE:
				setSymbolRange((SymbolRangeType)null);
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
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE:
				return addressRange != null;
			case OT1Package.DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE:
				return symbolRange != null;
		}
		return super.eIsSet(featureID);
	}

} //DataRangeElementTypeImpl
