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
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceEntryTypeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceEntryTypeImpl#getElementRefId <em>Element Ref Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceEntryTypeImpl#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceEntryTypeImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceEntryTypeImpl extends EObjectImpl implements TraceEntryType {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementRefId() <em>Element Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementRefId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ELEMENT_REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementRefId() <em>Element Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementRefId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger elementRefId = ELEMENT_REF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger eventId = EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected BigInteger time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TRACE_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACE_ENTRY_TYPE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getElementRefId() {
		return elementRefId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementRefId(BigInteger newElementRefId) {
		BigInteger oldElementRefId = elementRefId;
		elementRefId = newElementRefId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACE_ENTRY_TYPE__ELEMENT_REF_ID, oldElementRefId, elementRefId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEventId() {
		return eventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventId(BigInteger newEventId) {
		BigInteger oldEventId = eventId;
		eventId = newEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACE_ENTRY_TYPE__EVENT_ID, oldEventId, eventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(BigInteger newTime) {
		BigInteger oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACE_ENTRY_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.TRACE_ENTRY_TYPE__DATA:
				return getData();
			case OT1Package.TRACE_ENTRY_TYPE__ELEMENT_REF_ID:
				return getElementRefId();
			case OT1Package.TRACE_ENTRY_TYPE__EVENT_ID:
				return getEventId();
			case OT1Package.TRACE_ENTRY_TYPE__TIME:
				return getTime();
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
			case OT1Package.TRACE_ENTRY_TYPE__DATA:
				setData((String)newValue);
				return;
			case OT1Package.TRACE_ENTRY_TYPE__ELEMENT_REF_ID:
				setElementRefId((BigInteger)newValue);
				return;
			case OT1Package.TRACE_ENTRY_TYPE__EVENT_ID:
				setEventId((BigInteger)newValue);
				return;
			case OT1Package.TRACE_ENTRY_TYPE__TIME:
				setTime((BigInteger)newValue);
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
			case OT1Package.TRACE_ENTRY_TYPE__DATA:
				setData(DATA_EDEFAULT);
				return;
			case OT1Package.TRACE_ENTRY_TYPE__ELEMENT_REF_ID:
				setElementRefId(ELEMENT_REF_ID_EDEFAULT);
				return;
			case OT1Package.TRACE_ENTRY_TYPE__EVENT_ID:
				setEventId(EVENT_ID_EDEFAULT);
				return;
			case OT1Package.TRACE_ENTRY_TYPE__TIME:
				setTime(TIME_EDEFAULT);
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
			case OT1Package.TRACE_ENTRY_TYPE__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case OT1Package.TRACE_ENTRY_TYPE__ELEMENT_REF_ID:
				return ELEMENT_REF_ID_EDEFAULT == null ? elementRefId != null : !ELEMENT_REF_ID_EDEFAULT.equals(elementRefId);
			case OT1Package.TRACE_ENTRY_TYPE__EVENT_ID:
				return EVENT_ID_EDEFAULT == null ? eventId != null : !EVENT_ID_EDEFAULT.equals(eventId);
			case OT1Package.TRACE_ENTRY_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
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
		result.append(" (data: ");
		result.append(data);
		result.append(", elementRefId: ");
		result.append(elementRefId);
		result.append(", eventId: ");
		result.append(eventId);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //TraceEntryTypeImpl
