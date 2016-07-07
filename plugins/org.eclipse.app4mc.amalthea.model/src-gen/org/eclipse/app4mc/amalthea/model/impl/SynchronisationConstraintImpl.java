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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.EntityEvent;
import org.eclipse.app4mc.amalthea.model.SynchronisationConstraint;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronisation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SynchronisationConstraintImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SynchronisationConstraintImpl#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronisationConstraintImpl extends TimingConstraintImpl implements SynchronisationConstraint {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityEvent> events;

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
	protected SynchronisationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSynchronisationConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityEvent> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<EntityEvent>(EntityEvent.class, this, AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getTolerance() {
		if (tolerance != null && tolerance.eIsProxy()) {
			InternalEObject oldTolerance = (InternalEObject)tolerance;
			tolerance = (Time)eResolveProxy(oldTolerance);
			if (tolerance != oldTolerance) {
				InternalEObject newTolerance = (InternalEObject)tolerance;
				NotificationChain msgs = oldTolerance.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE, null, null);
				if (newTolerance.eInternalContainer() == null) {
					msgs = newTolerance.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE, oldTolerance, tolerance));
			}
		}
		return tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetTolerance() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE, oldTolerance, newTolerance);
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
				msgs = ((InternalEObject)tolerance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE, null, msgs);
			if (newTolerance != null)
				msgs = ((InternalEObject)newTolerance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE, null, msgs);
			msgs = basicSetTolerance(newTolerance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE, newTolerance, newTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE:
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
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__EVENTS:
				return getEvents();
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE:
				if (resolve) return getTolerance();
				return basicGetTolerance();
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
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends EntityEvent>)newValue);
				return;
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE:
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
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__EVENTS:
				getEvents().clear();
				return;
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE:
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
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__EVENTS:
				return events != null && !events.isEmpty();
			case AmaltheaPackage.SYNCHRONISATION_CONSTRAINT__TOLERANCE:
				return tolerance != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronisationConstraintImpl
