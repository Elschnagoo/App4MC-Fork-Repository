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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyDeviationImpl#getDeviationInCylces <em>Deviation In Cylces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyDeviationImpl extends HwLatencyImpl implements LatencyDeviation {
	/**
	 * The cached value of the '{@link #getDeviationInCylces() <em>Deviation In Cylces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviationInCylces()
	 * @generated
	 * @ordered
	 */
	protected Deviation<LongObject> deviationInCylces;

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
	public Deviation<LongObject> getDeviationInCylces() {
		return deviationInCylces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviationInCylces(Deviation<LongObject> newDeviationInCylces, NotificationChain msgs) {
		Deviation<LongObject> oldDeviationInCylces = deviationInCylces;
		deviationInCylces = newDeviationInCylces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES, oldDeviationInCylces, newDeviationInCylces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviationInCylces(Deviation<LongObject> newDeviationInCylces) {
		if (newDeviationInCylces != deviationInCylces) {
			NotificationChain msgs = null;
			if (deviationInCylces != null)
				msgs = ((InternalEObject)deviationInCylces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES, null, msgs);
			if (newDeviationInCylces != null)
				msgs = ((InternalEObject)newDeviationInCylces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES, null, msgs);
			msgs = basicSetDeviationInCylces(newDeviationInCylces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES, newDeviationInCylces, newDeviationInCylces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES:
				return basicSetDeviationInCylces(null, msgs);
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
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES:
				return getDeviationInCylces();
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
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES:
				setDeviationInCylces((Deviation<LongObject>)newValue);
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
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES:
				setDeviationInCylces((Deviation<LongObject>)null);
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
			case AmaltheaPackage.LATENCY_DEVIATION__DEVIATION_IN_CYLCES:
				return deviationInCylces != null;
		}
		return super.eIsSet(featureID);
	}

} //LatencyDeviationImpl
