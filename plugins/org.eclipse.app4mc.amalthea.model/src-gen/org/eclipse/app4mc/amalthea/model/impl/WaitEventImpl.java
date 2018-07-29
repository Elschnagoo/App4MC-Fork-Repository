/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.WaitEventType;
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wait Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl#getEventMask <em>Event Mask</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl#getMaskType <em>Mask Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl#getWaitingBehaviour <em>Waiting Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaitEventImpl extends CallSequenceItemImpl implements WaitEvent {
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
	 * The default value of the '{@link #getMaskType() <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskType()
	 * @generated
	 * @ordered
	 */
	protected static final WaitEventType MASK_TYPE_EDEFAULT = WaitEventType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMaskType() <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskType()
	 * @generated
	 * @ordered
	 */
	protected WaitEventType maskType = MASK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingBehaviour() <em>Waiting Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final WaitingBehaviour WAITING_BEHAVIOUR_EDEFAULT = WaitingBehaviour._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getWaitingBehaviour() <em>Waiting Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingBehaviour()
	 * @generated
	 * @ordered
	 */
	protected WaitingBehaviour waitingBehaviour = WAITING_BEHAVIOUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getWaitEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.WAIT_EVENT__EVENT_MASK, oldEventMask, newEventMask);
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
				msgs = ((InternalEObject)eventMask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.WAIT_EVENT__EVENT_MASK, null, msgs);
			if (newEventMask != null)
				msgs = ((InternalEObject)newEventMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.WAIT_EVENT__EVENT_MASK, null, msgs);
			msgs = basicSetEventMask(newEventMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.WAIT_EVENT__EVENT_MASK, newEventMask, newEventMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitEventType getMaskType() {
		return maskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskType(WaitEventType newMaskType) {
		WaitEventType oldMaskType = maskType;
		maskType = newMaskType == null ? MASK_TYPE_EDEFAULT : newMaskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.WAIT_EVENT__MASK_TYPE, oldMaskType, maskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitingBehaviour getWaitingBehaviour() {
		return waitingBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitingBehaviour(WaitingBehaviour newWaitingBehaviour) {
		WaitingBehaviour oldWaitingBehaviour = waitingBehaviour;
		waitingBehaviour = newWaitingBehaviour == null ? WAITING_BEHAVIOUR_EDEFAULT : newWaitingBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.WAIT_EVENT__WAITING_BEHAVIOUR, oldWaitingBehaviour, waitingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.WAIT_EVENT__EVENT_MASK:
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
			case AmaltheaPackage.WAIT_EVENT__EVENT_MASK:
				return getEventMask();
			case AmaltheaPackage.WAIT_EVENT__MASK_TYPE:
				return getMaskType();
			case AmaltheaPackage.WAIT_EVENT__WAITING_BEHAVIOUR:
				return getWaitingBehaviour();
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
			case AmaltheaPackage.WAIT_EVENT__EVENT_MASK:
				setEventMask((EventMask)newValue);
				return;
			case AmaltheaPackage.WAIT_EVENT__MASK_TYPE:
				setMaskType((WaitEventType)newValue);
				return;
			case AmaltheaPackage.WAIT_EVENT__WAITING_BEHAVIOUR:
				setWaitingBehaviour((WaitingBehaviour)newValue);
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
			case AmaltheaPackage.WAIT_EVENT__EVENT_MASK:
				setEventMask((EventMask)null);
				return;
			case AmaltheaPackage.WAIT_EVENT__MASK_TYPE:
				setMaskType(MASK_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.WAIT_EVENT__WAITING_BEHAVIOUR:
				setWaitingBehaviour(WAITING_BEHAVIOUR_EDEFAULT);
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
			case AmaltheaPackage.WAIT_EVENT__EVENT_MASK:
				return eventMask != null;
			case AmaltheaPackage.WAIT_EVENT__MASK_TYPE:
				return maskType != MASK_TYPE_EDEFAULT;
			case AmaltheaPackage.WAIT_EVENT__WAITING_BEHAVIOUR:
				return waitingBehaviour != WAITING_BEHAVIOUR_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (maskType: ");
		result.append(maskType);
		result.append(", waitingBehaviour: ");
		result.append(waitingBehaviour);
		result.append(')');
		return result.toString();
	}

} //WaitEventImpl
