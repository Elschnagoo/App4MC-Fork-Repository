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
import org.eclipse.app4mc.amalthea.model.ECU;
import org.eclipse.app4mc.amalthea.model.ECUType;
import org.eclipse.app4mc.amalthea.model.Microcontroller;

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
 * An implementation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ECUImpl#getEcuType <em>Ecu Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ECUImpl#getMicrocontrollers <em>Microcontrollers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECUImpl extends ComplexNodeImpl implements ECU {
	/**
	 * The cached value of the '{@link #getEcuType() <em>Ecu Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuType()
	 * @generated
	 * @ordered
	 */
	protected ECUType ecuType;

	/**
	 * The cached value of the '{@link #getMicrocontrollers() <em>Microcontrollers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollers()
	 * @generated
	 * @ordered
	 */
	protected EList<Microcontroller> microcontrollers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getECU();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECUType getEcuType() {
		if (ecuType != null && ecuType.eIsProxy()) {
			InternalEObject oldEcuType = (InternalEObject)ecuType;
			ecuType = (ECUType)eResolveProxy(oldEcuType);
			if (ecuType != oldEcuType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ECU__ECU_TYPE, oldEcuType, ecuType));
			}
		}
		return ecuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECUType basicGetEcuType() {
		return ecuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcuType(ECUType newEcuType) {
		ECUType oldEcuType = ecuType;
		ecuType = newEcuType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ECU__ECU_TYPE, oldEcuType, ecuType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microcontroller> getMicrocontrollers() {
		if (microcontrollers == null) {
			microcontrollers = new EObjectContainmentEList<Microcontroller>(Microcontroller.class, this, AmaltheaPackage.ECU__MICROCONTROLLERS);
		}
		return microcontrollers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.ECU__MICROCONTROLLERS:
				return ((InternalEList<?>)getMicrocontrollers()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.ECU__ECU_TYPE:
				if (resolve) return getEcuType();
				return basicGetEcuType();
			case AmaltheaPackage.ECU__MICROCONTROLLERS:
				return getMicrocontrollers();
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
			case AmaltheaPackage.ECU__ECU_TYPE:
				setEcuType((ECUType)newValue);
				return;
			case AmaltheaPackage.ECU__MICROCONTROLLERS:
				getMicrocontrollers().clear();
				getMicrocontrollers().addAll((Collection<? extends Microcontroller>)newValue);
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
			case AmaltheaPackage.ECU__ECU_TYPE:
				setEcuType((ECUType)null);
				return;
			case AmaltheaPackage.ECU__MICROCONTROLLERS:
				getMicrocontrollers().clear();
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
			case AmaltheaPackage.ECU__ECU_TYPE:
				return ecuType != null;
			case AmaltheaPackage.ECU__MICROCONTROLLERS:
				return microcontrollers != null && !microcontrollers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ECUImpl
