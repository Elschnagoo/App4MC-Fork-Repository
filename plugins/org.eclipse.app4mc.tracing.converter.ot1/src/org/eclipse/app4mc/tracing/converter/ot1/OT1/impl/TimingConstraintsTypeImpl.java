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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintsTypeImpl#getTimingConstraint <em>Timing Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingConstraintsTypeImpl extends EObjectImpl implements TimingConstraintsType {
	/**
	 * The cached value of the '{@link #getTimingConstraint() <em>Timing Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingConstraintElementType> timingConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TIMING_CONSTRAINTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingConstraintElementType> getTimingConstraint() {
		if (timingConstraint == null) {
			timingConstraint = new EObjectContainmentEList<TimingConstraintElementType>(TimingConstraintElementType.class, this, OT1Package.TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT);
		}
		return timingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				return ((InternalEList<?>)getTimingConstraint()).basicRemove(otherEnd, msgs);
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
			case OT1Package.TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				return getTimingConstraint();
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
			case OT1Package.TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				getTimingConstraint().clear();
				getTimingConstraint().addAll((Collection<? extends TimingConstraintElementType>)newValue);
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
			case OT1Package.TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				getTimingConstraint().clear();
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
			case OT1Package.TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
				return timingConstraint != null && !timingConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimingConstraintsTypeImpl
