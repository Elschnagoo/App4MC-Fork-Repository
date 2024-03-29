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
import org.eclipse.app4mc.amalthea.model.SchedulingParameters;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskAllocationImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskAllocationImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskAllocationImpl#getAffinity <em>Affinity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskAllocationImpl#getSchedulingParameters <em>Scheduling Parameters</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TaskAllocationImpl#getParameterExtensions <em>Parameter Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskAllocationImpl extends BaseObjectImpl implements TaskAllocation {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected TaskScheduler scheduler;

	/**
	 * The cached value of the '{@link #getAffinity() <em>Affinity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingUnit> affinity;

	/**
	 * The cached value of the '{@link #getSchedulingParameters() <em>Scheduling Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingParameters()
	 * @generated
	 * @ordered
	 */
	protected SchedulingParameters schedulingParameters;

	/**
	 * The cached value of the '{@link #getParameterExtensions() <em>Parameter Extensions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterExtensions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> parameterExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTaskAllocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.TASK_ALLOCATION__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TASK_ALLOCATION__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskScheduler getScheduler() {
		if (scheduler != null && scheduler.eIsProxy()) {
			InternalEObject oldScheduler = (InternalEObject)scheduler;
			scheduler = (TaskScheduler)eResolveProxy(oldScheduler);
			if (scheduler != oldScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.TASK_ALLOCATION__SCHEDULER, oldScheduler, scheduler));
			}
		}
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler basicGetScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduler(TaskScheduler newScheduler) {
		TaskScheduler oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TASK_ALLOCATION__SCHEDULER, oldScheduler, scheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessingUnit> getAffinity() {
		if (affinity == null) {
			affinity = new EObjectResolvingEList<ProcessingUnit>(ProcessingUnit.class, this, AmaltheaPackage.TASK_ALLOCATION__AFFINITY);
		}
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingParameters getSchedulingParameters() {
		return schedulingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulingParameters(SchedulingParameters newSchedulingParameters, NotificationChain msgs) {
		SchedulingParameters oldSchedulingParameters = schedulingParameters;
		schedulingParameters = newSchedulingParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS, oldSchedulingParameters, newSchedulingParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedulingParameters(SchedulingParameters newSchedulingParameters) {
		if (newSchedulingParameters != schedulingParameters) {
			NotificationChain msgs = null;
			if (schedulingParameters != null)
				msgs = ((InternalEObject)schedulingParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS, null, msgs);
			if (newSchedulingParameters != null)
				msgs = ((InternalEObject)newSchedulingParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS, null, msgs);
			msgs = basicSetSchedulingParameters(newSchedulingParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS, newSchedulingParameters, newSchedulingParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getParameterExtensions() {
		if (parameterExtensions == null) {
			parameterExtensions = new EcoreEMap<String,String>(AmaltheaPackage.eINSTANCE.getParameterExtension(), ParameterExtensionImpl.class, this, AmaltheaPackage.TASK_ALLOCATION__PARAMETER_EXTENSIONS);
		}
		return parameterExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS:
				return basicSetSchedulingParameters(null, msgs);
			case AmaltheaPackage.TASK_ALLOCATION__PARAMETER_EXTENSIONS:
				return ((InternalEList<?>)getParameterExtensions()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.TASK_ALLOCATION__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
			case AmaltheaPackage.TASK_ALLOCATION__AFFINITY:
				return getAffinity();
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS:
				return getSchedulingParameters();
			case AmaltheaPackage.TASK_ALLOCATION__PARAMETER_EXTENSIONS:
				if (coreType) return getParameterExtensions();
				else return getParameterExtensions().map();
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
			case AmaltheaPackage.TASK_ALLOCATION__TASK:
				setTask((Task)newValue);
				return;
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULER:
				setScheduler((TaskScheduler)newValue);
				return;
			case AmaltheaPackage.TASK_ALLOCATION__AFFINITY:
				getAffinity().clear();
				getAffinity().addAll((Collection<? extends ProcessingUnit>)newValue);
				return;
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS:
				setSchedulingParameters((SchedulingParameters)newValue);
				return;
			case AmaltheaPackage.TASK_ALLOCATION__PARAMETER_EXTENSIONS:
				((EStructuralFeature.Setting)getParameterExtensions()).set(newValue);
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
			case AmaltheaPackage.TASK_ALLOCATION__TASK:
				setTask((Task)null);
				return;
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULER:
				setScheduler((TaskScheduler)null);
				return;
			case AmaltheaPackage.TASK_ALLOCATION__AFFINITY:
				getAffinity().clear();
				return;
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS:
				setSchedulingParameters((SchedulingParameters)null);
				return;
			case AmaltheaPackage.TASK_ALLOCATION__PARAMETER_EXTENSIONS:
				getParameterExtensions().clear();
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
			case AmaltheaPackage.TASK_ALLOCATION__TASK:
				return task != null;
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULER:
				return scheduler != null;
			case AmaltheaPackage.TASK_ALLOCATION__AFFINITY:
				return affinity != null && !affinity.isEmpty();
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS:
				return schedulingParameters != null;
			case AmaltheaPackage.TASK_ALLOCATION__PARAMETER_EXTENSIONS:
				return parameterExtensions != null && !parameterExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskAllocationImpl
