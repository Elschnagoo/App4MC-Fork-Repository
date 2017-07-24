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
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.InterProcessStimulus;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Process Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InterProcessStimulusImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InterProcessStimulusImpl#getExplicitTriggers <em>Explicit Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterProcessStimulusImpl extends StimulusImpl implements InterProcessStimulus {
	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Counter counter;

	/**
	 * The cached value of the '{@link #getExplicitTriggers() <em>Explicit Triggers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<InterProcessTrigger> explicitTriggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterProcessStimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getInterProcessStimulus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounter(Counter newCounter, NotificationChain msgs) {
		Counter oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER, oldCounter, newCounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(Counter newCounter) {
		if (newCounter != counter) {
			NotificationChain msgs = null;
			if (counter != null)
				msgs = ((InternalEObject)counter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER, null, msgs);
			if (newCounter != null)
				msgs = ((InternalEObject)newCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER, null, msgs);
			msgs = basicSetCounter(newCounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER, newCounter, newCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterProcessTrigger> getExplicitTriggers() {
		if (explicitTriggers == null) {
			explicitTriggers = new EObjectWithInverseResolvingEList<InterProcessTrigger>(InterProcessTrigger.class, this, AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS, AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT);
		}
		return explicitTriggers;
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
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExplicitTriggers()).basicAdd(otherEnd, msgs);
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
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER:
				return basicSetCounter(null, msgs);
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS:
				return ((InternalEList<?>)getExplicitTriggers()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER:
				return getCounter();
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS:
				return getExplicitTriggers();
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
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER:
				setCounter((Counter)newValue);
				return;
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS:
				getExplicitTriggers().clear();
				getExplicitTriggers().addAll((Collection<? extends InterProcessTrigger>)newValue);
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
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER:
				setCounter((Counter)null);
				return;
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS:
				getExplicitTriggers().clear();
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
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__COUNTER:
				return counter != null;
			case AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS:
				return explicitTriggers != null && !explicitTriggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterProcessStimulusImpl