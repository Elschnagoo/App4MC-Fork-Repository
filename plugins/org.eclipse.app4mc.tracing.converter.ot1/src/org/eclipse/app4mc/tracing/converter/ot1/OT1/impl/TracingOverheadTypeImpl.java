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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracing Overhead Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadTypeImpl#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracingOverheadTypeImpl extends OT1TypeImpl implements TracingOverheadType {
	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType time;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TracingOverheadDescriptionEnum TYPE_EDEFAULT = TracingOverheadDescriptionEnum.TOTAL_OVERHEAD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TracingOverheadDescriptionEnum type = TYPE_EDEFAULT;

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
	protected TracingOverheadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TRACING_OVERHEAD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TimeValueType newTime, NotificationChain msgs) {
		TimeValueType oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.TRACING_OVERHEAD_TYPE__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TimeValueType newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.TRACING_OVERHEAD_TYPE__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.TRACING_OVERHEAD_TYPE__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACING_OVERHEAD_TYPE__TIME, newTime, newTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACING_OVERHEAD_TYPE__EVENT_ID, oldEventId, eventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingOverheadDescriptionEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TracingOverheadDescriptionEnum newType) {
		TracingOverheadDescriptionEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACING_OVERHEAD_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TracingOverheadDescriptionEnum oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TRACING_OVERHEAD_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.TRACING_OVERHEAD_TYPE__TIME:
				return basicSetTime(null, msgs);
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
			case OT1Package.TRACING_OVERHEAD_TYPE__TIME:
				return getTime();
			case OT1Package.TRACING_OVERHEAD_TYPE__EVENT_ID:
				return getEventId();
			case OT1Package.TRACING_OVERHEAD_TYPE__TYPE:
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
			case OT1Package.TRACING_OVERHEAD_TYPE__TIME:
				setTime((TimeValueType)newValue);
				return;
			case OT1Package.TRACING_OVERHEAD_TYPE__EVENT_ID:
				setEventId((BigInteger)newValue);
				return;
			case OT1Package.TRACING_OVERHEAD_TYPE__TYPE:
				setType((TracingOverheadDescriptionEnum)newValue);
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
			case OT1Package.TRACING_OVERHEAD_TYPE__TIME:
				setTime((TimeValueType)null);
				return;
			case OT1Package.TRACING_OVERHEAD_TYPE__EVENT_ID:
				setEventId(EVENT_ID_EDEFAULT);
				return;
			case OT1Package.TRACING_OVERHEAD_TYPE__TYPE:
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
			case OT1Package.TRACING_OVERHEAD_TYPE__TIME:
				return time != null;
			case OT1Package.TRACING_OVERHEAD_TYPE__EVENT_ID:
				return EVENT_ID_EDEFAULT == null ? eventId != null : !EVENT_ID_EDEFAULT.equals(eventId);
			case OT1Package.TRACING_OVERHEAD_TYPE__TYPE:
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
		result.append(" (eventId: ");
		result.append(eventId);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TracingOverheadTypeImpl
