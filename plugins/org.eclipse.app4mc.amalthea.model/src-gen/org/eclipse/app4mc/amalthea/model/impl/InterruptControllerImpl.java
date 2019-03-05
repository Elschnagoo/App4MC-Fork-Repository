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

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InterruptControllerImpl#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InterruptControllerImpl#getIsrAllocations <em>Isr Allocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterruptControllerImpl extends SchedulerImpl implements InterruptController {
	/**
	 * The cached value of the '{@link #getSchedulingAlgorithm() <em>Scheduling Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected InterruptSchedulingAlgorithm schedulingAlgorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getInterruptController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterruptSchedulingAlgorithm getSchedulingAlgorithm() {
		return schedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulingAlgorithm(InterruptSchedulingAlgorithm newSchedulingAlgorithm, NotificationChain msgs) {
		InterruptSchedulingAlgorithm oldSchedulingAlgorithm = schedulingAlgorithm;
		schedulingAlgorithm = newSchedulingAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM, oldSchedulingAlgorithm, newSchedulingAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedulingAlgorithm(InterruptSchedulingAlgorithm newSchedulingAlgorithm) {
		if (newSchedulingAlgorithm != schedulingAlgorithm) {
			NotificationChain msgs = null;
			if (schedulingAlgorithm != null)
				msgs = ((InternalEObject)schedulingAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM, null, msgs);
			if (newSchedulingAlgorithm != null)
				msgs = ((InternalEObject)newSchedulingAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM, null, msgs);
			msgs = basicSetSchedulingAlgorithm(newSchedulingAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM, newSchedulingAlgorithm, newSchedulingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISRAllocation> getIsrAllocations() {
		EReference _iSRAllocation_Controller = AmaltheaPackage.eINSTANCE.getISRAllocation_Controller();
		return AmaltheaIndex.<ISRAllocation>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getInterruptController_IsrAllocations(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_iSRAllocation_Controller)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM:
				return basicSetSchedulingAlgorithm(null, msgs);
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
			case AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM:
				return getSchedulingAlgorithm();
			case AmaltheaPackage.INTERRUPT_CONTROLLER__ISR_ALLOCATIONS:
				return getIsrAllocations();
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
			case AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM:
				setSchedulingAlgorithm((InterruptSchedulingAlgorithm)newValue);
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
			case AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM:
				setSchedulingAlgorithm((InterruptSchedulingAlgorithm)null);
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
			case AmaltheaPackage.INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM:
				return schedulingAlgorithm != null;
			case AmaltheaPackage.INTERRUPT_CONTROLLER__ISR_ALLOCATIONS:
				return !getIsrAllocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterruptControllerImpl
