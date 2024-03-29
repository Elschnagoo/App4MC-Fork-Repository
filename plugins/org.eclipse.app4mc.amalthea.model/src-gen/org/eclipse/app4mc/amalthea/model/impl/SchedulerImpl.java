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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.Algorithm;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ComputationItem;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerImpl#getComputationItems <em>Computation Items</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerImpl#getSchedulerAllocations <em>Scheduler Allocations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerImpl#getRunnableAllocations <em>Runnable Allocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchedulerImpl extends ReferableBaseObjectImpl implements Scheduler {
	/**
	 * The cached value of the '{@link #getComputationItems() <em>Computation Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputationItem> computationItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getScheduler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputationItem> getComputationItems() {
		if (computationItems == null) {
			computationItems = new EObjectContainmentEList<ComputationItem>(ComputationItem.class, this, AmaltheaPackage.SCHEDULER__COMPUTATION_ITEMS);
		}
		return computationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchedulerAllocation> getSchedulerAllocations() {
		EReference _schedulerAllocation_Scheduler = AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Scheduler();
		return AmaltheaIndex.<SchedulerAllocation>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getScheduler_SchedulerAllocations(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_schedulerAllocation_Scheduler)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RunnableAllocation> getRunnableAllocations() {
		EReference _runnableAllocation_Scheduler = AmaltheaPackage.eINSTANCE.getRunnableAllocation_Scheduler();
		return AmaltheaIndex.<RunnableAllocation>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getScheduler_RunnableAllocations(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_runnableAllocation_Scheduler)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithm getSchedulingAlgorithm() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SCHEDULER__COMPUTATION_ITEMS:
				return ((InternalEList<?>)getComputationItems()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.SCHEDULER__COMPUTATION_ITEMS:
				return getComputationItems();
			case AmaltheaPackage.SCHEDULER__SCHEDULER_ALLOCATIONS:
				return getSchedulerAllocations();
			case AmaltheaPackage.SCHEDULER__RUNNABLE_ALLOCATIONS:
				return getRunnableAllocations();
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
			case AmaltheaPackage.SCHEDULER__COMPUTATION_ITEMS:
				getComputationItems().clear();
				getComputationItems().addAll((Collection<? extends ComputationItem>)newValue);
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
			case AmaltheaPackage.SCHEDULER__COMPUTATION_ITEMS:
				getComputationItems().clear();
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
			case AmaltheaPackage.SCHEDULER__COMPUTATION_ITEMS:
				return computationItems != null && !computationItems.isEmpty();
			case AmaltheaPackage.SCHEDULER__SCHEDULER_ALLOCATIONS:
				return !getSchedulerAllocations().isEmpty();
			case AmaltheaPackage.SCHEDULER__RUNNABLE_ALLOCATIONS:
				return !getRunnableAllocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.SCHEDULER___GET_SCHEDULING_ALGORITHM:
				return getSchedulingAlgorithm();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SchedulerImpl
