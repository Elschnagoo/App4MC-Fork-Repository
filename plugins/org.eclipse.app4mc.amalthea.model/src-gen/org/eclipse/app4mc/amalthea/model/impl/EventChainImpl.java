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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventChainImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventChainImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventChainImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventChainImpl#getStrands <em>Strands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventChainImpl extends ReferableBaseObjectImpl implements EventChain {
	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected Event stimulus;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Event response;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChainItem> segments;

	/**
	 * The cached value of the '{@link #getStrands() <em>Strands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrands()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChainItem> strands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getEventChain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getStimulus() {
		if (stimulus != null && stimulus.eIsProxy()) {
			InternalEObject oldStimulus = (InternalEObject)stimulus;
			stimulus = (Event)eResolveProxy(oldStimulus);
			if (stimulus != oldStimulus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.EVENT_CHAIN__STIMULUS, oldStimulus, stimulus));
			}
		}
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulus(Event newStimulus) {
		Event oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.EVENT_CHAIN__STIMULUS, oldStimulus, stimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (Event)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.EVENT_CHAIN__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Event newResponse) {
		Event oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.EVENT_CHAIN__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChainItem> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList.Resolving<EventChainItem>(EventChainItem.class, this, AmaltheaPackage.EVENT_CHAIN__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChainItem> getStrands() {
		if (strands == null) {
			strands = new EObjectContainmentEList.Resolving<EventChainItem>(EventChainItem.class, this, AmaltheaPackage.EVENT_CHAIN__STRANDS);
		}
		return strands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containerNotificationRequired() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.EVENT_CHAIN__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.EVENT_CHAIN__STRANDS:
				return ((InternalEList<?>)getStrands()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.EVENT_CHAIN__STIMULUS:
				if (resolve) return getStimulus();
				return basicGetStimulus();
			case AmaltheaPackage.EVENT_CHAIN__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case AmaltheaPackage.EVENT_CHAIN__SEGMENTS:
				return getSegments();
			case AmaltheaPackage.EVENT_CHAIN__STRANDS:
				return getStrands();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.EVENT_CHAIN__STIMULUS:
				setStimulus((Event)newValue);
				return;
			case AmaltheaPackage.EVENT_CHAIN__RESPONSE:
				setResponse((Event)newValue);
				return;
			case AmaltheaPackage.EVENT_CHAIN__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends EventChainItem>)newValue);
				return;
			case AmaltheaPackage.EVENT_CHAIN__STRANDS:
				getStrands().clear();
				getStrands().addAll((Collection<? extends EventChainItem>)newValue);
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
			case AmaltheaPackage.EVENT_CHAIN__STIMULUS:
				setStimulus((Event)null);
				return;
			case AmaltheaPackage.EVENT_CHAIN__RESPONSE:
				setResponse((Event)null);
				return;
			case AmaltheaPackage.EVENT_CHAIN__SEGMENTS:
				getSegments().clear();
				return;
			case AmaltheaPackage.EVENT_CHAIN__STRANDS:
				getStrands().clear();
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
			case AmaltheaPackage.EVENT_CHAIN__STIMULUS:
				return stimulus != null;
			case AmaltheaPackage.EVENT_CHAIN__RESPONSE:
				return response != null;
			case AmaltheaPackage.EVENT_CHAIN__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case AmaltheaPackage.EVENT_CHAIN__STRANDS:
				return strands != null && !strands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.EVENT_CHAIN___CONTAINER_NOTIFICATION_REQUIRED:
				return containerNotificationRequired();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EventChainImpl
