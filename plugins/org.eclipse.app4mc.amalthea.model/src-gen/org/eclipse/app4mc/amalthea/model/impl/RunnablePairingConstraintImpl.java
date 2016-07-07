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
import org.eclipse.app4mc.amalthea.model.RunnableConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableConstraintTarget;
import org.eclipse.app4mc.amalthea.model.RunnableGroup;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable Pairing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnablePairingConstraintImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnablePairingConstraintImpl#getRunnables <em>Runnables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnablePairingConstraintImpl extends PairingConstraintImpl implements RunnablePairingConstraint {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected RunnableConstraintTarget target;

	/**
	 * The cached value of the '{@link #getRunnables() <em>Runnables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnables()
	 * @generated
	 * @ordered
	 */
	protected RunnableGroup runnables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnablePairingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnablePairingConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableConstraintTarget getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (RunnableConstraintTarget)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject)target;
				NotificationChain msgs = oldTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableConstraintTarget basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(RunnableConstraintTarget newTarget, NotificationChain msgs) {
		RunnableConstraintTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(RunnableConstraintTarget newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableGroup getRunnables() {
		if (runnables != null && runnables.eIsProxy()) {
			InternalEObject oldRunnables = (InternalEObject)runnables;
			runnables = (RunnableGroup)eResolveProxy(oldRunnables);
			if (runnables != oldRunnables) {
				InternalEObject newRunnables = (InternalEObject)runnables;
				NotificationChain msgs = oldRunnables.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES, null, null);
				if (newRunnables.eInternalContainer() == null) {
					msgs = newRunnables.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES, oldRunnables, runnables));
			}
		}
		return runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableGroup basicGetRunnables() {
		return runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunnables(RunnableGroup newRunnables, NotificationChain msgs) {
		RunnableGroup oldRunnables = runnables;
		runnables = newRunnables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES, oldRunnables, newRunnables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunnables(RunnableGroup newRunnables) {
		if (newRunnables != runnables) {
			NotificationChain msgs = null;
			if (runnables != null)
				msgs = ((InternalEObject)runnables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES, null, msgs);
			if (newRunnables != null)
				msgs = ((InternalEObject)newRunnables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES, null, msgs);
			msgs = basicSetRunnables(newRunnables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES, newRunnables, newRunnables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET:
				return basicSetTarget(null, msgs);
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES:
				return basicSetRunnables(null, msgs);
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
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES:
				if (resolve) return getRunnables();
				return basicGetRunnables();
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
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET:
				setTarget((RunnableConstraintTarget)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES:
				setRunnables((RunnableGroup)newValue);
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
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET:
				setTarget((RunnableConstraintTarget)null);
				return;
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES:
				setRunnables((RunnableGroup)null);
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
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET:
				return target != null;
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES:
				return runnables != null;
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
		if (baseClass == RunnableConstraint.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET: return AmaltheaPackage.RUNNABLE_CONSTRAINT__TARGET;
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
		if (baseClass == RunnableConstraint.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.RUNNABLE_CONSTRAINT__TARGET: return AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT__TARGET;
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

} //RunnablePairingConstraintImpl
