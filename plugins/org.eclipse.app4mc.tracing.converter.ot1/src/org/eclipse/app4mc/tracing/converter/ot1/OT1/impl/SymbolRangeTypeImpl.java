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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SymbolRangeTypeImpl#getEndSymbol <em>End Symbol</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SymbolRangeTypeImpl#getStartSymbol <em>Start Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolRangeTypeImpl extends EObjectImpl implements SymbolRangeType {
	/**
	 * The default value of the '{@link #getEndSymbol() <em>End Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String END_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndSymbol() <em>End Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSymbol()
	 * @generated
	 * @ordered
	 */
	protected String endSymbol = END_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartSymbol() <em>Start Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String START_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartSymbol() <em>Start Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSymbol()
	 * @generated
	 * @ordered
	 */
	protected String startSymbol = START_SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.SYMBOL_RANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndSymbol() {
		return endSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndSymbol(String newEndSymbol) {
		String oldEndSymbol = endSymbol;
		endSymbol = newEndSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SYMBOL_RANGE_TYPE__END_SYMBOL, oldEndSymbol, endSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartSymbol() {
		return startSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartSymbol(String newStartSymbol) {
		String oldStartSymbol = startSymbol;
		startSymbol = newStartSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SYMBOL_RANGE_TYPE__START_SYMBOL, oldStartSymbol, startSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.SYMBOL_RANGE_TYPE__END_SYMBOL:
				return getEndSymbol();
			case OT1Package.SYMBOL_RANGE_TYPE__START_SYMBOL:
				return getStartSymbol();
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
			case OT1Package.SYMBOL_RANGE_TYPE__END_SYMBOL:
				setEndSymbol((String)newValue);
				return;
			case OT1Package.SYMBOL_RANGE_TYPE__START_SYMBOL:
				setStartSymbol((String)newValue);
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
			case OT1Package.SYMBOL_RANGE_TYPE__END_SYMBOL:
				setEndSymbol(END_SYMBOL_EDEFAULT);
				return;
			case OT1Package.SYMBOL_RANGE_TYPE__START_SYMBOL:
				setStartSymbol(START_SYMBOL_EDEFAULT);
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
			case OT1Package.SYMBOL_RANGE_TYPE__END_SYMBOL:
				return END_SYMBOL_EDEFAULT == null ? endSymbol != null : !END_SYMBOL_EDEFAULT.equals(endSymbol);
			case OT1Package.SYMBOL_RANGE_TYPE__START_SYMBOL:
				return START_SYMBOL_EDEFAULT == null ? startSymbol != null : !START_SYMBOL_EDEFAULT.equals(startSymbol);
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
		result.append(" (endSymbol: ");
		result.append(endSymbol);
		result.append(", startSymbol: ");
		result.append(startSymbol);
		result.append(')');
		return result.toString();
	}

} //SymbolRangeTypeImpl
