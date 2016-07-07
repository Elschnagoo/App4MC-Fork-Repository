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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Runnable Group Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessRunnableGroupEntryImpl#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessRunnableGroupEntryImpl#getProcessScope <em>Process Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRunnableGroupEntryImpl extends BaseObjectImpl implements ProcessRunnableGroupEntry {
	/**
	 * The cached value of the '{@link #getRunnable() <em>Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable runnable;

	/**
	 * The cached value of the '{@link #getProcessScope() <em>Process Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessScope()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractProcess> processScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRunnableGroupEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProcessRunnableGroupEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getRunnable() {
		if (runnable != null && runnable.eIsProxy()) {
			InternalEObject oldRunnable = (InternalEObject)runnable;
			runnable = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldRunnable);
			if (runnable != oldRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__RUNNABLE, oldRunnable, runnable));
			}
		}
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetRunnable() {
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunnable(org.eclipse.app4mc.amalthea.model.Runnable newRunnable) {
		org.eclipse.app4mc.amalthea.model.Runnable oldRunnable = runnable;
		runnable = newRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__RUNNABLE, oldRunnable, runnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractProcess> getProcessScope() {
		if (processScope == null) {
			processScope = new EObjectResolvingEList<AbstractProcess>(AbstractProcess.class, this, AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__PROCESS_SCOPE);
		}
		return processScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__RUNNABLE:
				if (resolve) return getRunnable();
				return basicGetRunnable();
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__PROCESS_SCOPE:
				return getProcessScope();
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
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
				return;
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__PROCESS_SCOPE:
				getProcessScope().clear();
				getProcessScope().addAll((Collection<? extends AbstractProcess>)newValue);
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
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
				return;
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__PROCESS_SCOPE:
				getProcessScope().clear();
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
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__RUNNABLE:
				return runnable != null;
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP_ENTRY__PROCESS_SCOPE:
				return processScope != null && !processScope.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessRunnableGroupEntryImpl
