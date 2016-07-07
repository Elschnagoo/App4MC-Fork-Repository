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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceTypeImpl#getElementRefId <em>Element Ref Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceTypeImpl#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventReferenceTypeImpl extends OT1TypeImpl implements EventReferenceType {
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
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final EventTypeEnum EVENT_TYPE_EDEFAULT = EventTypeEnum.SCHED_ACTIVATION;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected EventTypeEnum eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Event Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.EVENT_REFERENCE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_REFERENCE_TYPE__ELEMENT_REF_ID, oldElementRefId, elementRefId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeEnum getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(EventTypeEnum newEventType) {
		EventTypeEnum oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		boolean oldEventTypeESet = eventTypeESet;
		eventTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_REFERENCE_TYPE__EVENT_TYPE, oldEventType, eventType, !oldEventTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventType() {
		EventTypeEnum oldEventType = eventType;
		boolean oldEventTypeESet = eventTypeESet;
		eventType = EVENT_TYPE_EDEFAULT;
		eventTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.EVENT_REFERENCE_TYPE__EVENT_TYPE, oldEventType, EVENT_TYPE_EDEFAULT, oldEventTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventType() {
		return eventTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.EVENT_REFERENCE_TYPE__ELEMENT_REF_ID:
				return getElementRefId();
			case OT1Package.EVENT_REFERENCE_TYPE__EVENT_TYPE:
				return getEventType();
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
			case OT1Package.EVENT_REFERENCE_TYPE__ELEMENT_REF_ID:
				setElementRefId((BigInteger)newValue);
				return;
			case OT1Package.EVENT_REFERENCE_TYPE__EVENT_TYPE:
				setEventType((EventTypeEnum)newValue);
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
			case OT1Package.EVENT_REFERENCE_TYPE__ELEMENT_REF_ID:
				setElementRefId(ELEMENT_REF_ID_EDEFAULT);
				return;
			case OT1Package.EVENT_REFERENCE_TYPE__EVENT_TYPE:
				unsetEventType();
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
			case OT1Package.EVENT_REFERENCE_TYPE__ELEMENT_REF_ID:
				return ELEMENT_REF_ID_EDEFAULT == null ? elementRefId != null : !ELEMENT_REF_ID_EDEFAULT.equals(elementRefId);
			case OT1Package.EVENT_REFERENCE_TYPE__EVENT_TYPE:
				return isSetEventType();
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
		result.append(" (elementRefId: ");
		result.append(elementRefId);
		result.append(", eventType: ");
		if (eventTypeESet) result.append(eventType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EventReferenceTypeImpl
