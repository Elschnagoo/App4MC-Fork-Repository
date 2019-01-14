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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerAllocationImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerAllocationImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerAllocationImpl#getExecutingPU <em>Executing PU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerAllocationImpl extends BaseObjectImpl implements SchedulerAllocation {
	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler scheduler;

	/**
	 * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingUnit> responsibility;

	/**
	 * The cached value of the '{@link #getExecutingPU() <em>Executing PU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutingPU()
	 * @generated
	 * @ordered
	 */
	protected ProcessingUnit executingPU;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSchedulerAllocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getScheduler() {
		if (scheduler != null && scheduler.eIsProxy()) {
			InternalEObject oldScheduler = (InternalEObject)scheduler;
			scheduler = (Scheduler)eResolveProxy(oldScheduler);
			if (scheduler != oldScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SCHEDULER_ALLOCATION__SCHEDULER, oldScheduler, scheduler));
			}
		}
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(Scheduler newScheduler) {
		Scheduler oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_ALLOCATION__SCHEDULER, oldScheduler, scheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingUnit> getResponsibility() {
		if (responsibility == null) {
			responsibility = new EObjectResolvingEList<ProcessingUnit>(ProcessingUnit.class, this, AmaltheaPackage.SCHEDULER_ALLOCATION__RESPONSIBILITY);
		}
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnit getExecutingPU() {
		if (executingPU != null && executingPU.eIsProxy()) {
			InternalEObject oldExecutingPU = (InternalEObject)executingPU;
			executingPU = (ProcessingUnit)eResolveProxy(oldExecutingPU);
			if (executingPU != oldExecutingPU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_PU, oldExecutingPU, executingPU));
			}
		}
		return executingPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnit basicGetExecutingPU() {
		return executingPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutingPU(ProcessingUnit newExecutingPU) {
		ProcessingUnit oldExecutingPU = executingPU;
		executingPU = newExecutingPU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_PU, oldExecutingPU, executingPU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.SCHEDULER_ALLOCATION__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
			case AmaltheaPackage.SCHEDULER_ALLOCATION__RESPONSIBILITY:
				return getResponsibility();
			case AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_PU:
				if (resolve) return getExecutingPU();
				return basicGetExecutingPU();
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
			case AmaltheaPackage.SCHEDULER_ALLOCATION__SCHEDULER:
				setScheduler((Scheduler)newValue);
				return;
			case AmaltheaPackage.SCHEDULER_ALLOCATION__RESPONSIBILITY:
				getResponsibility().clear();
				getResponsibility().addAll((Collection<? extends ProcessingUnit>)newValue);
				return;
			case AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_PU:
				setExecutingPU((ProcessingUnit)newValue);
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
			case AmaltheaPackage.SCHEDULER_ALLOCATION__SCHEDULER:
				setScheduler((Scheduler)null);
				return;
			case AmaltheaPackage.SCHEDULER_ALLOCATION__RESPONSIBILITY:
				getResponsibility().clear();
				return;
			case AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_PU:
				setExecutingPU((ProcessingUnit)null);
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
			case AmaltheaPackage.SCHEDULER_ALLOCATION__SCHEDULER:
				return scheduler != null;
			case AmaltheaPackage.SCHEDULER_ALLOCATION__RESPONSIBILITY:
				return responsibility != null && !responsibility.isEmpty();
			case AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_PU:
				return executingPU != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulerAllocationImpl
