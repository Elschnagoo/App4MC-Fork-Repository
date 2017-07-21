/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CustomEvent;
import org.eclipse.app4mc.amalthea.model.CustomEventTrigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CustomEventTriggerImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CustomEventTriggerImpl#getEventLinkInt <em>Event Link Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomEventTriggerImpl extends RunnableItemImpl implements CustomEventTrigger {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected CustomEvent event;

	/**
	 * The cached value of the '{@link #getEventLinkInt() <em>Event Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventLinkInt()
	 * @generated
	 * @ordered
	 */
	protected CustomEvent eventLinkInt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomEventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCustomEventTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (CustomEvent)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(CustomEvent newEvent) {
		CustomEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT, oldEvent, event));
 		//Additional setting transient value for transient bi-directional reference
 		setEventLinkInt(newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent getEventLinkInt() {
		if (eventLinkInt != null && eventLinkInt.eIsProxy()) {
			InternalEObject oldEventLinkInt = (InternalEObject)eventLinkInt;
			eventLinkInt = (CustomEvent)eResolveProxy(oldEventLinkInt);
			if (eventLinkInt != oldEventLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT, oldEventLinkInt, eventLinkInt));
			}
		}
		return eventLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent basicGetEventLinkInt() {
		return eventLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventLinkInt(CustomEvent newEventLinkInt, NotificationChain msgs) {
		CustomEvent oldEventLinkInt = eventLinkInt;
		eventLinkInt = newEventLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT, oldEventLinkInt, newEventLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventLinkInt(CustomEvent newEventLinkInt) {
		if (newEventLinkInt != eventLinkInt) {
			NotificationChain msgs = null;
			if (eventLinkInt != null)
				msgs = ((InternalEObject)eventLinkInt).eInverseRemove(this, AmaltheaPackage.CUSTOM_EVENT__EXPLICIT_TRIGGERS, CustomEvent.class, msgs);
			if (newEventLinkInt != null)
				msgs = ((InternalEObject)newEventLinkInt).eInverseAdd(this, AmaltheaPackage.CUSTOM_EVENT__EXPLICIT_TRIGGERS, CustomEvent.class, msgs);
			msgs = basicSetEventLinkInt(newEventLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT, newEventLinkInt, newEventLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT:
				if (eventLinkInt != null)
					msgs = ((InternalEObject)eventLinkInt).eInverseRemove(this, AmaltheaPackage.CUSTOM_EVENT__EXPLICIT_TRIGGERS, CustomEvent.class, msgs);
				return basicSetEventLinkInt((CustomEvent)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT:
				return basicSetEventLinkInt(null, msgs);
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
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT:
				if (resolve) return getEventLinkInt();
				return basicGetEventLinkInt();
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
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT:
				setEvent((CustomEvent)newValue);
				return;
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT:
				setEventLinkInt((CustomEvent)newValue);
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
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT:
				setEvent((CustomEvent)null);
				return;
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT:
				setEventLinkInt((CustomEvent)null);
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
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT:
				return event != null;
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT:
				return eventLinkInt != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomEventTriggerImpl
