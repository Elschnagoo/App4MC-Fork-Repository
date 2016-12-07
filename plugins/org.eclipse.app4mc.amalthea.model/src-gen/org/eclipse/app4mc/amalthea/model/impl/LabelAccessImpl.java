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
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessDataStability;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getTransmissionPolicy <em>Transmission Policy</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getDataStability <em>Data Stability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getDataLinkInt <em>Data Link Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelAccessImpl extends RunnableItemImpl implements LabelAccess {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Label data;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAccessEnum ACCESS_EDEFAULT = LabelAccessEnum._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessEnum access = ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatistic() <em>Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistic()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessStatistic statistic;

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
	 * The default value of the '{@link #getDataStability() <em>Data Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStability()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAccessDataStability DATA_STABILITY_EDEFAULT = LabelAccessDataStability._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getDataStability() <em>Data Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStability()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessDataStability dataStability = DATA_STABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataLinkInt() <em>Data Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLinkInt()
	 * @generated
	 * @ordered
	 */
	protected Label dataLinkInt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLabelAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Label)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL_ACCESS__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Label newData) {
		Label oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__DATA, oldData, data));
 		//Additional setting transient value for transient bi-directional reference
 		setDataLinkInt(newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessEnum getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(LabelAccessEnum newAccess) {
		LabelAccessEnum oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessStatistic getStatistic() {
		if (statistic != null && statistic.eIsProxy()) {
			InternalEObject oldStatistic = (InternalEObject)statistic;
			statistic = (LabelAccessStatistic)eResolveProxy(oldStatistic);
			if (statistic != oldStatistic) {
				InternalEObject newStatistic = (InternalEObject)statistic;
				NotificationChain msgs = oldStatistic.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__STATISTIC, null, null);
				if (newStatistic.eInternalContainer() == null) {
					msgs = newStatistic.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__STATISTIC, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL_ACCESS__STATISTIC, oldStatistic, statistic));
			}
		}
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessStatistic basicGetStatistic() {
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatistic(LabelAccessStatistic newStatistic, NotificationChain msgs) {
		LabelAccessStatistic oldStatistic = statistic;
		statistic = newStatistic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__STATISTIC, oldStatistic, newStatistic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatistic(LabelAccessStatistic newStatistic) {
		if (newStatistic != statistic) {
			NotificationChain msgs = null;
			if (statistic != null)
				msgs = ((InternalEObject)statistic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__STATISTIC, null, msgs);
			if (newStatistic != null)
				msgs = ((InternalEObject)newStatistic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__STATISTIC, null, msgs);
			msgs = basicSetStatistic(newStatistic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__STATISTIC, newStatistic, newStatistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionPolicy getTransmissionPolicy() {
		if (transmissionPolicy != null && transmissionPolicy.eIsProxy()) {
			InternalEObject oldTransmissionPolicy = (InternalEObject)transmissionPolicy;
			transmissionPolicy = (TransmissionPolicy)eResolveProxy(oldTransmissionPolicy);
			if (transmissionPolicy != oldTransmissionPolicy) {
				InternalEObject newTransmissionPolicy = (InternalEObject)transmissionPolicy;
				NotificationChain msgs = oldTransmissionPolicy.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, null, null);
				if (newTransmissionPolicy.eInternalContainer() == null) {
					msgs = newTransmissionPolicy.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, oldTransmissionPolicy, transmissionPolicy));
			}
		}
		return transmissionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionPolicy basicGetTransmissionPolicy() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, oldTransmissionPolicy, newTransmissionPolicy);
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
				msgs = ((InternalEObject)transmissionPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, null, msgs);
			if (newTransmissionPolicy != null)
				msgs = ((InternalEObject)newTransmissionPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, null, msgs);
			msgs = basicSetTransmissionPolicy(newTransmissionPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, newTransmissionPolicy, newTransmissionPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessDataStability getDataStability() {
		return dataStability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStability(LabelAccessDataStability newDataStability) {
		LabelAccessDataStability oldDataStability = dataStability;
		dataStability = newDataStability == null ? DATA_STABILITY_EDEFAULT : newDataStability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY, oldDataStability, dataStability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getDataLinkInt() {
		if (dataLinkInt != null && dataLinkInt.eIsProxy()) {
			InternalEObject oldDataLinkInt = (InternalEObject)dataLinkInt;
			dataLinkInt = (Label)eResolveProxy(oldDataLinkInt);
			if (dataLinkInt != oldDataLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT, oldDataLinkInt, dataLinkInt));
			}
		}
		return dataLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetDataLinkInt() {
		return dataLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataLinkInt(Label newDataLinkInt, NotificationChain msgs) {
		Label oldDataLinkInt = dataLinkInt;
		dataLinkInt = newDataLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT, oldDataLinkInt, newDataLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLinkInt(Label newDataLinkInt) {
		if (newDataLinkInt != dataLinkInt) {
			NotificationChain msgs = null;
			if (dataLinkInt != null)
				msgs = ((InternalEObject)dataLinkInt).eInverseRemove(this, AmaltheaPackage.LABEL__LABEL_ACCESSES, Label.class, msgs);
			if (newDataLinkInt != null)
				msgs = ((InternalEObject)newDataLinkInt).eInverseAdd(this, AmaltheaPackage.LABEL__LABEL_ACCESSES, Label.class, msgs);
			msgs = basicSetDataLinkInt(newDataLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT, newDataLinkInt, newDataLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT:
				if (dataLinkInt != null)
					msgs = ((InternalEObject)dataLinkInt).eInverseRemove(this, AmaltheaPackage.LABEL__LABEL_ACCESSES, Label.class, msgs);
				return basicSetDataLinkInt((Label)otherEnd, msgs);
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
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				return basicSetStatistic(null, msgs);
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				return basicSetTransmissionPolicy(null, msgs);
			case AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT:
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
			case AmaltheaPackage.LABEL_ACCESS__DATA:
				if (resolve) return getData();
				return basicGetData();
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
				return getAccess();
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				if (resolve) return getStatistic();
				return basicGetStatistic();
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				if (resolve) return getTransmissionPolicy();
				return basicGetTransmissionPolicy();
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
				return getDataStability();
			case AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT:
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
			case AmaltheaPackage.LABEL_ACCESS__DATA:
				setData((Label)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
				setAccess((LabelAccessEnum)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				setStatistic((LabelAccessStatistic)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				setTransmissionPolicy((TransmissionPolicy)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
				setDataStability((LabelAccessDataStability)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT:
				setDataLinkInt((Label)newValue);
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
			case AmaltheaPackage.LABEL_ACCESS__DATA:
				setData((Label)null);
				return;
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				setStatistic((LabelAccessStatistic)null);
				return;
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				setTransmissionPolicy((TransmissionPolicy)null);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
				setDataStability(DATA_STABILITY_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT:
				setDataLinkInt((Label)null);
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
			case AmaltheaPackage.LABEL_ACCESS__DATA:
				return data != null;
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
				return access != ACCESS_EDEFAULT;
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				return statistic != null;
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				return transmissionPolicy != null;
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
				return dataStability != DATA_STABILITY_EDEFAULT;
			case AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT:
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
		result.append(" (access: ");
		result.append(access);
		result.append(", dataStability: ");
		result.append(dataStability);
		result.append(')');
		return result.toString();
	}

} //LabelAccessImpl
