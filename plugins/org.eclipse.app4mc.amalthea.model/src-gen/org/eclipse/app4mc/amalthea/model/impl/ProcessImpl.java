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
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.Stimulus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessImpl#getCallGraph <em>Call Graph</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessImpl#getStimuli <em>Stimuli</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessImpl extends AbstractProcessImpl implements org.eclipse.app4mc.amalthea.model.Process {
	/**
	 * The cached value of the '{@link #getCallGraph() <em>Call Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallGraph()
	 * @generated
	 * @ordered
	 */
	protected CallGraph callGraph;

	/**
	 * The cached value of the '{@link #getStimuli() <em>Stimuli</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimuli()
	 * @generated
	 * @ordered
	 */
	protected EList<Stimulus> stimuli;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGraph getCallGraph() {
		return callGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallGraph(CallGraph newCallGraph, NotificationChain msgs) {
		CallGraph oldCallGraph = callGraph;
		callGraph = newCallGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS__CALL_GRAPH, oldCallGraph, newCallGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallGraph(CallGraph newCallGraph) {
		if (newCallGraph != callGraph) {
			NotificationChain msgs = null;
			if (callGraph != null)
				msgs = ((InternalEObject)callGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS__CALL_GRAPH, null, msgs);
			if (newCallGraph != null)
				msgs = ((InternalEObject)newCallGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS__CALL_GRAPH, null, msgs);
			msgs = basicSetCallGraph(newCallGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS__CALL_GRAPH, newCallGraph, newCallGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stimulus> getStimuli() {
		if (stimuli == null) {
			stimuli = new EObjectResolvingEList<Stimulus>(Stimulus.class, this, AmaltheaPackage.PROCESS__STIMULI);
		}
		return stimuli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PROCESS__CALL_GRAPH:
				return basicSetCallGraph(null, msgs);
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
			case AmaltheaPackage.PROCESS__CALL_GRAPH:
				return getCallGraph();
			case AmaltheaPackage.PROCESS__STIMULI:
				return getStimuli();
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
			case AmaltheaPackage.PROCESS__CALL_GRAPH:
				setCallGraph((CallGraph)newValue);
				return;
			case AmaltheaPackage.PROCESS__STIMULI:
				getStimuli().clear();
				getStimuli().addAll((Collection<? extends Stimulus>)newValue);
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
			case AmaltheaPackage.PROCESS__CALL_GRAPH:
				setCallGraph((CallGraph)null);
				return;
			case AmaltheaPackage.PROCESS__STIMULI:
				getStimuli().clear();
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
			case AmaltheaPackage.PROCESS__CALL_GRAPH:
				return callGraph != null;
			case AmaltheaPackage.PROCESS__STIMULI:
				return stimuli != null && !stimuli.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
