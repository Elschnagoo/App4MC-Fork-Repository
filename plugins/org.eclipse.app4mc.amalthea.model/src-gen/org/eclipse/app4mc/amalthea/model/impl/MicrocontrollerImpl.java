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
import org.eclipse.app4mc.amalthea.model.Microcontroller;
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType;

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
 * An implementation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MicrocontrollerImpl#getMicrocontrollerType <em>Microcontroller Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MicrocontrollerImpl#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicrocontrollerImpl extends ComplexNodeImpl implements Microcontroller {
	/**
	 * The cached value of the '{@link #getMicrocontrollerType() <em>Microcontroller Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollerType()
	 * @generated
	 * @ordered
	 */
	protected MicrocontrollerType microcontrollerType;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> cores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicrocontrollerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getMicrocontroller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerType getMicrocontrollerType() {
		if (microcontrollerType != null && microcontrollerType.eIsProxy()) {
			InternalEObject oldMicrocontrollerType = (InternalEObject)microcontrollerType;
			microcontrollerType = (MicrocontrollerType)eResolveProxy(oldMicrocontrollerType);
			if (microcontrollerType != oldMicrocontrollerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE, oldMicrocontrollerType, microcontrollerType));
			}
		}
		return microcontrollerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerType basicGetMicrocontrollerType() {
		return microcontrollerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicrocontrollerType(MicrocontrollerType newMicrocontrollerType) {
		MicrocontrollerType oldMicrocontrollerType = microcontrollerType;
		microcontrollerType = newMicrocontrollerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE, oldMicrocontrollerType, microcontrollerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCores() {
		if (cores == null) {
			cores = new EObjectContainmentEList<Core>(Core.class, this, AmaltheaPackage.MICROCONTROLLER__CORES);
		}
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MICROCONTROLLER__CORES:
				return ((InternalEList<?>)getCores()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE:
				if (resolve) return getMicrocontrollerType();
				return basicGetMicrocontrollerType();
			case AmaltheaPackage.MICROCONTROLLER__CORES:
				return getCores();
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
			case AmaltheaPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE:
				setMicrocontrollerType((MicrocontrollerType)newValue);
				return;
			case AmaltheaPackage.MICROCONTROLLER__CORES:
				getCores().clear();
				getCores().addAll((Collection<? extends Core>)newValue);
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
			case AmaltheaPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE:
				setMicrocontrollerType((MicrocontrollerType)null);
				return;
			case AmaltheaPackage.MICROCONTROLLER__CORES:
				getCores().clear();
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
			case AmaltheaPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE:
				return microcontrollerType != null;
			case AmaltheaPackage.MICROCONTROLLER__CORES:
				return cores != null && !cores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MicrocontrollerImpl
