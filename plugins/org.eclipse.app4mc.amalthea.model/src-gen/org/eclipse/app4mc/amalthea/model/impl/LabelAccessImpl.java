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
import org.eclipse.app4mc.amalthea.model.LabelAccessBuffering;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;

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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getBuffered <em>Buffered</em>}</li>
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
	 * The default value of the '{@link #getBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffered()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAccessBuffering BUFFERED_EDEFAULT = LabelAccessBuffering._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffered()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessBuffering buffered = BUFFERED_EDEFAULT;

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
	public LabelAccessBuffering getBuffered() {
		return buffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffered(LabelAccessBuffering newBuffered) {
		LabelAccessBuffering oldBuffered = buffered;
		buffered = newBuffered == null ? BUFFERED_EDEFAULT : newBuffered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__BUFFERED, oldBuffered, buffered));
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
			case AmaltheaPackage.LABEL_ACCESS__BUFFERED:
				return getBuffered();
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
			case AmaltheaPackage.LABEL_ACCESS__BUFFERED:
				setBuffered((LabelAccessBuffering)newValue);
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
			case AmaltheaPackage.LABEL_ACCESS__BUFFERED:
				setBuffered(BUFFERED_EDEFAULT);
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
			case AmaltheaPackage.LABEL_ACCESS__BUFFERED:
				return buffered != BUFFERED_EDEFAULT;
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
		result.append(", buffered: ");
		result.append(buffered);
		result.append(')');
		return result.toString();
	}

} //LabelAccessImpl
