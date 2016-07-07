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
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Entity Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityElementTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityElementTypeImpl#getTimingValues <em>Timing Values</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityElementTypeImpl#getTimingConstraints <em>Timing Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityElementTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchedulingEntityElementTypeImpl extends IdentifiableElementImpl implements SchedulingEntityElementType {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulingEntityElementType> element;

	/**
	 * The cached value of the '{@link #getTimingValues() <em>Timing Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingValues()
	 * @generated
	 * @ordered
	 */
	protected TimingValuesType timingValues;

	/**
	 * The cached value of the '{@link #getTimingConstraints() <em>Timing Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingConstraints()
	 * @generated
	 * @ordered
	 */
	protected TimingConstraintsType timingConstraints;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingEntityElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.SCHEDULING_ENTITY_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulingEntityElementType> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<SchedulingEntityElementType>(SchedulingEntityElementType.class, this, OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingValuesType getTimingValues() {
		return timingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingValues(TimingValuesType newTimingValues, NotificationChain msgs) {
		TimingValuesType oldTimingValues = timingValues;
		timingValues = newTimingValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES, oldTimingValues, newTimingValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingValues(TimingValuesType newTimingValues) {
		if (newTimingValues != timingValues) {
			NotificationChain msgs = null;
			if (timingValues != null)
				msgs = ((InternalEObject)timingValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES, null, msgs);
			if (newTimingValues != null)
				msgs = ((InternalEObject)newTimingValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES, null, msgs);
			msgs = basicSetTimingValues(newTimingValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES, newTimingValues, newTimingValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingConstraintsType getTimingConstraints() {
		return timingConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingConstraints(TimingConstraintsType newTimingConstraints, NotificationChain msgs) {
		TimingConstraintsType oldTimingConstraints = timingConstraints;
		timingConstraints = newTimingConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS, oldTimingConstraints, newTimingConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingConstraints(TimingConstraintsType newTimingConstraints) {
		if (newTimingConstraints != timingConstraints) {
			NotificationChain msgs = null;
			if (timingConstraints != null)
				msgs = ((InternalEObject)timingConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS, null, msgs);
			if (newTimingConstraints != null)
				msgs = ((InternalEObject)newTimingConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS, null, msgs);
			msgs = basicSetTimingConstraints(newTimingConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS, newTimingConstraints, newTimingConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES:
				return basicSetTimingValues(null, msgs);
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS:
				return basicSetTimingConstraints(null, msgs);
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
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT:
				return getElement();
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES:
				return getTimingValues();
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS:
				return getTimingConstraints();
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__NAME:
				return getName();
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
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends SchedulingEntityElementType>)newValue);
				return;
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES:
				setTimingValues((TimingValuesType)newValue);
				return;
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS:
				setTimingConstraints((TimingConstraintsType)newValue);
				return;
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__NAME:
				setName((String)newValue);
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
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT:
				getElement().clear();
				return;
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES:
				setTimingValues((TimingValuesType)null);
				return;
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS:
				setTimingConstraints((TimingConstraintsType)null);
				return;
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT:
				return element != null && !element.isEmpty();
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES:
				return timingValues != null;
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS:
				return timingConstraints != null;
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchedulingEntityElementTypeImpl
