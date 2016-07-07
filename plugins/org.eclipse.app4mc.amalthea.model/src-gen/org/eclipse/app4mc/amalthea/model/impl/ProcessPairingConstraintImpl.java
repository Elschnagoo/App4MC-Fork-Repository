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
import org.eclipse.app4mc.amalthea.model.ProcessConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessConstraintTarget;
import org.eclipse.app4mc.amalthea.model.ProcessGroup;
import org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Pairing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPairingConstraintImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPairingConstraintImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessPairingConstraintImpl extends PairingConstraintImpl implements ProcessPairingConstraint {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ProcessConstraintTarget target;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected ProcessGroup processes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessPairingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProcessPairingConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessConstraintTarget getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ProcessConstraintTarget)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject)target;
				NotificationChain msgs = oldTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessConstraintTarget basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ProcessConstraintTarget newTarget, NotificationChain msgs) {
		ProcessConstraintTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ProcessConstraintTarget newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessGroup getProcesses() {
		if (processes != null && processes.eIsProxy()) {
			InternalEObject oldProcesses = (InternalEObject)processes;
			processes = (ProcessGroup)eResolveProxy(oldProcesses);
			if (processes != oldProcesses) {
				InternalEObject newProcesses = (InternalEObject)processes;
				NotificationChain msgs = oldProcesses.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES, null, null);
				if (newProcesses.eInternalContainer() == null) {
					msgs = newProcesses.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES, oldProcesses, processes));
			}
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessGroup basicGetProcesses() {
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcesses(ProcessGroup newProcesses, NotificationChain msgs) {
		ProcessGroup oldProcesses = processes;
		processes = newProcesses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES, oldProcesses, newProcesses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcesses(ProcessGroup newProcesses) {
		if (newProcesses != processes) {
			NotificationChain msgs = null;
			if (processes != null)
				msgs = ((InternalEObject)processes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES, null, msgs);
			if (newProcesses != null)
				msgs = ((InternalEObject)newProcesses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES, null, msgs);
			msgs = basicSetProcesses(newProcesses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES, newProcesses, newProcesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET:
				return basicSetTarget(null, msgs);
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES:
				return basicSetProcesses(null, msgs);
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
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES:
				if (resolve) return getProcesses();
				return basicGetProcesses();
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
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET:
				setTarget((ProcessConstraintTarget)newValue);
				return;
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES:
				setProcesses((ProcessGroup)newValue);
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
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET:
				setTarget((ProcessConstraintTarget)null);
				return;
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES:
				setProcesses((ProcessGroup)null);
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
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET:
				return target != null;
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__PROCESSES:
				return processes != null;
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
		if (baseClass == ProcessConstraint.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET: return AmaltheaPackage.PROCESS_CONSTRAINT__TARGET;
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
		if (baseClass == ProcessConstraint.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.PROCESS_CONSTRAINT__TARGET: return AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT__TARGET;
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

} //ProcessPairingConstraintImpl
