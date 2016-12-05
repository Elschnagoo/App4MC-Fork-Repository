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
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.EventStimulus;
import org.eclipse.app4mc.amalthea.model.TriggerEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventStimulusImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventStimulusImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventStimulusImpl extends StimulusImpl implements EventStimulus {
	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected TriggerEvent trigger;

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
	protected EventStimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getEventStimulus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (TriggerEvent)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.EVENT_STIMULUS__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(TriggerEvent newTrigger) {
		TriggerEvent oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.EVENT_STIMULUS__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter getCounter() {
		if (counter != null && counter.eIsProxy()) {
			InternalEObject oldCounter = (InternalEObject)counter;
			counter = (Counter)eResolveProxy(oldCounter);
			if (counter != oldCounter) {
				InternalEObject newCounter = (InternalEObject)counter;
				NotificationChain msgs = oldCounter.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.EVENT_STIMULUS__COUNTER, null, null);
				if (newCounter.eInternalContainer() == null) {
					msgs = newCounter.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.EVENT_STIMULUS__COUNTER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.EVENT_STIMULUS__COUNTER, oldCounter, counter));
			}
		}
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter basicGetCounter() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.EVENT_STIMULUS__COUNTER, oldCounter, newCounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(Counter newCounter) {
		if (newCounter != counter) {
			NotificationChain msgs = null;
			if (counter != null)
				msgs = ((InternalEObject)counter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.EVENT_STIMULUS__COUNTER, null, msgs);
			if (newCounter != null)
				msgs = ((InternalEObject)newCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.EVENT_STIMULUS__COUNTER, null, msgs);
			msgs = basicSetCounter(newCounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.EVENT_STIMULUS__COUNTER, newCounter, newCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.EVENT_STIMULUS__COUNTER:
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
			case AmaltheaPackage.EVENT_STIMULUS__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case AmaltheaPackage.EVENT_STIMULUS__COUNTER:
				if (resolve) return getCounter();
				return basicGetCounter();
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
			case AmaltheaPackage.EVENT_STIMULUS__TRIGGER:
				setTrigger((TriggerEvent)newValue);
				return;
			case AmaltheaPackage.EVENT_STIMULUS__COUNTER:
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
			case AmaltheaPackage.EVENT_STIMULUS__TRIGGER:
				setTrigger((TriggerEvent)null);
				return;
			case AmaltheaPackage.EVENT_STIMULUS__COUNTER:
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
			case AmaltheaPackage.EVENT_STIMULUS__TRIGGER:
				return trigger != null;
			case AmaltheaPackage.EVENT_STIMULUS__COUNTER:
				return counter != null;
		}
		return super.eIsSet(featureID);
	}

} //EventStimulusImpl
