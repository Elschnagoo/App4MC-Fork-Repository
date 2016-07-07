/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.SetEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SetEventImpl#getEventMask <em>Event Mask</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SetEventImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetEventImpl extends CallSequenceItemImpl implements SetEvent {
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
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Process process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSetEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMask getEventMask() {
		if (eventMask != null && eventMask.eIsProxy()) {
			InternalEObject oldEventMask = (InternalEObject)eventMask;
			eventMask = (EventMask)eResolveProxy(oldEventMask);
			if (eventMask != oldEventMask) {
				InternalEObject newEventMask = (InternalEObject)eventMask;
				NotificationChain msgs = oldEventMask.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SET_EVENT__EVENT_MASK, null, null);
				if (newEventMask.eInternalContainer() == null) {
					msgs = newEventMask.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SET_EVENT__EVENT_MASK, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SET_EVENT__EVENT_MASK, oldEventMask, eventMask));
			}
		}
		return eventMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMask basicGetEventMask() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SET_EVENT__EVENT_MASK, oldEventMask, newEventMask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventMask(EventMask newEventMask) {
		if (newEventMask != eventMask) {
			NotificationChain msgs = null;
			if (eventMask != null)
				msgs = ((InternalEObject)eventMask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SET_EVENT__EVENT_MASK, null, msgs);
			if (newEventMask != null)
				msgs = ((InternalEObject)newEventMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SET_EVENT__EVENT_MASK, null, msgs);
			msgs = basicSetEventMask(newEventMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SET_EVENT__EVENT_MASK, newEventMask, newEventMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Process getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (org.eclipse.app4mc.amalthea.model.Process)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SET_EVENT__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Process basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(org.eclipse.app4mc.amalthea.model.Process newProcess) {
		org.eclipse.app4mc.amalthea.model.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SET_EVENT__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SET_EVENT__EVENT_MASK:
				return basicSetEventMask(null, msgs);
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
			case AmaltheaPackage.SET_EVENT__EVENT_MASK:
				if (resolve) return getEventMask();
				return basicGetEventMask();
			case AmaltheaPackage.SET_EVENT__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
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
			case AmaltheaPackage.SET_EVENT__EVENT_MASK:
				setEventMask((EventMask)newValue);
				return;
			case AmaltheaPackage.SET_EVENT__PROCESS:
				setProcess((org.eclipse.app4mc.amalthea.model.Process)newValue);
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
			case AmaltheaPackage.SET_EVENT__EVENT_MASK:
				setEventMask((EventMask)null);
				return;
			case AmaltheaPackage.SET_EVENT__PROCESS:
				setProcess((org.eclipse.app4mc.amalthea.model.Process)null);
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
			case AmaltheaPackage.SET_EVENT__EVENT_MASK:
				return eventMask != null;
			case AmaltheaPackage.SET_EVENT__PROCESS:
				return process != null;
		}
		return super.eIsSet(featureID);
	}

} //SetEventImpl
