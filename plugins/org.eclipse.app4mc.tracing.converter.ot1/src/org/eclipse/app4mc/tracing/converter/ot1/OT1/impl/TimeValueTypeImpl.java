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

import java.math.BigInteger;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeValueTypeImpl#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeValueTypeImpl#getNominator <em>Nominator</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeValueTypeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeValueTypeImpl extends EObjectImpl implements TimeValueType {
	/**
	 * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DENOMINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger denominator = DENOMINATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominator() <em>Nominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NOMINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominator() <em>Nominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nominator = NOMINATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeBaseEnum UNIT_EDEFAULT = TimeBaseEnum.S;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeBaseEnum unit = UNIT_EDEFAULT;

	/**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TIME_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(BigInteger newDenominator) {
		BigInteger oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIME_VALUE_TYPE__DENOMINATOR, oldDenominator, denominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNominator() {
		return nominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominator(BigInteger newNominator) {
		BigInteger oldNominator = nominator;
		nominator = newNominator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIME_VALUE_TYPE__NOMINATOR, oldNominator, nominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBaseEnum getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeBaseEnum newUnit) {
		TimeBaseEnum oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIME_VALUE_TYPE__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		TimeBaseEnum oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TIME_VALUE_TYPE__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.TIME_VALUE_TYPE__DENOMINATOR:
				return getDenominator();
			case OT1Package.TIME_VALUE_TYPE__NOMINATOR:
				return getNominator();
			case OT1Package.TIME_VALUE_TYPE__UNIT:
				return getUnit();
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
			case OT1Package.TIME_VALUE_TYPE__DENOMINATOR:
				setDenominator((BigInteger)newValue);
				return;
			case OT1Package.TIME_VALUE_TYPE__NOMINATOR:
				setNominator((BigInteger)newValue);
				return;
			case OT1Package.TIME_VALUE_TYPE__UNIT:
				setUnit((TimeBaseEnum)newValue);
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
			case OT1Package.TIME_VALUE_TYPE__DENOMINATOR:
				setDenominator(DENOMINATOR_EDEFAULT);
				return;
			case OT1Package.TIME_VALUE_TYPE__NOMINATOR:
				setNominator(NOMINATOR_EDEFAULT);
				return;
			case OT1Package.TIME_VALUE_TYPE__UNIT:
				unsetUnit();
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
			case OT1Package.TIME_VALUE_TYPE__DENOMINATOR:
				return DENOMINATOR_EDEFAULT == null ? denominator != null : !DENOMINATOR_EDEFAULT.equals(denominator);
			case OT1Package.TIME_VALUE_TYPE__NOMINATOR:
				return NOMINATOR_EDEFAULT == null ? nominator != null : !NOMINATOR_EDEFAULT.equals(nominator);
			case OT1Package.TIME_VALUE_TYPE__UNIT:
				return isSetUnit();
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
		result.append(" (denominator: ");
		result.append(denominator);
		result.append(", nominator: ");
		result.append(nominator);
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimeValueTypeImpl
