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
import org.eclipse.app4mc.amalthea.model.SynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SynchronizationConstraintImpl#isMultipleOccurrencesAllowed <em>Multiple Occurrences Allowed</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SynchronizationConstraintImpl#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SynchronizationConstraintImpl extends TimingConstraintImpl implements SynchronizationConstraint {
	/**
	 * The default value of the '{@link #isMultipleOccurrencesAllowed() <em>Multiple Occurrences Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleOccurrencesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_OCCURRENCES_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleOccurrencesAllowed() <em>Multiple Occurrences Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleOccurrencesAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleOccurrencesAllowed = MULTIPLE_OCCURRENCES_ALLOWED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTolerance() <em>Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected Time tolerance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSynchronizationConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleOccurrencesAllowed() {
		return multipleOccurrencesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleOccurrencesAllowed(boolean newMultipleOccurrencesAllowed) {
		boolean oldMultipleOccurrencesAllowed = multipleOccurrencesAllowed;
		multipleOccurrencesAllowed = newMultipleOccurrencesAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__MULTIPLE_OCCURRENCES_ALLOWED, oldMultipleOccurrencesAllowed, multipleOccurrencesAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getTolerance() {
		return tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTolerance(Time newTolerance, NotificationChain msgs) {
		Time oldTolerance = tolerance;
		tolerance = newTolerance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE, oldTolerance, newTolerance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTolerance(Time newTolerance) {
		if (newTolerance != tolerance) {
			NotificationChain msgs = null;
			if (tolerance != null)
				msgs = ((InternalEObject)tolerance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE, null, msgs);
			if (newTolerance != null)
				msgs = ((InternalEObject)newTolerance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE, null, msgs);
			msgs = basicSetTolerance(newTolerance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE, newTolerance, newTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				return basicSetTolerance(null, msgs);
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
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__MULTIPLE_OCCURRENCES_ALLOWED:
				return isMultipleOccurrencesAllowed();
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				return getTolerance();
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
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__MULTIPLE_OCCURRENCES_ALLOWED:
				setMultipleOccurrencesAllowed((Boolean)newValue);
				return;
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				setTolerance((Time)newValue);
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
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__MULTIPLE_OCCURRENCES_ALLOWED:
				setMultipleOccurrencesAllowed(MULTIPLE_OCCURRENCES_ALLOWED_EDEFAULT);
				return;
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				setTolerance((Time)null);
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
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__MULTIPLE_OCCURRENCES_ALLOWED:
				return multipleOccurrencesAllowed != MULTIPLE_OCCURRENCES_ALLOWED_EDEFAULT;
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				return tolerance != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (multipleOccurrencesAllowed: ");
		result.append(multipleOccurrencesAllowed);
		result.append(')');
		return result.toString();
	}

} //SynchronizationConstraintImpl
