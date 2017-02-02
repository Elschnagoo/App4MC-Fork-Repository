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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.HwMemoryConstraint;
import org.eclipse.app4mc.amalthea.model.MappingConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingConstraintImpl#getHwConstraint <em>Hw Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MappingConstraintImpl extends BaseObjectImpl implements MappingConstraint {
	/**
	 * The cached value of the '{@link #getHwConstraint() <em>Hw Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwConstraint()
	 * @generated
	 * @ordered
	 */
	protected HwMemoryConstraint hwConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getMappingConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryConstraint getHwConstraint() {
		return hwConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwConstraint(HwMemoryConstraint newHwConstraint, NotificationChain msgs) {
		HwMemoryConstraint oldHwConstraint = hwConstraint;
		hwConstraint = newHwConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT, oldHwConstraint, newHwConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwConstraint(HwMemoryConstraint newHwConstraint) {
		if (newHwConstraint != hwConstraint) {
			NotificationChain msgs = null;
			if (hwConstraint != null)
				msgs = ((InternalEObject)hwConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT, null, msgs);
			if (newHwConstraint != null)
				msgs = ((InternalEObject)newHwConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT, null, msgs);
			msgs = basicSetHwConstraint(newHwConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT, newHwConstraint, newHwConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT:
				return basicSetHwConstraint(null, msgs);
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
			case AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT:
				return getHwConstraint();
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
			case AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT:
				setHwConstraint((HwMemoryConstraint)newValue);
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
			case AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT:
				setHwConstraint((HwMemoryConstraint)null);
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
			case AmaltheaPackage.MAPPING_CONSTRAINT__HW_CONSTRAINT:
				return hwConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingConstraintImpl
