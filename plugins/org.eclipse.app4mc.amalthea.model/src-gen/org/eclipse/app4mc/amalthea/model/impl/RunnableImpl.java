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

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getRunnableItems <em>Runnable Items</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#isCallback <em>Callback</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#isService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getRunnableCalls <em>Runnable Calls</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getTaskRunnableCalls <em>Task Runnable Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableImpl extends AbstractElementMemoryInformationImpl implements org.eclipse.app4mc.amalthea.model.Runnable {
	/**
	 * The cached value of the '{@link #getRunnableItems() <em>Runnable Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableItems()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableItem> runnableItems;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected Activation activation;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected Time deadline;

	/**
	 * The default value of the '{@link #isCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallback()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLBACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallback()
	 * @generated
	 * @ordered
	 */
	protected boolean callback = CALLBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #isService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected boolean service = SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRunnableCalls() <em>Runnable Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableCall> runnableCalls;

	/**
	 * The cached value of the '{@link #getTaskRunnableCalls() <em>Task Runnable Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRunnableCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskRunnableCall> taskRunnableCalls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableItem> getRunnableItems() {
		if (runnableItems == null) {
			runnableItems = new EObjectContainmentEList.Resolving<RunnableItem>(RunnableItem.class, this, AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS);
		}
		return runnableItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation getActivation() {
		if (activation != null && activation.eIsProxy()) {
			InternalEObject oldActivation = (InternalEObject)activation;
			activation = (Activation)eResolveProxy(oldActivation);
			if (activation != oldActivation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE__ACTIVATION, oldActivation, activation));
			}
		}
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation basicGetActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation(Activation newActivation) {
		Activation oldActivation = activation;
		activation = newActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__ACTIVATION, oldActivation, activation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadline(Time newDeadline, NotificationChain msgs) {
		Time oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__DEADLINE, oldDeadline, newDeadline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(Time newDeadline) {
		if (newDeadline != deadline) {
			NotificationChain msgs = null;
			if (deadline != null)
				msgs = ((InternalEObject)deadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE__DEADLINE, null, msgs);
			if (newDeadline != null)
				msgs = ((InternalEObject)newDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE__DEADLINE, null, msgs);
			msgs = basicSetDeadline(newDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__DEADLINE, newDeadline, newDeadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallback() {
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallback(boolean newCallback) {
		boolean oldCallback = callback;
		callback = newCallback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__CALLBACK, oldCallback, callback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(boolean newService) {
		boolean oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableCall> getRunnableCalls() {
		if (runnableCalls == null) {
			runnableCalls = new EObjectWithInverseResolvingEList<RunnableCall>(RunnableCall.class, this, AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS, AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT);
		}
		return runnableCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskRunnableCall> getTaskRunnableCalls() {
		if (taskRunnableCalls == null) {
			taskRunnableCalls = new EObjectWithInverseResolvingEList<TaskRunnableCall>(TaskRunnableCall.class, this, AmaltheaPackage.RUNNABLE__TASK_RUNNABLE_CALLS, AmaltheaPackage.TASK_RUNNABLE_CALL__RUNNABLE_LINK_INT);
		}
		return taskRunnableCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRunnableCalls()).basicAdd(otherEnd, msgs);
			case AmaltheaPackage.RUNNABLE__TASK_RUNNABLE_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskRunnableCalls()).basicAdd(otherEnd, msgs);
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				return ((InternalEList<?>)getRunnableItems()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				return basicSetDeadline(null, msgs);
			case AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS:
				return ((InternalEList<?>)getRunnableCalls()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.RUNNABLE__TASK_RUNNABLE_CALLS:
				return ((InternalEList<?>)getTaskRunnableCalls()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				return getRunnableItems();
			case AmaltheaPackage.RUNNABLE__ACTIVATION:
				if (resolve) return getActivation();
				return basicGetActivation();
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				return getDeadline();
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				return isCallback();
			case AmaltheaPackage.RUNNABLE__SERVICE:
				return isService();
			case AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS:
				return getRunnableCalls();
			case AmaltheaPackage.RUNNABLE__TASK_RUNNABLE_CALLS:
				return getTaskRunnableCalls();
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				getRunnableItems().clear();
				getRunnableItems().addAll((Collection<? extends RunnableItem>)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__ACTIVATION:
				setActivation((Activation)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				setDeadline((Time)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				setCallback((Boolean)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				setService((Boolean)newValue);
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				getRunnableItems().clear();
				return;
			case AmaltheaPackage.RUNNABLE__ACTIVATION:
				setActivation((Activation)null);
				return;
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				setDeadline((Time)null);
				return;
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				setCallback(CALLBACK_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				setService(SERVICE_EDEFAULT);
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				return runnableItems != null && !runnableItems.isEmpty();
			case AmaltheaPackage.RUNNABLE__ACTIVATION:
				return activation != null;
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				return deadline != null;
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				return callback != CALLBACK_EDEFAULT;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				return service != SERVICE_EDEFAULT;
			case AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS:
				return runnableCalls != null && !runnableCalls.isEmpty();
			case AmaltheaPackage.RUNNABLE__TASK_RUNNABLE_CALLS:
				return taskRunnableCalls != null && !taskRunnableCalls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (callback: ");
		result.append(callback);
		result.append(", service: ");
		result.append(service);
		result.append(')');
		return result.toString();
	}

} //RunnableImpl
