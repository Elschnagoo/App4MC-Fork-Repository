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
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainReference;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Chain Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventChainReferenceImpl#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventChainReferenceImpl#getEventChain <em>Event Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventChainReferenceImpl extends EventChainItemImpl implements EventChainReference {
	/**
	 * The cached value of the '{@link #getCustomProperties() <em>Custom Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Value> customProperties;

	/**
	 * The cached value of the '{@link #getEventChain() <em>Event Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChain()
	 * @generated
	 * @ordered
	 */
	protected EventChain eventChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getEventChainReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Value> getCustomProperties() {
		if (customProperties == null) {
			customProperties = new EcoreEMap<String,Value>(AmaltheaPackage.eINSTANCE.getCustomProperty(), CustomPropertyImpl.class, this, AmaltheaPackage.EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES);
		}
		return customProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChain getEventChain() {
		if (eventChain != null && eventChain.eIsProxy()) {
			InternalEObject oldEventChain = (InternalEObject)eventChain;
			eventChain = (EventChain)eResolveProxy(oldEventChain);
			if (eventChain != oldEventChain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.EVENT_CHAIN_REFERENCE__EVENT_CHAIN, oldEventChain, eventChain));
			}
		}
		return eventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChain basicGetEventChain() {
		return eventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventChain(EventChain newEventChain) {
		EventChain oldEventChain = eventChain;
		eventChain = newEventChain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.EVENT_CHAIN_REFERENCE__EVENT_CHAIN, oldEventChain, eventChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES:
				return ((InternalEList<?>)getCustomProperties()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES:
				if (coreType) return getCustomProperties();
				else return getCustomProperties().map();
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__EVENT_CHAIN:
				if (resolve) return getEventChain();
				return basicGetEventChain();
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
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES:
				((EStructuralFeature.Setting)getCustomProperties()).set(newValue);
				return;
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__EVENT_CHAIN:
				setEventChain((EventChain)newValue);
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
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES:
				getCustomProperties().clear();
				return;
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__EVENT_CHAIN:
				setEventChain((EventChain)null);
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
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES:
				return customProperties != null && !customProperties.isEmpty();
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE__EVENT_CHAIN:
				return eventChain != null;
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
		if (baseClass == IAnnotatable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES: return AmaltheaPackage.IANNOTATABLE__CUSTOM_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == BaseObject.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == IAnnotatable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.IANNOTATABLE__CUSTOM_PROPERTIES: return AmaltheaPackage.EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == BaseObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EventChainReferenceImpl
