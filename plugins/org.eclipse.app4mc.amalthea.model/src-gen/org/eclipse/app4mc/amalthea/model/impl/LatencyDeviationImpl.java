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
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.LatencyDeviation;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Quartz;
import org.eclipse.app4mc.amalthea.model.RWType;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyDeviationImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyDeviationImpl#getTransferSize <em>Transfer Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyDeviationImpl#getQuartz <em>Quartz</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyDeviationImpl#getDeviation <em>Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyDeviationImpl extends AmaltheaExtendedEObjectImpl implements LatencyDeviation {
	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final RWType ACCESS_TYPE_EDEFAULT = RWType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected RWType accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransferSize() <em>Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferSize()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSFER_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransferSize() <em>Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferSize()
	 * @generated
	 * @ordered
	 */
	protected long transferSize = TRANSFER_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuartz() <em>Quartz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuartz()
	 * @generated
	 * @ordered
	 */
	protected Quartz quartz;

	/**
	 * The cached value of the '{@link #getDeviation() <em>Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviation()
	 * @generated
	 * @ordered
	 */
	protected Deviation<LongObject> deviation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyDeviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLatencyDeviation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWType getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(RWType newAccessType) {
		RWType oldAccessType = accessType;
		accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_DEVIATION__ACCESS_TYPE, oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransferSize() {
		return transferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferSize(long newTransferSize) {
		long oldTransferSize = transferSize;
		transferSize = newTransferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_DEVIATION__TRANSFER_SIZE, oldTransferSize, transferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz getQuartz() {
		if (quartz != null && quartz.eIsProxy()) {
			InternalEObject oldQuartz = (InternalEObject)quartz;
			quartz = (Quartz)eResolveProxy(oldQuartz);
			if (quartz != oldQuartz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LATENCY_DEVIATION__QUARTZ, oldQuartz, quartz));
			}
		}
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz basicGetQuartz() {
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuartz(Quartz newQuartz) {
		Quartz oldQuartz = quartz;
		quartz = newQuartz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_DEVIATION__QUARTZ, oldQuartz, quartz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation<LongObject> getDeviation() {
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviation(Deviation<LongObject> newDeviation, NotificationChain msgs) {
		Deviation<LongObject> oldDeviation = deviation;
		deviation = newDeviation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_DEVIATION__DEVIATION, oldDeviation, newDeviation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviation(Deviation<LongObject> newDeviation) {
		if (newDeviation != deviation) {
			NotificationChain msgs = null;
			if (deviation != null)
				msgs = ((InternalEObject)deviation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LATENCY_DEVIATION__DEVIATION, null, msgs);
			if (newDeviation != null)
				msgs = ((InternalEObject)newDeviation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LATENCY_DEVIATION__DEVIATION, null, msgs);
			msgs = basicSetDeviation(newDeviation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_DEVIATION__DEVIATION, newDeviation, newDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION:
				return basicSetDeviation(null, msgs);
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
			case AmaltheaPackage.LATENCY_DEVIATION__ACCESS_TYPE:
				return getAccessType();
			case AmaltheaPackage.LATENCY_DEVIATION__TRANSFER_SIZE:
				return getTransferSize();
			case AmaltheaPackage.LATENCY_DEVIATION__QUARTZ:
				if (resolve) return getQuartz();
				return basicGetQuartz();
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION:
				return getDeviation();
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
			case AmaltheaPackage.LATENCY_DEVIATION__ACCESS_TYPE:
				setAccessType((RWType)newValue);
				return;
			case AmaltheaPackage.LATENCY_DEVIATION__TRANSFER_SIZE:
				setTransferSize((Long)newValue);
				return;
			case AmaltheaPackage.LATENCY_DEVIATION__QUARTZ:
				setQuartz((Quartz)newValue);
				return;
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION:
				setDeviation((Deviation<LongObject>)newValue);
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
			case AmaltheaPackage.LATENCY_DEVIATION__ACCESS_TYPE:
				setAccessType(ACCESS_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.LATENCY_DEVIATION__TRANSFER_SIZE:
				setTransferSize(TRANSFER_SIZE_EDEFAULT);
				return;
			case AmaltheaPackage.LATENCY_DEVIATION__QUARTZ:
				setQuartz((Quartz)null);
				return;
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION:
				setDeviation((Deviation<LongObject>)null);
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
			case AmaltheaPackage.LATENCY_DEVIATION__ACCESS_TYPE:
				return accessType != ACCESS_TYPE_EDEFAULT;
			case AmaltheaPackage.LATENCY_DEVIATION__TRANSFER_SIZE:
				return transferSize != TRANSFER_SIZE_EDEFAULT;
			case AmaltheaPackage.LATENCY_DEVIATION__QUARTZ:
				return quartz != null;
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION:
				return deviation != null;
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
		result.append(" (accessType: ");
		result.append(accessType);
		result.append(", transferSize: ");
		result.append(transferSize);
		result.append(')');
		return result.toString();
	}

} //LatencyDeviationImpl
