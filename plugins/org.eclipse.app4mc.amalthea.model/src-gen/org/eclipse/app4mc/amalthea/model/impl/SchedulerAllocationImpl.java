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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Core;
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerAllocationImpl#getExecutingCore <em>Executing Core</em>}</li>
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
	protected EList<Core> responsibility;

	/**
	 * The cached value of the '{@link #getExecutingCore() <em>Executing Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutingCore()
	 * @generated
	 * @ordered
	 */
	protected Core executingCore;

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
	public EList<Core> getResponsibility() {
		if (responsibility == null) {
			responsibility = new EObjectResolvingEList<Core>(Core.class, this, AmaltheaPackage.SCHEDULER_ALLOCATION__RESPONSIBILITY);
		}
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core getExecutingCore() {
		if (executingCore != null && executingCore.eIsProxy()) {
			InternalEObject oldExecutingCore = (InternalEObject)executingCore;
			executingCore = (Core)eResolveProxy(oldExecutingCore);
			if (executingCore != oldExecutingCore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_CORE, oldExecutingCore, executingCore));
			}
		}
		return executingCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core basicGetExecutingCore() {
		return executingCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutingCore(Core newExecutingCore) {
		Core oldExecutingCore = executingCore;
		executingCore = newExecutingCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_CORE, oldExecutingCore, executingCore));
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
			case AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_CORE:
				if (resolve) return getExecutingCore();
				return basicGetExecutingCore();
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
				getResponsibility().addAll((Collection<? extends Core>)newValue);
				return;
			case AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_CORE:
				setExecutingCore((Core)newValue);
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
			case AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_CORE:
				setExecutingCore((Core)null);
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
			case AmaltheaPackage.SCHEDULER_ALLOCATION__EXECUTING_CORE:
				return executingCore != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulerAllocationImpl
