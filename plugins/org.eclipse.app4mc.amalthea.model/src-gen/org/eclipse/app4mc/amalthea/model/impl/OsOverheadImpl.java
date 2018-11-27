/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.OsAPIOverhead;
import org.eclipse.app4mc.amalthea.model.OsISROverhead;
import org.eclipse.app4mc.amalthea.model.OsOverhead;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Overhead</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsOverheadImpl#getApiOverhead <em>Api Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsOverheadImpl#getIsrCategory1Overhead <em>Isr Category1 Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsOverheadImpl#getIsrCategory2Overhead <em>Isr Category2 Overhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsOverheadImpl extends ReferableBaseObjectImpl implements OsOverhead {
	/**
	 * The cached value of the '{@link #getApiOverhead() <em>Api Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiOverhead()
	 * @generated
	 * @ordered
	 */
	protected OsAPIOverhead apiOverhead;

	/**
	 * The cached value of the '{@link #getIsrCategory1Overhead() <em>Isr Category1 Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsrCategory1Overhead()
	 * @generated
	 * @ordered
	 */
	protected OsISROverhead isrCategory1Overhead;

	/**
	 * The cached value of the '{@link #getIsrCategory2Overhead() <em>Isr Category2 Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsrCategory2Overhead()
	 * @generated
	 * @ordered
	 */
	protected OsISROverhead isrCategory2Overhead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsOverheadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsOverhead();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAPIOverhead getApiOverhead() {
		return apiOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiOverhead(OsAPIOverhead newApiOverhead, NotificationChain msgs) {
		OsAPIOverhead oldApiOverhead = apiOverhead;
		apiOverhead = newApiOverhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD, oldApiOverhead, newApiOverhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiOverhead(OsAPIOverhead newApiOverhead) {
		if (newApiOverhead != apiOverhead) {
			NotificationChain msgs = null;
			if (apiOverhead != null)
				msgs = ((InternalEObject)apiOverhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD, null, msgs);
			if (newApiOverhead != null)
				msgs = ((InternalEObject)newApiOverhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD, null, msgs);
			msgs = basicSetApiOverhead(newApiOverhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD, newApiOverhead, newApiOverhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsISROverhead getIsrCategory1Overhead() {
		return isrCategory1Overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsrCategory1Overhead(OsISROverhead newIsrCategory1Overhead, NotificationChain msgs) {
		OsISROverhead oldIsrCategory1Overhead = isrCategory1Overhead;
		isrCategory1Overhead = newIsrCategory1Overhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD, oldIsrCategory1Overhead, newIsrCategory1Overhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsrCategory1Overhead(OsISROverhead newIsrCategory1Overhead) {
		if (newIsrCategory1Overhead != isrCategory1Overhead) {
			NotificationChain msgs = null;
			if (isrCategory1Overhead != null)
				msgs = ((InternalEObject)isrCategory1Overhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD, null, msgs);
			if (newIsrCategory1Overhead != null)
				msgs = ((InternalEObject)newIsrCategory1Overhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD, null, msgs);
			msgs = basicSetIsrCategory1Overhead(newIsrCategory1Overhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD, newIsrCategory1Overhead, newIsrCategory1Overhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsISROverhead getIsrCategory2Overhead() {
		return isrCategory2Overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsrCategory2Overhead(OsISROverhead newIsrCategory2Overhead, NotificationChain msgs) {
		OsISROverhead oldIsrCategory2Overhead = isrCategory2Overhead;
		isrCategory2Overhead = newIsrCategory2Overhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD, oldIsrCategory2Overhead, newIsrCategory2Overhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsrCategory2Overhead(OsISROverhead newIsrCategory2Overhead) {
		if (newIsrCategory2Overhead != isrCategory2Overhead) {
			NotificationChain msgs = null;
			if (isrCategory2Overhead != null)
				msgs = ((InternalEObject)isrCategory2Overhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD, null, msgs);
			if (newIsrCategory2Overhead != null)
				msgs = ((InternalEObject)newIsrCategory2Overhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD, null, msgs);
			msgs = basicSetIsrCategory2Overhead(newIsrCategory2Overhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD, newIsrCategory2Overhead, newIsrCategory2Overhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD:
				return basicSetApiOverhead(null, msgs);
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD:
				return basicSetIsrCategory1Overhead(null, msgs);
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD:
				return basicSetIsrCategory2Overhead(null, msgs);
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
			case AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD:
				return getApiOverhead();
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD:
				return getIsrCategory1Overhead();
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD:
				return getIsrCategory2Overhead();
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
			case AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD:
				setApiOverhead((OsAPIOverhead)newValue);
				return;
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD:
				setIsrCategory1Overhead((OsISROverhead)newValue);
				return;
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD:
				setIsrCategory2Overhead((OsISROverhead)newValue);
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
			case AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD:
				setApiOverhead((OsAPIOverhead)null);
				return;
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD:
				setIsrCategory1Overhead((OsISROverhead)null);
				return;
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD:
				setIsrCategory2Overhead((OsISROverhead)null);
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
			case AmaltheaPackage.OS_OVERHEAD__API_OVERHEAD:
				return apiOverhead != null;
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD:
				return isrCategory1Overhead != null;
			case AmaltheaPackage.OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD:
				return isrCategory2Overhead != null;
		}
		return super.eIsSet(featureID);
	}

} //OsOverheadImpl
