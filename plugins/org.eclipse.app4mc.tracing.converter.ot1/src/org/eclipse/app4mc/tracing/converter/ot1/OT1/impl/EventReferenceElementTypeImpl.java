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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Reference Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceElementTypeImpl#getEventReference <em>Event Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventReferenceElementTypeImpl extends TimeStampElementTypeImpl implements EventReferenceElementType {
	/**
	 * The cached value of the '{@link #getEventReference() <em>Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventReference()
	 * @generated
	 * @ordered
	 */
	protected EventReferenceType eventReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventReferenceElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.EVENT_REFERENCE_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReferenceType getEventReference() {
		return eventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventReference(EventReferenceType newEventReference, NotificationChain msgs) {
		EventReferenceType oldEventReference = eventReference;
		eventReference = newEventReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE, oldEventReference, newEventReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventReference(EventReferenceType newEventReference) {
		if (newEventReference != eventReference) {
			NotificationChain msgs = null;
			if (eventReference != null)
				msgs = ((InternalEObject)eventReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE, null, msgs);
			if (newEventReference != null)
				msgs = ((InternalEObject)newEventReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE, null, msgs);
			msgs = basicSetEventReference(newEventReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE, newEventReference, newEventReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE:
				return basicSetEventReference(null, msgs);
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
			case OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE:
				return getEventReference();
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
			case OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE:
				setEventReference((EventReferenceType)newValue);
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
			case OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE:
				setEventReference((EventReferenceType)null);
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
			case OT1Package.EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE:
				return eventReference != null;
		}
		return super.eIsSet(featureID);
	}

} //EventReferenceElementTypeImpl
