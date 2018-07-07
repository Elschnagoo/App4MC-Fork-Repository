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

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Chain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainTypeImpl#getStimulusEventReference <em>Stimulus Event Reference</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainTypeImpl#getInterChainEventReferenceId <em>Inter Chain Event Reference Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainTypeImpl#getResponseEventReference <em>Response Event Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventChainTypeImpl extends IdentifiableElementImpl implements EventChainType {
	/**
	 * The cached value of the '{@link #getStimulusEventReference() <em>Stimulus Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusEventReference()
	 * @generated
	 * @ordered
	 */
	protected EventReferenceType stimulusEventReference;

	/**
	 * The cached value of the '{@link #getInterChainEventReferenceId() <em>Inter Chain Event Reference Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterChainEventReferenceId()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> interChainEventReferenceId;

	/**
	 * The cached value of the '{@link #getResponseEventReference() <em>Response Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseEventReference()
	 * @generated
	 * @ordered
	 */
	protected EventReferenceType responseEventReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.EVENT_CHAIN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReferenceType getStimulusEventReference() {
		return stimulusEventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimulusEventReference(EventReferenceType newStimulusEventReference, NotificationChain msgs) {
		EventReferenceType oldStimulusEventReference = stimulusEventReference;
		stimulusEventReference = newStimulusEventReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE, oldStimulusEventReference, newStimulusEventReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulusEventReference(EventReferenceType newStimulusEventReference) {
		if (newStimulusEventReference != stimulusEventReference) {
			NotificationChain msgs = null;
			if (stimulusEventReference != null)
				msgs = ((InternalEObject)stimulusEventReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE, null, msgs);
			if (newStimulusEventReference != null)
				msgs = ((InternalEObject)newStimulusEventReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE, null, msgs);
			msgs = basicSetStimulusEventReference(newStimulusEventReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE, newStimulusEventReference, newStimulusEventReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigInteger> getInterChainEventReferenceId() {
		if (interChainEventReferenceId == null) {
			interChainEventReferenceId = new EDataTypeEList<BigInteger>(BigInteger.class, this, OT1Package.EVENT_CHAIN_TYPE__INTER_CHAIN_EVENT_REFERENCE_ID);
		}
		return interChainEventReferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReferenceType getResponseEventReference() {
		return responseEventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseEventReference(EventReferenceType newResponseEventReference, NotificationChain msgs) {
		EventReferenceType oldResponseEventReference = responseEventReference;
		responseEventReference = newResponseEventReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE, oldResponseEventReference, newResponseEventReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseEventReference(EventReferenceType newResponseEventReference) {
		if (newResponseEventReference != responseEventReference) {
			NotificationChain msgs = null;
			if (responseEventReference != null)
				msgs = ((InternalEObject)responseEventReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE, null, msgs);
			if (newResponseEventReference != null)
				msgs = ((InternalEObject)newResponseEventReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE, null, msgs);
			msgs = basicSetResponseEventReference(newResponseEventReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE, newResponseEventReference, newResponseEventReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE:
				return basicSetStimulusEventReference(null, msgs);
			case OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE:
				return basicSetResponseEventReference(null, msgs);
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
			case OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE:
				return getStimulusEventReference();
			case OT1Package.EVENT_CHAIN_TYPE__INTER_CHAIN_EVENT_REFERENCE_ID:
				return getInterChainEventReferenceId();
			case OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE:
				return getResponseEventReference();
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
			case OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE:
				setStimulusEventReference((EventReferenceType)newValue);
				return;
			case OT1Package.EVENT_CHAIN_TYPE__INTER_CHAIN_EVENT_REFERENCE_ID:
				getInterChainEventReferenceId().clear();
				getInterChainEventReferenceId().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE:
				setResponseEventReference((EventReferenceType)newValue);
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
			case OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE:
				setStimulusEventReference((EventReferenceType)null);
				return;
			case OT1Package.EVENT_CHAIN_TYPE__INTER_CHAIN_EVENT_REFERENCE_ID:
				getInterChainEventReferenceId().clear();
				return;
			case OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE:
				setResponseEventReference((EventReferenceType)null);
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
			case OT1Package.EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE:
				return stimulusEventReference != null;
			case OT1Package.EVENT_CHAIN_TYPE__INTER_CHAIN_EVENT_REFERENCE_ID:
				return interChainEventReferenceId != null && !interChainEventReferenceId.isEmpty();
			case OT1Package.EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE:
				return responseEventReference != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (interChainEventReferenceId: ");
		result.append(interChainEventReferenceId);
		result.append(')');
		return result.toString();
	}

} //EventChainTypeImpl
