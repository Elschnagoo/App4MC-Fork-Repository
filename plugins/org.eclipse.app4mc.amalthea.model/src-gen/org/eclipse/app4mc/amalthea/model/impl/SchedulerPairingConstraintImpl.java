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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.SchedulerConstraint;
import org.eclipse.app4mc.amalthea.model.SchedulerConstraintTarget;
import org.eclipse.app4mc.amalthea.model.SchedulerEntityGroup;
import org.eclipse.app4mc.amalthea.model.SchedulerPairingConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler Pairing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerPairingConstraintImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerPairingConstraintImpl#getSchedulers <em>Schedulers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerPairingConstraintImpl extends PairingConstraintImpl implements SchedulerPairingConstraint {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SchedulerConstraintTarget target;

	/**
	 * The cached value of the '{@link #getSchedulers() <em>Schedulers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulers()
	 * @generated
	 * @ordered
	 */
	protected SchedulerEntityGroup schedulers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerPairingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSchedulerPairingConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerConstraintTarget getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SchedulerConstraintTarget)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject)target;
				NotificationChain msgs = oldTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerConstraintTarget basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(SchedulerConstraintTarget newTarget, NotificationChain msgs) {
		SchedulerConstraintTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SchedulerConstraintTarget newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerEntityGroup getSchedulers() {
		if (schedulers != null && schedulers.eIsProxy()) {
			InternalEObject oldSchedulers = (InternalEObject)schedulers;
			schedulers = (SchedulerEntityGroup)eResolveProxy(oldSchedulers);
			if (schedulers != oldSchedulers) {
				InternalEObject newSchedulers = (InternalEObject)schedulers;
				NotificationChain msgs = oldSchedulers.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS, null, null);
				if (newSchedulers.eInternalContainer() == null) {
					msgs = newSchedulers.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS, oldSchedulers, schedulers));
			}
		}
		return schedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerEntityGroup basicGetSchedulers() {
		return schedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulers(SchedulerEntityGroup newSchedulers, NotificationChain msgs) {
		SchedulerEntityGroup oldSchedulers = schedulers;
		schedulers = newSchedulers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS, oldSchedulers, newSchedulers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulers(SchedulerEntityGroup newSchedulers) {
		if (newSchedulers != schedulers) {
			NotificationChain msgs = null;
			if (schedulers != null)
				msgs = ((InternalEObject)schedulers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS, null, msgs);
			if (newSchedulers != null)
				msgs = ((InternalEObject)newSchedulers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS, null, msgs);
			msgs = basicSetSchedulers(newSchedulers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS, newSchedulers, newSchedulers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET:
				return basicSetTarget(null, msgs);
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS:
				return basicSetSchedulers(null, msgs);
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
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS:
				if (resolve) return getSchedulers();
				return basicGetSchedulers();
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
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET:
				setTarget((SchedulerConstraintTarget)newValue);
				return;
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS:
				setSchedulers((SchedulerEntityGroup)newValue);
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
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET:
				setTarget((SchedulerConstraintTarget)null);
				return;
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS:
				setSchedulers((SchedulerEntityGroup)null);
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
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET:
				return target != null;
			case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS:
				return schedulers != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SchedulerConstraint.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET: return AmaltheaPackage.SCHEDULER_CONSTRAINT__TARGET;
				default: return -1;
			}
		}
		if (baseClass == BaseObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SchedulerConstraint.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.SCHEDULER_CONSTRAINT__TARGET: return AmaltheaPackage.SCHEDULER_PAIRING_CONSTRAINT__TARGET;
				default: return -1;
			}
		}
		if (baseClass == BaseObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SchedulerPairingConstraintImpl
