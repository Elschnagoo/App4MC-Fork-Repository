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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AbstractEventChain;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventChainItem;
import org.eclipse.app4mc.amalthea.model.INamed;

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
 * An implementation of the model object '<em><b>Abstract Event Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractEventChainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractEventChainImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractEventChainImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractEventChainImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractEventChainImpl#getStrands <em>Strands</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractEventChainImpl extends BaseObjectImpl implements AbstractEventChain {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected AbstractEventChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getAbstractEventChain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_EVENT_CHAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event getStimulus() {
		if (stimulus != null && stimulus.eIsProxy()) {
			InternalEObject oldStimulus = (InternalEObject)stimulus;
			stimulus = (Event)eResolveProxy(oldStimulus);
			if (stimulus != oldStimulus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STIMULUS, oldStimulus, stimulus));
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
	@Override
	public void setStimulus(Event newStimulus) {
		Event oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STIMULUS, oldStimulus, stimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (Event)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ABSTRACT_EVENT_CHAIN__RESPONSE, oldResponse, response));
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
	@Override
	public void setResponse(Event newResponse) {
		Event oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_EVENT_CHAIN__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventChainItem> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList<EventChainItem>(EventChainItem.class, this, AmaltheaPackage.ABSTRACT_EVENT_CHAIN__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventChainItem> getStrands() {
		if (strands == null) {
			strands = new EObjectContainmentEList<EventChainItem>(EventChainItem.class, this, AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STRANDS);
		}
		return strands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STRANDS:
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
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__NAME:
				return getName();
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STIMULUS:
				if (resolve) return getStimulus();
				return basicGetStimulus();
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__SEGMENTS:
				return getSegments();
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STRANDS:
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
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__NAME:
				setName((String)newValue);
				return;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STIMULUS:
				setStimulus((Event)newValue);
				return;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__RESPONSE:
				setResponse((Event)newValue);
				return;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends EventChainItem>)newValue);
				return;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STRANDS:
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
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STIMULUS:
				setStimulus((Event)null);
				return;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__RESPONSE:
				setResponse((Event)null);
				return;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__SEGMENTS:
				getSegments().clear();
				return;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STRANDS:
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
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STIMULUS:
				return stimulus != null;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__RESPONSE:
				return response != null;
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__STRANDS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == INamed.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.ABSTRACT_EVENT_CHAIN__NAME: return AmaltheaPackage.INAMED__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == INamed.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.INAMED__NAME: return AmaltheaPackage.ABSTRACT_EVENT_CHAIN__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractEventChainImpl
