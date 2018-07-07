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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Order Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ExecutionOrderConstraintTypeImpl#getEventChainId <em>Event Chain Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ExecutionOrderConstraintTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionOrderConstraintTypeImpl extends TimingConstraintElementTypeImpl implements ExecutionOrderConstraintType {
	/**
	 * The default value of the '{@link #getEventChainId() <em>Event Chain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChainId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EVENT_CHAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventChainId() <em>Event Chain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChainId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger eventChainId = EVENT_CHAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionOrderConstraintTypeEnum TYPE_EDEFAULT = ExecutionOrderConstraintTypeEnum.TOTAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExecutionOrderConstraintTypeEnum type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionOrderConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.EXECUTION_ORDER_CONSTRAINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEventChainId() {
		return eventChainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventChainId(BigInteger newEventChainId) {
		BigInteger oldEventChainId = eventChainId;
		eventChainId = newEventChainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__EVENT_CHAIN_ID, oldEventChainId, eventChainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOrderConstraintTypeEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExecutionOrderConstraintTypeEnum newType) {
		ExecutionOrderConstraintTypeEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		ExecutionOrderConstraintTypeEnum oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__EVENT_CHAIN_ID:
				return getEventChainId();
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE:
				return getType();
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
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__EVENT_CHAIN_ID:
				setEventChainId((BigInteger)newValue);
				return;
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE:
				setType((ExecutionOrderConstraintTypeEnum)newValue);
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
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__EVENT_CHAIN_ID:
				setEventChainId(EVENT_CHAIN_ID_EDEFAULT);
				return;
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE:
				unsetType();
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
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__EVENT_CHAIN_ID:
				return EVENT_CHAIN_ID_EDEFAULT == null ? eventChainId != null : !EVENT_CHAIN_ID_EDEFAULT.equals(eventChainId);
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE:
				return isSetType();
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
		result.append(" (eventChainId: ");
		result.append(eventChainId);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ExecutionOrderConstraintTypeImpl
