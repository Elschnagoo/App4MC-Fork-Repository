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
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions;
import org.eclipse.app4mc.amalthea.model.OsISRInstructions;
import org.eclipse.app4mc.amalthea.model.OsInstructions;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsInstructionsImpl#getApiOverhead <em>Api Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsInstructionsImpl#getIsrCategory1Overhead <em>Isr Category1 Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsInstructionsImpl#getIsrCategory2Overhead <em>Isr Category2 Overhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsInstructionsImpl extends ReferableBaseObjectImpl implements OsInstructions {
	/**
	 * The cached value of the '{@link #getApiOverhead() <em>Api Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiOverhead()
	 * @generated
	 * @ordered
	 */
	protected OsAPIInstructions apiOverhead;

	/**
	 * The cached value of the '{@link #getIsrCategory1Overhead() <em>Isr Category1 Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsrCategory1Overhead()
	 * @generated
	 * @ordered
	 */
	protected OsISRInstructions isrCategory1Overhead;

	/**
	 * The cached value of the '{@link #getIsrCategory2Overhead() <em>Isr Category2 Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsrCategory2Overhead()
	 * @generated
	 * @ordered
	 */
	protected OsISRInstructions isrCategory2Overhead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsInstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsInstructions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAPIInstructions getApiOverhead() {
		if (apiOverhead != null && apiOverhead.eIsProxy()) {
			InternalEObject oldApiOverhead = (InternalEObject)apiOverhead;
			apiOverhead = (OsAPIInstructions)eResolveProxy(oldApiOverhead);
			if (apiOverhead != oldApiOverhead) {
				InternalEObject newApiOverhead = (InternalEObject)apiOverhead;
				NotificationChain msgs = oldApiOverhead.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD, null, null);
				if (newApiOverhead.eInternalContainer() == null) {
					msgs = newApiOverhead.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD, oldApiOverhead, apiOverhead));
			}
		}
		return apiOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAPIInstructions basicGetApiOverhead() {
		return apiOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiOverhead(OsAPIInstructions newApiOverhead, NotificationChain msgs) {
		OsAPIInstructions oldApiOverhead = apiOverhead;
		apiOverhead = newApiOverhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD, oldApiOverhead, newApiOverhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiOverhead(OsAPIInstructions newApiOverhead) {
		if (newApiOverhead != apiOverhead) {
			NotificationChain msgs = null;
			if (apiOverhead != null)
				msgs = ((InternalEObject)apiOverhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD, null, msgs);
			if (newApiOverhead != null)
				msgs = ((InternalEObject)newApiOverhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD, null, msgs);
			msgs = basicSetApiOverhead(newApiOverhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD, newApiOverhead, newApiOverhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsISRInstructions getIsrCategory1Overhead() {
		if (isrCategory1Overhead != null && isrCategory1Overhead.eIsProxy()) {
			InternalEObject oldIsrCategory1Overhead = (InternalEObject)isrCategory1Overhead;
			isrCategory1Overhead = (OsISRInstructions)eResolveProxy(oldIsrCategory1Overhead);
			if (isrCategory1Overhead != oldIsrCategory1Overhead) {
				InternalEObject newIsrCategory1Overhead = (InternalEObject)isrCategory1Overhead;
				NotificationChain msgs = oldIsrCategory1Overhead.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD, null, null);
				if (newIsrCategory1Overhead.eInternalContainer() == null) {
					msgs = newIsrCategory1Overhead.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD, oldIsrCategory1Overhead, isrCategory1Overhead));
			}
		}
		return isrCategory1Overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsISRInstructions basicGetIsrCategory1Overhead() {
		return isrCategory1Overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsrCategory1Overhead(OsISRInstructions newIsrCategory1Overhead, NotificationChain msgs) {
		OsISRInstructions oldIsrCategory1Overhead = isrCategory1Overhead;
		isrCategory1Overhead = newIsrCategory1Overhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD, oldIsrCategory1Overhead, newIsrCategory1Overhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsrCategory1Overhead(OsISRInstructions newIsrCategory1Overhead) {
		if (newIsrCategory1Overhead != isrCategory1Overhead) {
			NotificationChain msgs = null;
			if (isrCategory1Overhead != null)
				msgs = ((InternalEObject)isrCategory1Overhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD, null, msgs);
			if (newIsrCategory1Overhead != null)
				msgs = ((InternalEObject)newIsrCategory1Overhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD, null, msgs);
			msgs = basicSetIsrCategory1Overhead(newIsrCategory1Overhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD, newIsrCategory1Overhead, newIsrCategory1Overhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsISRInstructions getIsrCategory2Overhead() {
		if (isrCategory2Overhead != null && isrCategory2Overhead.eIsProxy()) {
			InternalEObject oldIsrCategory2Overhead = (InternalEObject)isrCategory2Overhead;
			isrCategory2Overhead = (OsISRInstructions)eResolveProxy(oldIsrCategory2Overhead);
			if (isrCategory2Overhead != oldIsrCategory2Overhead) {
				InternalEObject newIsrCategory2Overhead = (InternalEObject)isrCategory2Overhead;
				NotificationChain msgs = oldIsrCategory2Overhead.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD, null, null);
				if (newIsrCategory2Overhead.eInternalContainer() == null) {
					msgs = newIsrCategory2Overhead.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD, oldIsrCategory2Overhead, isrCategory2Overhead));
			}
		}
		return isrCategory2Overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsISRInstructions basicGetIsrCategory2Overhead() {
		return isrCategory2Overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsrCategory2Overhead(OsISRInstructions newIsrCategory2Overhead, NotificationChain msgs) {
		OsISRInstructions oldIsrCategory2Overhead = isrCategory2Overhead;
		isrCategory2Overhead = newIsrCategory2Overhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD, oldIsrCategory2Overhead, newIsrCategory2Overhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsrCategory2Overhead(OsISRInstructions newIsrCategory2Overhead) {
		if (newIsrCategory2Overhead != isrCategory2Overhead) {
			NotificationChain msgs = null;
			if (isrCategory2Overhead != null)
				msgs = ((InternalEObject)isrCategory2Overhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD, null, msgs);
			if (newIsrCategory2Overhead != null)
				msgs = ((InternalEObject)newIsrCategory2Overhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD, null, msgs);
			msgs = basicSetIsrCategory2Overhead(newIsrCategory2Overhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD, newIsrCategory2Overhead, newIsrCategory2Overhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD:
				return basicSetApiOverhead(null, msgs);
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD:
				return basicSetIsrCategory1Overhead(null, msgs);
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD:
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
			case AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD:
				if (resolve) return getApiOverhead();
				return basicGetApiOverhead();
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD:
				if (resolve) return getIsrCategory1Overhead();
				return basicGetIsrCategory1Overhead();
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD:
				if (resolve) return getIsrCategory2Overhead();
				return basicGetIsrCategory2Overhead();
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
			case AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD:
				setApiOverhead((OsAPIInstructions)newValue);
				return;
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD:
				setIsrCategory1Overhead((OsISRInstructions)newValue);
				return;
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD:
				setIsrCategory2Overhead((OsISRInstructions)newValue);
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
			case AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD:
				setApiOverhead((OsAPIInstructions)null);
				return;
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD:
				setIsrCategory1Overhead((OsISRInstructions)null);
				return;
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD:
				setIsrCategory2Overhead((OsISRInstructions)null);
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
			case AmaltheaPackage.OS_INSTRUCTIONS__API_OVERHEAD:
				return apiOverhead != null;
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD:
				return isrCategory1Overhead != null;
			case AmaltheaPackage.OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD:
				return isrCategory2Overhead != null;
		}
		return super.eIsSet(featureID);
	}

} //OsInstructionsImpl
