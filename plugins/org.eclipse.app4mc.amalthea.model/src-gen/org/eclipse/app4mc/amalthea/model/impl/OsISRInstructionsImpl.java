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
import org.eclipse.app4mc.amalthea.model.Instructions;
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
	protected Instructions preExecutionOverhead;

	/**
	 * The cached value of the '{@link #getPostExecutionOverhead() <em>Post Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostExecutionOverhead()
	 * @generated
	 * @ordered
	 */
	protected Instructions postExecutionOverhead;

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
	public Instructions getPreExecutionOverhead() {
		return preExecutionOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreExecutionOverhead(Instructions newPreExecutionOverhead, NotificationChain msgs) {
		Instructions oldPreExecutionOverhead = preExecutionOverhead;
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
	public void setPreExecutionOverhead(Instructions newPreExecutionOverhead) {
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
	public Instructions getPostExecutionOverhead() {
		return postExecutionOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostExecutionOverhead(Instructions newPostExecutionOverhead, NotificationChain msgs) {
		Instructions oldPostExecutionOverhead = postExecutionOverhead;
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
	public void setPostExecutionOverhead(Instructions newPostExecutionOverhead) {
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
				return getPreExecutionOverhead();
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD:
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
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD:
				setPreExecutionOverhead((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD:
				setPostExecutionOverhead((Instructions)newValue);
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
				setPreExecutionOverhead((Instructions)null);
				return;
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD:
				setPostExecutionOverhead((Instructions)null);
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
