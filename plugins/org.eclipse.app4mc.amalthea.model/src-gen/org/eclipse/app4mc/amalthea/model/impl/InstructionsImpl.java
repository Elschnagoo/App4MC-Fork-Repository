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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.InstructionFetch;
import org.eclipse.app4mc.amalthea.model.Instructions;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InstructionsImpl#getFetchStatistic <em>Fetch Statistic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstructionsImpl extends AmaltheaExtendedEObjectImpl implements Instructions {
	/**
	 * The cached value of the '{@link #getFetchStatistic() <em>Fetch Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchStatistic()
	 * @generated
	 * @ordered
	 */
	protected InstructionFetch fetchStatistic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getInstructions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionFetch getFetchStatistic() {
		return fetchStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFetchStatistic(InstructionFetch newFetchStatistic, NotificationChain msgs) {
		InstructionFetch oldFetchStatistic = fetchStatistic;
		fetchStatistic = newFetchStatistic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC, oldFetchStatistic, newFetchStatistic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetchStatistic(InstructionFetch newFetchStatistic) {
		if (newFetchStatistic != fetchStatistic) {
			NotificationChain msgs = null;
			if (fetchStatistic != null)
				msgs = ((InternalEObject)fetchStatistic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC, null, msgs);
			if (newFetchStatistic != null)
				msgs = ((InternalEObject)newFetchStatistic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC, null, msgs);
			msgs = basicSetFetchStatistic(newFetchStatistic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC, newFetchStatistic, newFetchStatistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containerNotificationRequired() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC:
				return basicSetFetchStatistic(null, msgs);
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
			case AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC:
				return getFetchStatistic();
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
			case AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC:
				setFetchStatistic((InstructionFetch)newValue);
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
			case AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC:
				setFetchStatistic((InstructionFetch)null);
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
			case AmaltheaPackage.INSTRUCTIONS__FETCH_STATISTIC:
				return fetchStatistic != null;
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
			case AmaltheaPackage.INSTRUCTIONS___CONTAINER_NOTIFICATION_REQUIRED:
				return containerNotificationRequired();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InstructionsImpl
