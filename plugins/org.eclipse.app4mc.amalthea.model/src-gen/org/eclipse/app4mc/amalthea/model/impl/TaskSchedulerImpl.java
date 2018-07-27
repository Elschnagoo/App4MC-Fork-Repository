/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

import java.lang.Iterable;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.SchedulerAssociation;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl#getParentAssociation <em>Parent Association</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl#getChildAssociations <em>Child Associations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl#getTaskAllocations <em>Task Allocations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl#getParentScheduler <em>Parent Scheduler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl#getChildSchedulers <em>Child Schedulers</em>}</li>
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
	 * The cached value of the '{@link #getParentAssociation() <em>Parent Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAssociation()
	 * @generated
	 * @ordered
	 */
	protected SchedulerAssociation parentAssociation;

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
	public SchedulerAssociation getParentAssociation() {
		return parentAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAssociation(SchedulerAssociation newParentAssociation, NotificationChain msgs) {
		SchedulerAssociation oldParentAssociation = parentAssociation;
		parentAssociation = newParentAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION, oldParentAssociation, newParentAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAssociation(SchedulerAssociation newParentAssociation) {
		if (newParentAssociation != parentAssociation) {
			NotificationChain msgs = null;
			if (parentAssociation != null)
				msgs = ((InternalEObject)parentAssociation).eInverseRemove(this, AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD, SchedulerAssociation.class, msgs);
			if (newParentAssociation != null)
				msgs = ((InternalEObject)newParentAssociation).eInverseAdd(this, AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD, SchedulerAssociation.class, msgs);
			msgs = basicSetParentAssociation(newParentAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION, newParentAssociation, newParentAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulerAssociation> getChildAssociations() {
		EReference _schedulerAssociation_Parent = AmaltheaPackage.eINSTANCE.getSchedulerAssociation_Parent();
		return AmaltheaIndex.<SchedulerAssociation>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getTaskScheduler_ChildAssociations(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_schedulerAssociation_Parent)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskAllocation> getTaskAllocations() {
		EReference _taskAllocation_Scheduler = AmaltheaPackage.eINSTANCE.getTaskAllocation_Scheduler();
		return AmaltheaIndex.<TaskAllocation>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getTaskScheduler_TaskAllocations(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_taskAllocation_Scheduler)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler getParentScheduler() {
		TaskScheduler parentScheduler = basicGetParentScheduler();
		return parentScheduler != null && parentScheduler.eIsProxy() ? (TaskScheduler)eResolveProxy((InternalEObject)parentScheduler) : parentScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler basicGetParentScheduler() {
		SchedulerAssociation _parentAssociation = this.getParentAssociation();
		TaskScheduler _parent = null;
		if (_parentAssociation!=null) {
			_parent=_parentAssociation.getParent();
		}
		return _parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskScheduler> getChildSchedulers() {
		final Function1<SchedulerAssociation, TaskScheduler> _function = new Function1<SchedulerAssociation, TaskScheduler>() {
			public TaskScheduler apply(final SchedulerAssociation it) {
				return it.getChild();
			}
		};
		final Iterable<TaskScheduler> result = IterableExtensions.<TaskScheduler>filterNull(XcoreEListExtensions.<SchedulerAssociation, TaskScheduler>map(this.getChildAssociations(), _function));
		EReference _taskScheduler_ChildSchedulers = AmaltheaPackage.eINSTANCE.getTaskScheduler_ChildSchedulers();
		int _size = IterableExtensions.size(result);
		Object[] _array = IterableExtensions.<TaskScheduler>toList(result).toArray();
		return new UnmodifiableEList<TaskScheduler>(((InternalEObject) this), _taskScheduler_ChildSchedulers, _size, _array);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION:
				if (parentAssociation != null)
					msgs = ((InternalEObject)parentAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION, null, msgs);
				return basicSetParentAssociation((SchedulerAssociation)otherEnd, msgs);
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
			case AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM:
				return basicSetSchedulingAlgorithm(null, msgs);
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION:
				return basicSetParentAssociation(null, msgs);
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
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION:
				return getParentAssociation();
			case AmaltheaPackage.TASK_SCHEDULER__CHILD_ASSOCIATIONS:
				return getChildAssociations();
			case AmaltheaPackage.TASK_SCHEDULER__TASK_ALLOCATIONS:
				return getTaskAllocations();
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_SCHEDULER:
				if (resolve) return getParentScheduler();
				return basicGetParentScheduler();
			case AmaltheaPackage.TASK_SCHEDULER__CHILD_SCHEDULERS:
				return getChildSchedulers();
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
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION:
				setParentAssociation((SchedulerAssociation)newValue);
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
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION:
				setParentAssociation((SchedulerAssociation)null);
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
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION:
				return parentAssociation != null;
			case AmaltheaPackage.TASK_SCHEDULER__CHILD_ASSOCIATIONS:
				return !getChildAssociations().isEmpty();
			case AmaltheaPackage.TASK_SCHEDULER__TASK_ALLOCATIONS:
				return !getTaskAllocations().isEmpty();
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_SCHEDULER:
				return basicGetParentScheduler() != null;
			case AmaltheaPackage.TASK_SCHEDULER__CHILD_SCHEDULERS:
				return !getChildSchedulers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskSchedulerImpl
