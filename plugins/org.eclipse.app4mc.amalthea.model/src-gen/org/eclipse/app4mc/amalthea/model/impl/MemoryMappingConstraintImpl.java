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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.MemoryClassification;
import org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Mapping Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryMappingConstraintImpl#getMemoryClassification <em>Memory Classification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemoryMappingConstraintImpl extends BaseObjectImpl implements MemoryMappingConstraint {
	/**
	 * The cached value of the '{@link #getMemoryClassification() <em>Memory Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryClassification()
	 * @generated
	 * @ordered
	 */
	protected MemoryClassification memoryClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryMappingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getMemoryMappingConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryClassification getMemoryClassification() {
		return memoryClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryClassification(MemoryClassification newMemoryClassification, NotificationChain msgs) {
		MemoryClassification oldMemoryClassification = memoryClassification;
		memoryClassification = newMemoryClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION, oldMemoryClassification, newMemoryClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryClassification(MemoryClassification newMemoryClassification) {
		if (newMemoryClassification != memoryClassification) {
			NotificationChain msgs = null;
			if (memoryClassification != null)
				msgs = ((InternalEObject)memoryClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION, null, msgs);
			if (newMemoryClassification != null)
				msgs = ((InternalEObject)newMemoryClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION, null, msgs);
			msgs = basicSetMemoryClassification(newMemoryClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION, newMemoryClassification, newMemoryClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION:
				return basicSetMemoryClassification(null, msgs);
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
			case AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION:
				return getMemoryClassification();
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
			case AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION:
				setMemoryClassification((MemoryClassification)newValue);
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
			case AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION:
				setMemoryClassification((MemoryClassification)null);
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
			case AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION:
				return memoryClassification != null;
		}
		return super.eIsSet(featureID);
	}

} //MemoryMappingConstraintImpl
