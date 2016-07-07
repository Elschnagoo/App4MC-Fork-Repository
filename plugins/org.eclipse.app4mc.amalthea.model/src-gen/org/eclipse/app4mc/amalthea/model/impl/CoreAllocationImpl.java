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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.Scheduler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreAllocationImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreAllocationImpl#getCore <em>Core</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreAllocationImpl#getSchedulerLinkInt <em>Scheduler Link Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreAllocationImpl extends BaseObjectImpl implements CoreAllocation {
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
	 * The cached value of the '{@link #getCore() <em>Core</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> core;

	/**
	 * The cached value of the '{@link #getSchedulerLinkInt() <em>Scheduler Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerLinkInt()
	 * @generated
	 * @ordered
	 */
	protected Scheduler schedulerLinkInt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCoreAllocation();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CORE_ALLOCATION__SCHEDULER, oldScheduler, scheduler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE_ALLOCATION__SCHEDULER, oldScheduler, scheduler));
 		//Additional setting transient value for transient bi-directional reference
 		setSchedulerLinkInt(newScheduler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCore() {
		if (core == null) {
			core = new EObjectResolvingEList<Core>(Core.class, this, AmaltheaPackage.CORE_ALLOCATION__CORE);
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getSchedulerLinkInt() {
		if (schedulerLinkInt != null && schedulerLinkInt.eIsProxy()) {
			InternalEObject oldSchedulerLinkInt = (InternalEObject)schedulerLinkInt;
			schedulerLinkInt = (Scheduler)eResolveProxy(oldSchedulerLinkInt);
			if (schedulerLinkInt != oldSchedulerLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT, oldSchedulerLinkInt, schedulerLinkInt));
			}
		}
		return schedulerLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetSchedulerLinkInt() {
		return schedulerLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulerLinkInt(Scheduler newSchedulerLinkInt, NotificationChain msgs) {
		Scheduler oldSchedulerLinkInt = schedulerLinkInt;
		schedulerLinkInt = newSchedulerLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT, oldSchedulerLinkInt, newSchedulerLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulerLinkInt(Scheduler newSchedulerLinkInt) {
		if (newSchedulerLinkInt != schedulerLinkInt) {
			NotificationChain msgs = null;
			if (schedulerLinkInt != null)
				msgs = ((InternalEObject)schedulerLinkInt).eInverseRemove(this, AmaltheaPackage.SCHEDULER__CORE_ALLOCATION, Scheduler.class, msgs);
			if (newSchedulerLinkInt != null)
				msgs = ((InternalEObject)newSchedulerLinkInt).eInverseAdd(this, AmaltheaPackage.SCHEDULER__CORE_ALLOCATION, Scheduler.class, msgs);
			msgs = basicSetSchedulerLinkInt(newSchedulerLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT, newSchedulerLinkInt, newSchedulerLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT:
				if (schedulerLinkInt != null)
					msgs = ((InternalEObject)schedulerLinkInt).eInverseRemove(this, AmaltheaPackage.SCHEDULER__CORE_ALLOCATION, Scheduler.class, msgs);
				return basicSetSchedulerLinkInt((Scheduler)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT:
				return basicSetSchedulerLinkInt(null, msgs);
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
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
			case AmaltheaPackage.CORE_ALLOCATION__CORE:
				return getCore();
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT:
				if (resolve) return getSchedulerLinkInt();
				return basicGetSchedulerLinkInt();
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
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER:
				setScheduler((Scheduler)newValue);
				return;
			case AmaltheaPackage.CORE_ALLOCATION__CORE:
				getCore().clear();
				getCore().addAll((Collection<? extends Core>)newValue);
				return;
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT:
				setSchedulerLinkInt((Scheduler)newValue);
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
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER:
				setScheduler((Scheduler)null);
				return;
			case AmaltheaPackage.CORE_ALLOCATION__CORE:
				getCore().clear();
				return;
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT:
				setSchedulerLinkInt((Scheduler)null);
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
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER:
				return scheduler != null;
			case AmaltheaPackage.CORE_ALLOCATION__CORE:
				return core != null && !core.isEmpty();
			case AmaltheaPackage.CORE_ALLOCATION__SCHEDULER_LINK_INT:
				return schedulerLinkInt != null;
		}
		return super.eIsSet(featureID);
	}

} //CoreAllocationImpl
