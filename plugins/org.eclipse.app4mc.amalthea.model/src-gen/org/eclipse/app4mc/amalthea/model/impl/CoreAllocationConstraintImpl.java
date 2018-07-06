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
import org.eclipse.app4mc.amalthea.model.CoreAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.CoreClassification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreAllocationConstraintImpl#getCoreClassification <em>Core Classification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CoreAllocationConstraintImpl extends BaseObjectImpl implements CoreAllocationConstraint {
	/**
	 * The cached value of the '{@link #getCoreClassification() <em>Core Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreClassification()
	 * @generated
	 * @ordered
	 */
	protected CoreClassification coreClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreAllocationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCoreAllocationConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreClassification getCoreClassification() {
		return coreClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreClassification(CoreClassification newCoreClassification, NotificationChain msgs) {
		CoreClassification oldCoreClassification = coreClassification;
		coreClassification = newCoreClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION, oldCoreClassification, newCoreClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreClassification(CoreClassification newCoreClassification) {
		if (newCoreClassification != coreClassification) {
			NotificationChain msgs = null;
			if (coreClassification != null)
				msgs = ((InternalEObject)coreClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION, null, msgs);
			if (newCoreClassification != null)
				msgs = ((InternalEObject)newCoreClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION, null, msgs);
			msgs = basicSetCoreClassification(newCoreClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION, newCoreClassification, newCoreClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION:
				return basicSetCoreClassification(null, msgs);
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
			case AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION:
				return getCoreClassification();
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
			case AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION:
				setCoreClassification((CoreClassification)newValue);
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
			case AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION:
				setCoreClassification((CoreClassification)null);
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
			case AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION:
				return coreClassification != null;
		}
		return super.eIsSet(featureID);
	}

} //CoreAllocationConstraintImpl
