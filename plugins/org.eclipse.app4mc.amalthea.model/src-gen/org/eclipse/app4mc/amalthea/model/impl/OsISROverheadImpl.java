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
import org.eclipse.app4mc.amalthea.model.OsISROverhead;
import org.eclipse.app4mc.amalthea.model.Ticks;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os ISR Overhead</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsISROverheadImpl#getPreExecutionOverhead <em>Pre Execution Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsISROverheadImpl#getPostExecutionOverhead <em>Post Execution Overhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsISROverheadImpl extends BaseObjectImpl implements OsISROverhead {
	/**
	 * The cached value of the '{@link #getPreExecutionOverhead() <em>Pre Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreExecutionOverhead()
	 * @generated
	 * @ordered
	 */
	protected Ticks preExecutionOverhead;

	/**
	 * The cached value of the '{@link #getPostExecutionOverhead() <em>Post Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostExecutionOverhead()
	 * @generated
	 * @ordered
	 */
	protected Ticks postExecutionOverhead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsISROverheadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsISROverhead();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getPreExecutionOverhead() {
		return preExecutionOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreExecutionOverhead(Ticks newPreExecutionOverhead, NotificationChain msgs) {
		Ticks oldPreExecutionOverhead = preExecutionOverhead;
		preExecutionOverhead = newPreExecutionOverhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD, oldPreExecutionOverhead, newPreExecutionOverhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreExecutionOverhead(Ticks newPreExecutionOverhead) {
		if (newPreExecutionOverhead != preExecutionOverhead) {
			NotificationChain msgs = null;
			if (preExecutionOverhead != null)
				msgs = ((InternalEObject)preExecutionOverhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD, null, msgs);
			if (newPreExecutionOverhead != null)
				msgs = ((InternalEObject)newPreExecutionOverhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD, null, msgs);
			msgs = basicSetPreExecutionOverhead(newPreExecutionOverhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD, newPreExecutionOverhead, newPreExecutionOverhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getPostExecutionOverhead() {
		return postExecutionOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostExecutionOverhead(Ticks newPostExecutionOverhead, NotificationChain msgs) {
		Ticks oldPostExecutionOverhead = postExecutionOverhead;
		postExecutionOverhead = newPostExecutionOverhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD, oldPostExecutionOverhead, newPostExecutionOverhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostExecutionOverhead(Ticks newPostExecutionOverhead) {
		if (newPostExecutionOverhead != postExecutionOverhead) {
			NotificationChain msgs = null;
			if (postExecutionOverhead != null)
				msgs = ((InternalEObject)postExecutionOverhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD, null, msgs);
			if (newPostExecutionOverhead != null)
				msgs = ((InternalEObject)newPostExecutionOverhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD, null, msgs);
			msgs = basicSetPostExecutionOverhead(newPostExecutionOverhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD, newPostExecutionOverhead, newPostExecutionOverhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD:
				return basicSetPreExecutionOverhead(null, msgs);
			case AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD:
				return basicSetPostExecutionOverhead(null, msgs);
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
			case AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD:
				return getPreExecutionOverhead();
			case AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD:
				return getPostExecutionOverhead();
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
			case AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD:
				setPreExecutionOverhead((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD:
				setPostExecutionOverhead((Ticks)newValue);
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
			case AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD:
				setPreExecutionOverhead((Ticks)null);
				return;
			case AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD:
				setPostExecutionOverhead((Ticks)null);
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
			case AmaltheaPackage.OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD:
				return preExecutionOverhead != null;
			case AmaltheaPackage.OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD:
				return postExecutionOverhead != null;
		}
		return super.eIsSet(featureID);
	}

} //OsISROverheadImpl
