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
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Periodic Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RelativePeriodicStimulusImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RelativePeriodicStimulusImpl#getNextOccurrence <em>Next Occurrence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativePeriodicStimulusImpl extends StimulusImpl implements RelativePeriodicStimulus {
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Time offset;

	/**
	 * The cached value of the '{@link #getNextOccurrence() <em>Next Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextOccurrence()
	 * @generated
	 * @ordered
	 */
	protected Deviation<Time> nextOccurrence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativePeriodicStimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRelativePeriodicStimulus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(Time newOffset, NotificationChain msgs) {
		Time oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Time newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation<Time> getNextOccurrence() {
		return nextOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextOccurrence(Deviation<Time> newNextOccurrence, NotificationChain msgs) {
		Deviation<Time> oldNextOccurrence = nextOccurrence;
		nextOccurrence = newNextOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE, oldNextOccurrence, newNextOccurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextOccurrence(Deviation<Time> newNextOccurrence) {
		if (newNextOccurrence != nextOccurrence) {
			NotificationChain msgs = null;
			if (nextOccurrence != null)
				msgs = ((InternalEObject)nextOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE, null, msgs);
			if (newNextOccurrence != null)
				msgs = ((InternalEObject)newNextOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE, null, msgs);
			msgs = basicSetNextOccurrence(newNextOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE, newNextOccurrence, newNextOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET:
				return basicSetOffset(null, msgs);
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE:
				return basicSetNextOccurrence(null, msgs);
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
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET:
				return getOffset();
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE:
				return getNextOccurrence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET:
				setOffset((Time)newValue);
				return;
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE:
				setNextOccurrence((Deviation<Time>)newValue);
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
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET:
				setOffset((Time)null);
				return;
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE:
				setNextOccurrence((Deviation<Time>)null);
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
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__OFFSET:
				return offset != null;
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE:
				return nextOccurrence != null;
		}
		return super.eIsSet(featureID);
	}

} //RelativePeriodicStimulusImpl
