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
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.ChannelAccess;
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelAccessImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelAccessImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelAccessImpl#getTransmissionPolicy <em>Transmission Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChannelAccessImpl extends CallGraphItemImpl implements ChannelAccess {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Channel data;

	/**
	 * The default value of the '{@link #getElements() <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected int elements = ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransmissionPolicy() <em>Transmission Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionPolicy()
	 * @generated
	 * @ordered
	 */
	protected TransmissionPolicy transmissionPolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getChannelAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Channel getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Channel)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CHANNEL_ACCESS__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(Channel newData) {
		Channel oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_ACCESS__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElements(int newElements) {
		int oldElements = elements;
		elements = newElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_ACCESS__ELEMENTS, oldElements, elements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionPolicy getTransmissionPolicy() {
		return transmissionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionPolicy(TransmissionPolicy newTransmissionPolicy, NotificationChain msgs) {
		TransmissionPolicy oldTransmissionPolicy = transmissionPolicy;
		transmissionPolicy = newTransmissionPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY, oldTransmissionPolicy, newTransmissionPolicy);
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
	public void setTransmissionPolicy(TransmissionPolicy newTransmissionPolicy) {
		if (newTransmissionPolicy != transmissionPolicy) {
			NotificationChain msgs = null;
			if (transmissionPolicy != null)
				msgs = ((InternalEObject)transmissionPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY, null, msgs);
			if (newTransmissionPolicy != null)
				msgs = ((InternalEObject)newTransmissionPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY, null, msgs);
			msgs = basicSetTransmissionPolicy(newTransmissionPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY, newTransmissionPolicy, newTransmissionPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY:
				return basicSetTransmissionPolicy(null, msgs);
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA:
				if (resolve) return getData();
				return basicGetData();
			case AmaltheaPackage.CHANNEL_ACCESS__ELEMENTS:
				return getElements();
			case AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY:
				return getTransmissionPolicy();
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA:
				setData((Channel)newValue);
				return;
			case AmaltheaPackage.CHANNEL_ACCESS__ELEMENTS:
				setElements((Integer)newValue);
				return;
			case AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY:
				setTransmissionPolicy((TransmissionPolicy)newValue);
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA:
				setData((Channel)null);
				return;
			case AmaltheaPackage.CHANNEL_ACCESS__ELEMENTS:
				setElements(ELEMENTS_EDEFAULT);
				return;
			case AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY:
				setTransmissionPolicy((TransmissionPolicy)null);
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA:
				return data != null;
			case AmaltheaPackage.CHANNEL_ACCESS__ELEMENTS:
				return elements != ELEMENTS_EDEFAULT;
			case AmaltheaPackage.CHANNEL_ACCESS__TRANSMISSION_POLICY:
				return transmissionPolicy != null;
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
		result.append(" (elements: ");
		result.append(elements);
		result.append(')');
		return result.toString();
	}

} //ChannelAccessImpl
