/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.EventMask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clear Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClearEventImpl#getEventMask <em>Event Mask</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClearEventImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearEventImpl extends CallGraphItemImpl implements ClearEvent {
	/**
	 * The cached value of the '{@link #getEventMask() <em>Event Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventMask()
	 * @generated
	 * @ordered
	 */
	protected EventMask eventMask;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Counter counter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getClearEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventMask getEventMask() {
		return eventMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventMask(EventMask newEventMask, NotificationChain msgs) {
		EventMask oldEventMask = eventMask;
		eventMask = newEventMask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLEAR_EVENT__EVENT_MASK, oldEventMask, newEventMask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventMask(EventMask newEventMask) {
		if (newEventMask != eventMask) {
			NotificationChain msgs = null;
			if (eventMask != null)
				msgs = ((InternalEObject)eventMask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLEAR_EVENT__EVENT_MASK, null, msgs);
			if (newEventMask != null)
				msgs = ((InternalEObject)newEventMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLEAR_EVENT__EVENT_MASK, null, msgs);
			msgs = basicSetEventMask(newEventMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLEAR_EVENT__EVENT_MASK, newEventMask, newEventMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounter(Counter newCounter, NotificationChain msgs) {
		Counter oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLEAR_EVENT__COUNTER, oldCounter, newCounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounter(Counter newCounter) {
		if (newCounter != counter) {
			NotificationChain msgs = null;
			if (counter != null)
				msgs = ((InternalEObject)counter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLEAR_EVENT__COUNTER, null, msgs);
			if (newCounter != null)
				msgs = ((InternalEObject)newCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLEAR_EVENT__COUNTER, null, msgs);
			msgs = basicSetCounter(newCounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLEAR_EVENT__COUNTER, newCounter, newCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CLEAR_EVENT__EVENT_MASK:
				return basicSetEventMask(null, msgs);
			case AmaltheaPackage.CLEAR_EVENT__COUNTER:
				return basicSetCounter(null, msgs);
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
			case AmaltheaPackage.CLEAR_EVENT__EVENT_MASK:
				return getEventMask();
			case AmaltheaPackage.CLEAR_EVENT__COUNTER:
				return getCounter();
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
			case AmaltheaPackage.CLEAR_EVENT__EVENT_MASK:
				setEventMask((EventMask)newValue);
				return;
			case AmaltheaPackage.CLEAR_EVENT__COUNTER:
				setCounter((Counter)newValue);
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
			case AmaltheaPackage.CLEAR_EVENT__EVENT_MASK:
				setEventMask((EventMask)null);
				return;
			case AmaltheaPackage.CLEAR_EVENT__COUNTER:
				setCounter((Counter)null);
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
			case AmaltheaPackage.CLEAR_EVENT__EVENT_MASK:
				return eventMask != null;
			case AmaltheaPackage.CLEAR_EVENT__COUNTER:
				return counter != null;
		}
		return super.eIsSet(featureID);
	}

} //ClearEventImpl
