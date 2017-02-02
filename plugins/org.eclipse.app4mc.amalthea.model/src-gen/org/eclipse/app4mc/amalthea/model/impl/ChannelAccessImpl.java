/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelAccessImpl#getDataLinkInt <em>Data Link Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChannelAccessImpl extends RunnableItemImpl implements ChannelAccess {
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
	 * The cached value of the '{@link #getDataLinkInt() <em>Data Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLinkInt()
	 * @generated
	 * @ordered
	 */
	protected Channel dataLinkInt;

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
	public void setData(Channel newData) {
		Channel oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_ACCESS__DATA, oldData, data));
 		//Additional setting transient value for transient bi-directional reference
 		setDataLinkInt(newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Channel getDataLinkInt() {
		if (dataLinkInt != null && dataLinkInt.eIsProxy()) {
			InternalEObject oldDataLinkInt = (InternalEObject)dataLinkInt;
			dataLinkInt = (Channel)eResolveProxy(oldDataLinkInt);
			if (dataLinkInt != oldDataLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT, oldDataLinkInt, dataLinkInt));
			}
		}
		return dataLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetDataLinkInt() {
		return dataLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataLinkInt(Channel newDataLinkInt, NotificationChain msgs) {
		Channel oldDataLinkInt = dataLinkInt;
		dataLinkInt = newDataLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT, oldDataLinkInt, newDataLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLinkInt(Channel newDataLinkInt) {
		if (newDataLinkInt != dataLinkInt) {
			NotificationChain msgs = null;
			if (dataLinkInt != null)
				msgs = ((InternalEObject)dataLinkInt).eInverseRemove(this, AmaltheaPackage.CHANNEL__CHANNEL_ACCESSES, Channel.class, msgs);
			if (newDataLinkInt != null)
				msgs = ((InternalEObject)newDataLinkInt).eInverseAdd(this, AmaltheaPackage.CHANNEL__CHANNEL_ACCESSES, Channel.class, msgs);
			msgs = basicSetDataLinkInt(newDataLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT, newDataLinkInt, newDataLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT:
				if (dataLinkInt != null)
					msgs = ((InternalEObject)dataLinkInt).eInverseRemove(this, AmaltheaPackage.CHANNEL__CHANNEL_ACCESSES, Channel.class, msgs);
				return basicSetDataLinkInt((Channel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT:
				return basicSetDataLinkInt(null, msgs);
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT:
				if (resolve) return getDataLinkInt();
				return basicGetDataLinkInt();
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT:
				setDataLinkInt((Channel)newValue);
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT:
				setDataLinkInt((Channel)null);
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
			case AmaltheaPackage.CHANNEL_ACCESS__DATA_LINK_INT:
				return dataLinkInt != null;
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
		result.append(" (elements: ");
		result.append(elements);
		result.append(')');
		return result.toString();
	}

} //ChannelAccessImpl
