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
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskSchedulerImpl extends SchedulerImpl implements TaskScheduler {
	/**
	 * The cached value of the '{@link #getSchedulingAlgorithm() <em>Scheduling Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected TaskSchedulingAlgorithm schedulingAlgorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTaskScheduler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingAlgorithm getSchedulingAlgorithm() {
		return schedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulingAlgorithm(TaskSchedulingAlgorithm newSchedulingAlgorithm, NotificationChain msgs) {
		TaskSchedulingAlgorithm oldSchedulingAlgorithm = schedulingAlgorithm;
		schedulingAlgorithm = newSchedulingAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM, oldSchedulingAlgorithm, newSchedulingAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingAlgorithm(TaskSchedulingAlgorithm newSchedulingAlgorithm) {
		if (newSchedulingAlgorithm != schedulingAlgorithm) {
			NotificationChain msgs = null;
			if (schedulingAlgorithm != null)
				msgs = ((InternalEObject)schedulingAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM, null, msgs);
			if (newSchedulingAlgorithm != null)
				msgs = ((InternalEObject)newSchedulingAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM, null, msgs);
			msgs = basicSetSchedulingAlgorithm(newSchedulingAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM, newSchedulingAlgorithm, newSchedulingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM:
				return basicSetSchedulingAlgorithm(null, msgs);
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
			case AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM:
				return getSchedulingAlgorithm();
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
			case AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM:
				setSchedulingAlgorithm((TaskSchedulingAlgorithm)newValue);
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
			case AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM:
				setSchedulingAlgorithm((TaskSchedulingAlgorithm)null);
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
			case AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM:
				return schedulingAlgorithm != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskSchedulerImpl
