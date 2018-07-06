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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype;
import org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.Preemption;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl#getPreemption <em>Preemption</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl#getFirstRunnable <em>First Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl#getLastRunnable <em>Last Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl#getAccessPrecedenceSpec <em>Access Precedence Spec</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl#getOrderPrecedenceSpec <em>Order Precedence Spec</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl#getChainedPrototypes <em>Chained Prototypes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl#getRunnableCalls <em>Runnable Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessPrototypeImpl extends AbstractProcessImpl implements ProcessPrototype {
	/**
	 * The default value of the '{@link #getPreemption() <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemption()
	 * @generated
	 * @ordered
	 */
	protected static final Preemption PREEMPTION_EDEFAULT = Preemption._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getPreemption() <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemption()
	 * @generated
	 * @ordered
	 */
	protected Preemption preemption = PREEMPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirstRunnable() <em>First Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRunnable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable firstRunnable;

	/**
	 * The cached value of the '{@link #getLastRunnable() <em>Last Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRunnable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable lastRunnable;

	/**
	 * The cached value of the '{@link #getAccessPrecedenceSpec() <em>Access Precedence Spec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPrecedenceSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessPrecedenceSpec> accessPrecedenceSpec;

	/**
	 * The cached value of the '{@link #getOrderPrecedenceSpec() <em>Order Precedence Spec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPrecedenceSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderPrecedenceSpec> orderPrecedenceSpec;

	/**
	 * The cached value of the '{@link #getChainedPrototypes() <em>Chained Prototypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainedPrototypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainedProcessPrototype> chainedPrototypes;

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
	 * The cached value of the '{@link #getRunnableCalls() <em>Runnable Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskRunnableCall> runnableCalls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProcessPrototype();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preemption getPreemption() {
		return preemption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreemption(Preemption newPreemption) {
		Preemption oldPreemption = preemption;
		preemption = newPreemption == null ? PREEMPTION_EDEFAULT : newPreemption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_PROTOTYPE__PREEMPTION, oldPreemption, preemption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getFirstRunnable() {
		if (firstRunnable != null && firstRunnable.eIsProxy()) {
			InternalEObject oldFirstRunnable = (InternalEObject)firstRunnable;
			firstRunnable = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldFirstRunnable);
			if (firstRunnable != oldFirstRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESS_PROTOTYPE__FIRST_RUNNABLE, oldFirstRunnable, firstRunnable));
			}
		}
		return firstRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetFirstRunnable() {
		return firstRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRunnable(org.eclipse.app4mc.amalthea.model.Runnable newFirstRunnable) {
		org.eclipse.app4mc.amalthea.model.Runnable oldFirstRunnable = firstRunnable;
		firstRunnable = newFirstRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_PROTOTYPE__FIRST_RUNNABLE, oldFirstRunnable, firstRunnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getLastRunnable() {
		if (lastRunnable != null && lastRunnable.eIsProxy()) {
			InternalEObject oldLastRunnable = (InternalEObject)lastRunnable;
			lastRunnable = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldLastRunnable);
			if (lastRunnable != oldLastRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESS_PROTOTYPE__LAST_RUNNABLE, oldLastRunnable, lastRunnable));
			}
		}
		return lastRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetLastRunnable() {
		return lastRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRunnable(org.eclipse.app4mc.amalthea.model.Runnable newLastRunnable) {
		org.eclipse.app4mc.amalthea.model.Runnable oldLastRunnable = lastRunnable;
		lastRunnable = newLastRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_PROTOTYPE__LAST_RUNNABLE, oldLastRunnable, lastRunnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessPrecedenceSpec> getAccessPrecedenceSpec() {
		if (accessPrecedenceSpec == null) {
			accessPrecedenceSpec = new EObjectContainmentEList<AccessPrecedenceSpec>(AccessPrecedenceSpec.class, this, AmaltheaPackage.PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC);
		}
		return accessPrecedenceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderPrecedenceSpec> getOrderPrecedenceSpec() {
		if (orderPrecedenceSpec == null) {
			orderPrecedenceSpec = new EObjectContainmentEList<OrderPrecedenceSpec>(OrderPrecedenceSpec.class, this, AmaltheaPackage.PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC);
		}
		return orderPrecedenceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainedProcessPrototype> getChainedPrototypes() {
		if (chainedPrototypes == null) {
			chainedPrototypes = new EObjectContainmentEList<ChainedProcessPrototype>(ChainedProcessPrototype.class, this, AmaltheaPackage.PROCESS_PROTOTYPE__CHAINED_PROTOTYPES);
		}
		return chainedPrototypes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESS_PROTOTYPE__ACTIVATION, oldActivation, activation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_PROTOTYPE__ACTIVATION, oldActivation, activation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskRunnableCall> getRunnableCalls() {
		if (runnableCalls == null) {
			runnableCalls = new EObjectContainmentEList<TaskRunnableCall>(TaskRunnableCall.class, this, AmaltheaPackage.PROCESS_PROTOTYPE__RUNNABLE_CALLS);
		}
		return runnableCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC:
				return ((InternalEList<?>)getAccessPrecedenceSpec()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC:
				return ((InternalEList<?>)getOrderPrecedenceSpec()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.PROCESS_PROTOTYPE__CHAINED_PROTOTYPES:
				return ((InternalEList<?>)getChainedPrototypes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.PROCESS_PROTOTYPE__RUNNABLE_CALLS:
				return ((InternalEList<?>)getRunnableCalls()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.PROCESS_PROTOTYPE__PREEMPTION:
				return getPreemption();
			case AmaltheaPackage.PROCESS_PROTOTYPE__FIRST_RUNNABLE:
				if (resolve) return getFirstRunnable();
				return basicGetFirstRunnable();
			case AmaltheaPackage.PROCESS_PROTOTYPE__LAST_RUNNABLE:
				if (resolve) return getLastRunnable();
				return basicGetLastRunnable();
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC:
				return getAccessPrecedenceSpec();
			case AmaltheaPackage.PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC:
				return getOrderPrecedenceSpec();
			case AmaltheaPackage.PROCESS_PROTOTYPE__CHAINED_PROTOTYPES:
				return getChainedPrototypes();
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACTIVATION:
				if (resolve) return getActivation();
				return basicGetActivation();
			case AmaltheaPackage.PROCESS_PROTOTYPE__RUNNABLE_CALLS:
				return getRunnableCalls();
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
			case AmaltheaPackage.PROCESS_PROTOTYPE__PREEMPTION:
				setPreemption((Preemption)newValue);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__FIRST_RUNNABLE:
				setFirstRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__LAST_RUNNABLE:
				setLastRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC:
				getAccessPrecedenceSpec().clear();
				getAccessPrecedenceSpec().addAll((Collection<? extends AccessPrecedenceSpec>)newValue);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC:
				getOrderPrecedenceSpec().clear();
				getOrderPrecedenceSpec().addAll((Collection<? extends OrderPrecedenceSpec>)newValue);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__CHAINED_PROTOTYPES:
				getChainedPrototypes().clear();
				getChainedPrototypes().addAll((Collection<? extends ChainedProcessPrototype>)newValue);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACTIVATION:
				setActivation((Activation)newValue);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__RUNNABLE_CALLS:
				getRunnableCalls().clear();
				getRunnableCalls().addAll((Collection<? extends TaskRunnableCall>)newValue);
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
			case AmaltheaPackage.PROCESS_PROTOTYPE__PREEMPTION:
				setPreemption(PREEMPTION_EDEFAULT);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__FIRST_RUNNABLE:
				setFirstRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__LAST_RUNNABLE:
				setLastRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC:
				getAccessPrecedenceSpec().clear();
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC:
				getOrderPrecedenceSpec().clear();
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__CHAINED_PROTOTYPES:
				getChainedPrototypes().clear();
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACTIVATION:
				setActivation((Activation)null);
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__RUNNABLE_CALLS:
				getRunnableCalls().clear();
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
			case AmaltheaPackage.PROCESS_PROTOTYPE__PREEMPTION:
				return preemption != PREEMPTION_EDEFAULT;
			case AmaltheaPackage.PROCESS_PROTOTYPE__FIRST_RUNNABLE:
				return firstRunnable != null;
			case AmaltheaPackage.PROCESS_PROTOTYPE__LAST_RUNNABLE:
				return lastRunnable != null;
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC:
				return accessPrecedenceSpec != null && !accessPrecedenceSpec.isEmpty();
			case AmaltheaPackage.PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC:
				return orderPrecedenceSpec != null && !orderPrecedenceSpec.isEmpty();
			case AmaltheaPackage.PROCESS_PROTOTYPE__CHAINED_PROTOTYPES:
				return chainedPrototypes != null && !chainedPrototypes.isEmpty();
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACTIVATION:
				return activation != null;
			case AmaltheaPackage.PROCESS_PROTOTYPE__RUNNABLE_CALLS:
				return runnableCalls != null && !runnableCalls.isEmpty();
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
		result.append(" (preemption: ");
		result.append(preemption);
		result.append(')');
		return result.toString();
	}

} //ProcessPrototypeImpl
