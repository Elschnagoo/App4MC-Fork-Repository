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
import org.eclipse.app4mc.amalthea.model.EventChainContainer;
import org.eclipse.app4mc.amalthea.model.SubEventChain;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Chain Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventChainContainerImpl#getEventChain <em>Event Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventChainContainerImpl extends EventChainItemImpl implements EventChainContainer {
	/**
	 * The cached value of the '{@link #getEventChain() <em>Event Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChain()
	 * @generated
	 * @ordered
	 */
	protected SubEventChain eventChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getEventChainContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubEventChain getEventChain() {
		return eventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventChain(SubEventChain newEventChain, NotificationChain msgs) {
		SubEventChain oldEventChain = eventChain;
		eventChain = newEventChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN, oldEventChain, newEventChain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventChain(SubEventChain newEventChain) {
		if (newEventChain != eventChain) {
			NotificationChain msgs = null;
			if (eventChain != null)
				msgs = ((InternalEObject)eventChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN, null, msgs);
			if (newEventChain != null)
				msgs = ((InternalEObject)newEventChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN, null, msgs);
			msgs = basicSetEventChain(newEventChain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN, newEventChain, newEventChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN:
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
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN:
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
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN:
				setEventChain((SubEventChain)newValue);
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
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN:
				setEventChain((SubEventChain)null);
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
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER__EVENT_CHAIN:
				return eventChain != null;
		}
		return super.eIsSet(featureID);
	}

} //EventChainContainerImpl
