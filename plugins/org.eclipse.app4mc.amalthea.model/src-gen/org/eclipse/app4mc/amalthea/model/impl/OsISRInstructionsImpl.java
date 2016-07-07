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
import org.eclipse.app4mc.amalthea.model.OsExecutionInstructions;
import org.eclipse.app4mc.amalthea.model.OsISRInstructions;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os ISR Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsISRInstructionsImpl#getPreExecutionOverhead <em>Pre Execution Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsISRInstructionsImpl#getPostExecutionOverhead <em>Post Execution Overhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsISRInstructionsImpl extends BaseObjectImpl implements OsISRInstructions {
	/**
	 * The cached value of the '{@link #getPreExecutionOverhead() <em>Pre Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreExecutionOverhead()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions preExecutionOverhead;

	/**
	 * The cached value of the '{@link #getPostExecutionOverhead() <em>Post Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostExecutionOverhead()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions postExecutionOverhead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsISRInstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsISRInstructions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions getPreExecutionOverhead() {
		if (preExecutionOverhead != null && preExecutionOverhead.eIsProxy()) {
			InternalEObject oldPreExecutionOverhead = (InternalEObject)preExecutionOverhead;
			preExecutionOverhead = (OsExecutionInstructions)eResolveProxy(oldPreExecutionOverhead);
			if (preExecutionOverhead != oldPreExecutionOverhead) {
				InternalEObject newPreExecutionOverhead = (InternalEObject)preExecutionOverhead;
				NotificationChain msgs = oldPreExecutionOverhead.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD, null, null);
				if (newPreExecutionOverhead.eInternalContainer() == null) {
					msgs = newPreExecutionOverhead.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD, oldPreExecutionOverhead, preExecutionOverhead));
			}
		}
		return preExecutionOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetPreExecutionOverhead() {
		return preExecutionOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreExecutionOverhead(OsExecutionInstructions newPreExecutionOverhead, NotificationChain msgs) {
		OsExecutionInstructions oldPreExecutionOverhead = preExecutionOverhead;
		preExecutionOverhead = newPreExecutionOverhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD, oldPreExecutionOverhead, newPreExecutionOverhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreExecutionOverhead(OsExecutionInstructions newPreExecutionOverhead) {
		if (newPreExecutionOverhead != preExecutionOverhead) {
			NotificationChain msgs = null;
			if (preExecutionOverhead != null)
				msgs = ((InternalEObject)preExecutionOverhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD, null, msgs);
			if (newPreExecutionOverhead != null)
				msgs = ((InternalEObject)newPreExecutionOverhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD, null, msgs);
			msgs = basicSetPreExecutionOverhead(newPreExecutionOverhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD, newPreExecutionOverhead, newPreExecutionOverhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions getPostExecutionOverhead() {
		if (postExecutionOverhead != null && postExecutionOverhead.eIsProxy()) {
			InternalEObject oldPostExecutionOverhead = (InternalEObject)postExecutionOverhead;
			postExecutionOverhead = (OsExecutionInstructions)eResolveProxy(oldPostExecutionOverhead);
			if (postExecutionOverhead != oldPostExecutionOverhead) {
				InternalEObject newPostExecutionOverhead = (InternalEObject)postExecutionOverhead;
				NotificationChain msgs = oldPostExecutionOverhead.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD, null, null);
				if (newPostExecutionOverhead.eInternalContainer() == null) {
					msgs = newPostExecutionOverhead.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD, oldPostExecutionOverhead, postExecutionOverhead));
			}
		}
		return postExecutionOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetPostExecutionOverhead() {
		return postExecutionOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostExecutionOverhead(OsExecutionInstructions newPostExecutionOverhead, NotificationChain msgs) {
		OsExecutionInstructions oldPostExecutionOverhead = postExecutionOverhead;
		postExecutionOverhead = newPostExecutionOverhead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD, oldPostExecutionOverhead, newPostExecutionOverhead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostExecutionOverhead(OsExecutionInstructions newPostExecutionOverhead) {
		if (newPostExecutionOverhead != postExecutionOverhead) {
			NotificationChain msgs = null;
			if (postExecutionOverhead != null)
				msgs = ((InternalEObject)postExecutionOverhead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD, null, msgs);
			if (newPostExecutionOverhead != null)
				msgs = ((InternalEObject)newPostExecutionOverhead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD, null, msgs);
			msgs = basicSetPostExecutionOverhead(newPostExecutionOverhead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD, newPostExecutionOverhead, newPostExecutionOverhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD:
				return basicSetPreExecutionOverhead(null, msgs);
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD:
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
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD:
				if (resolve) return getPreExecutionOverhead();
				return basicGetPreExecutionOverhead();
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD:
				if (resolve) return getPostExecutionOverhead();
				return basicGetPostExecutionOverhead();
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
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD:
				setPreExecutionOverhead((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD:
				setPostExecutionOverhead((OsExecutionInstructions)newValue);
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
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD:
				setPreExecutionOverhead((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD:
				setPostExecutionOverhead((OsExecutionInstructions)null);
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
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD:
				return preExecutionOverhead != null;
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD:
				return postExecutionOverhead != null;
		}
		return super.eIsSet(featureID);
	}

} //OsISRInstructionsImpl
