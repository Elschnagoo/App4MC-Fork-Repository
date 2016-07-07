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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Chain Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainElementTypeImpl#getEventChain <em>Event Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventChainElementTypeImpl extends TimeRangeElementTypeImpl implements EventChainElementType {
	/**
	 * The cached value of the '{@link #getEventChain() <em>Event Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChain()
	 * @generated
	 * @ordered
	 */
	protected EventChainType eventChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.EVENT_CHAIN_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChainType getEventChain() {
		return eventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventChain(EventChainType newEventChain, NotificationChain msgs) {
		EventChainType oldEventChain = eventChain;
		eventChain = newEventChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN, oldEventChain, newEventChain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventChain(EventChainType newEventChain) {
		if (newEventChain != eventChain) {
			NotificationChain msgs = null;
			if (eventChain != null)
				msgs = ((InternalEObject)eventChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN, null, msgs);
			if (newEventChain != null)
				msgs = ((InternalEObject)newEventChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN, null, msgs);
			msgs = basicSetEventChain(newEventChain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN, newEventChain, newEventChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN:
				return basicSetEventChain(null, msgs);
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
			case OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN:
				return getEventChain();
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
			case OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN:
				setEventChain((EventChainType)newValue);
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
			case OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN:
				setEventChain((EventChainType)null);
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
			case OT1Package.EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN:
				return eventChain != null;
		}
		return super.eIsSet(featureID);
	}

} //EventChainElementTypeImpl
