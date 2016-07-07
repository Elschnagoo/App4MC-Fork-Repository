/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import java.util.Collection;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arbitrary Event Triggering Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringTypeImpl#getMinDistance <em>Min Distance</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringTypeImpl#getMaxDistance <em>Max Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArbitraryEventTriggeringTypeImpl extends EventTriggeringTypeImpl implements ArbitraryEventTriggeringType {
	/**
	 * The cached value of the '{@link #getMinDistance() <em>Min Distance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDistance()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeValueType> minDistance;

	/**
	 * The cached value of the '{@link #getMaxDistance() <em>Max Distance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDistance()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeValueType> maxDistance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArbitraryEventTriggeringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.ARBITRARY_EVENT_TRIGGERING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeValueType> getMinDistance() {
		if (minDistance == null) {
			minDistance = new EObjectContainmentEList<TimeValueType>(TimeValueType.class, this, OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE);
		}
		return minDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeValueType> getMaxDistance() {
		if (maxDistance == null) {
			maxDistance = new EObjectContainmentEList<TimeValueType>(TimeValueType.class, this, OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE);
		}
		return maxDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE:
				return ((InternalEList<?>)getMinDistance()).basicRemove(otherEnd, msgs);
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE:
				return ((InternalEList<?>)getMaxDistance()).basicRemove(otherEnd, msgs);
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
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE:
				return getMinDistance();
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE:
				return getMaxDistance();
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
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE:
				getMinDistance().clear();
				getMinDistance().addAll((Collection<? extends TimeValueType>)newValue);
				return;
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE:
				getMaxDistance().clear();
				getMaxDistance().addAll((Collection<? extends TimeValueType>)newValue);
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
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE:
				getMinDistance().clear();
				return;
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE:
				getMaxDistance().clear();
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
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE:
				return minDistance != null && !minDistance.isEmpty();
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE:
				return maxDistance != null && !maxDistance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArbitraryEventTriggeringTypeImpl
