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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.Scheduler;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enforced Migration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EnforcedMigrationImpl#getResourceOwner <em>Resource Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnforcedMigrationImpl extends CallGraphItemImpl implements EnforcedMigration {
	/**
	 * The cached value of the '{@link #getResourceOwner() <em>Resource Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceOwner()
	 * @generated
	 * @ordered
	 */
	protected Scheduler resourceOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnforcedMigrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getEnforcedMigration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scheduler getResourceOwner() {
		if (resourceOwner != null && resourceOwner.eIsProxy()) {
			InternalEObject oldResourceOwner = (InternalEObject)resourceOwner;
			resourceOwner = (Scheduler)eResolveProxy(oldResourceOwner);
			if (resourceOwner != oldResourceOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ENFORCED_MIGRATION__RESOURCE_OWNER, oldResourceOwner, resourceOwner));
			}
		}
		return resourceOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetResourceOwner() {
		return resourceOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceOwner(Scheduler newResourceOwner) {
		Scheduler oldResourceOwner = resourceOwner;
		resourceOwner = newResourceOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ENFORCED_MIGRATION__RESOURCE_OWNER, oldResourceOwner, resourceOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.ENFORCED_MIGRATION__RESOURCE_OWNER:
				if (resolve) return getResourceOwner();
				return basicGetResourceOwner();
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
			case AmaltheaPackage.ENFORCED_MIGRATION__RESOURCE_OWNER:
				setResourceOwner((Scheduler)newValue);
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
			case AmaltheaPackage.ENFORCED_MIGRATION__RESOURCE_OWNER:
				setResourceOwner((Scheduler)null);
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
			case AmaltheaPackage.ENFORCED_MIGRATION__RESOURCE_OWNER:
				return resourceOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //EnforcedMigrationImpl
