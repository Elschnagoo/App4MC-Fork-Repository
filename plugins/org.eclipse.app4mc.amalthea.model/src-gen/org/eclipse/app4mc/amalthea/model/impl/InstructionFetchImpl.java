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
import org.eclipse.app4mc.amalthea.model.InstructionFetch;
import org.eclipse.app4mc.amalthea.model.NumericStatistic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Fetch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InstructionFetchImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InstructionFetchImpl#getMisses <em>Misses</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InstructionFetchImpl#getCyclesPerFetch <em>Cycles Per Fetch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionFetchImpl extends BaseObjectImpl implements InstructionFetch {
	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected NumericStatistic count;

	/**
	 * The cached value of the '{@link #getMisses() <em>Misses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMisses()
	 * @generated
	 * @ordered
	 */
	protected NumericStatistic misses;

	/**
	 * The cached value of the '{@link #getCyclesPerFetch() <em>Cycles Per Fetch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclesPerFetch()
	 * @generated
	 * @ordered
	 */
	protected NumericStatistic cyclesPerFetch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionFetchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getInstructionFetch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStatistic getCount() {
		if (count != null && count.eIsProxy()) {
			InternalEObject oldCount = (InternalEObject)count;
			count = (NumericStatistic)eResolveProxy(oldCount);
			if (count != oldCount) {
				InternalEObject newCount = (InternalEObject)count;
				NotificationChain msgs = oldCount.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__COUNT, null, null);
				if (newCount.eInternalContainer() == null) {
					msgs = newCount.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__COUNT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.INSTRUCTION_FETCH__COUNT, oldCount, count));
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStatistic basicGetCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(NumericStatistic newCount, NotificationChain msgs) {
		NumericStatistic oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INSTRUCTION_FETCH__COUNT, oldCount, newCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(NumericStatistic newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INSTRUCTION_FETCH__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStatistic getMisses() {
		if (misses != null && misses.eIsProxy()) {
			InternalEObject oldMisses = (InternalEObject)misses;
			misses = (NumericStatistic)eResolveProxy(oldMisses);
			if (misses != oldMisses) {
				InternalEObject newMisses = (InternalEObject)misses;
				NotificationChain msgs = oldMisses.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__MISSES, null, null);
				if (newMisses.eInternalContainer() == null) {
					msgs = newMisses.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__MISSES, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.INSTRUCTION_FETCH__MISSES, oldMisses, misses));
			}
		}
		return misses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStatistic basicGetMisses() {
		return misses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMisses(NumericStatistic newMisses, NotificationChain msgs) {
		NumericStatistic oldMisses = misses;
		misses = newMisses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INSTRUCTION_FETCH__MISSES, oldMisses, newMisses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMisses(NumericStatistic newMisses) {
		if (newMisses != misses) {
			NotificationChain msgs = null;
			if (misses != null)
				msgs = ((InternalEObject)misses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__MISSES, null, msgs);
			if (newMisses != null)
				msgs = ((InternalEObject)newMisses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__MISSES, null, msgs);
			msgs = basicSetMisses(newMisses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INSTRUCTION_FETCH__MISSES, newMisses, newMisses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStatistic getCyclesPerFetch() {
		if (cyclesPerFetch != null && cyclesPerFetch.eIsProxy()) {
			InternalEObject oldCyclesPerFetch = (InternalEObject)cyclesPerFetch;
			cyclesPerFetch = (NumericStatistic)eResolveProxy(oldCyclesPerFetch);
			if (cyclesPerFetch != oldCyclesPerFetch) {
				InternalEObject newCyclesPerFetch = (InternalEObject)cyclesPerFetch;
				NotificationChain msgs = oldCyclesPerFetch.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH, null, null);
				if (newCyclesPerFetch.eInternalContainer() == null) {
					msgs = newCyclesPerFetch.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH, oldCyclesPerFetch, cyclesPerFetch));
			}
		}
		return cyclesPerFetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericStatistic basicGetCyclesPerFetch() {
		return cyclesPerFetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCyclesPerFetch(NumericStatistic newCyclesPerFetch, NotificationChain msgs) {
		NumericStatistic oldCyclesPerFetch = cyclesPerFetch;
		cyclesPerFetch = newCyclesPerFetch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH, oldCyclesPerFetch, newCyclesPerFetch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCyclesPerFetch(NumericStatistic newCyclesPerFetch) {
		if (newCyclesPerFetch != cyclesPerFetch) {
			NotificationChain msgs = null;
			if (cyclesPerFetch != null)
				msgs = ((InternalEObject)cyclesPerFetch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH, null, msgs);
			if (newCyclesPerFetch != null)
				msgs = ((InternalEObject)newCyclesPerFetch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH, null, msgs);
			msgs = basicSetCyclesPerFetch(newCyclesPerFetch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH, newCyclesPerFetch, newCyclesPerFetch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.INSTRUCTION_FETCH__COUNT:
				return basicSetCount(null, msgs);
			case AmaltheaPackage.INSTRUCTION_FETCH__MISSES:
				return basicSetMisses(null, msgs);
			case AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH:
				return basicSetCyclesPerFetch(null, msgs);
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
			case AmaltheaPackage.INSTRUCTION_FETCH__COUNT:
				if (resolve) return getCount();
				return basicGetCount();
			case AmaltheaPackage.INSTRUCTION_FETCH__MISSES:
				if (resolve) return getMisses();
				return basicGetMisses();
			case AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH:
				if (resolve) return getCyclesPerFetch();
				return basicGetCyclesPerFetch();
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
			case AmaltheaPackage.INSTRUCTION_FETCH__COUNT:
				setCount((NumericStatistic)newValue);
				return;
			case AmaltheaPackage.INSTRUCTION_FETCH__MISSES:
				setMisses((NumericStatistic)newValue);
				return;
			case AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH:
				setCyclesPerFetch((NumericStatistic)newValue);
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
			case AmaltheaPackage.INSTRUCTION_FETCH__COUNT:
				setCount((NumericStatistic)null);
				return;
			case AmaltheaPackage.INSTRUCTION_FETCH__MISSES:
				setMisses((NumericStatistic)null);
				return;
			case AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH:
				setCyclesPerFetch((NumericStatistic)null);
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
			case AmaltheaPackage.INSTRUCTION_FETCH__COUNT:
				return count != null;
			case AmaltheaPackage.INSTRUCTION_FETCH__MISSES:
				return misses != null;
			case AmaltheaPackage.INSTRUCTION_FETCH__CYCLES_PER_FETCH:
				return cyclesPerFetch != null;
		}
		return super.eIsSet(featureID);
	}

} //InstructionFetchImpl
