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
import org.eclipse.app4mc.amalthea.model.DelayConstraint;
import org.eclipse.app4mc.amalthea.model.EntityEvent;
import org.eclipse.app4mc.amalthea.model.MappingType;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DelayConstraintImpl#getMappingType <em>Mapping Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DelayConstraintImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DelayConstraintImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DelayConstraintImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DelayConstraintImpl#getLower <em>Lower</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayConstraintImpl extends TimingConstraintImpl implements DelayConstraint {
	/**
	 * The default value of the '{@link #getMappingType() <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingType()
	 * @generated
	 * @ordered
	 */
	protected static final MappingType MAPPING_TYPE_EDEFAULT = MappingType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMappingType() <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingType()
	 * @generated
	 * @ordered
	 */
	protected MappingType mappingType = MAPPING_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EntityEvent source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EntityEvent target;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Time upper;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Time lower;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDelayConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType getMappingType() {
		return mappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingType(MappingType newMappingType) {
		MappingType oldMappingType = mappingType;
		mappingType = newMappingType == null ? MAPPING_TYPE_EDEFAULT : newMappingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DELAY_CONSTRAINT__MAPPING_TYPE, oldMappingType, mappingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityEvent getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EntityEvent)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DELAY_CONSTRAINT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityEvent basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EntityEvent newSource) {
		EntityEvent oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DELAY_CONSTRAINT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityEvent getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (EntityEvent)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DELAY_CONSTRAINT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityEvent basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EntityEvent newTarget) {
		EntityEvent oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DELAY_CONSTRAINT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper(Time newUpper, NotificationChain msgs) {
		Time oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DELAY_CONSTRAINT__UPPER, oldUpper, newUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Time newUpper) {
		if (newUpper != upper) {
			NotificationChain msgs = null;
			if (upper != null)
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DELAY_CONSTRAINT__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DELAY_CONSTRAINT__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DELAY_CONSTRAINT__UPPER, newUpper, newUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(Time newLower, NotificationChain msgs) {
		Time oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DELAY_CONSTRAINT__LOWER, oldLower, newLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Time newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DELAY_CONSTRAINT__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DELAY_CONSTRAINT__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DELAY_CONSTRAINT__LOWER, newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.DELAY_CONSTRAINT__UPPER:
				return basicSetUpper(null, msgs);
			case AmaltheaPackage.DELAY_CONSTRAINT__LOWER:
				return basicSetLower(null, msgs);
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
			case AmaltheaPackage.DELAY_CONSTRAINT__MAPPING_TYPE:
				return getMappingType();
			case AmaltheaPackage.DELAY_CONSTRAINT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AmaltheaPackage.DELAY_CONSTRAINT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AmaltheaPackage.DELAY_CONSTRAINT__UPPER:
				return getUpper();
			case AmaltheaPackage.DELAY_CONSTRAINT__LOWER:
				return getLower();
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
			case AmaltheaPackage.DELAY_CONSTRAINT__MAPPING_TYPE:
				setMappingType((MappingType)newValue);
				return;
			case AmaltheaPackage.DELAY_CONSTRAINT__SOURCE:
				setSource((EntityEvent)newValue);
				return;
			case AmaltheaPackage.DELAY_CONSTRAINT__TARGET:
				setTarget((EntityEvent)newValue);
				return;
			case AmaltheaPackage.DELAY_CONSTRAINT__UPPER:
				setUpper((Time)newValue);
				return;
			case AmaltheaPackage.DELAY_CONSTRAINT__LOWER:
				setLower((Time)newValue);
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
			case AmaltheaPackage.DELAY_CONSTRAINT__MAPPING_TYPE:
				setMappingType(MAPPING_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.DELAY_CONSTRAINT__SOURCE:
				setSource((EntityEvent)null);
				return;
			case AmaltheaPackage.DELAY_CONSTRAINT__TARGET:
				setTarget((EntityEvent)null);
				return;
			case AmaltheaPackage.DELAY_CONSTRAINT__UPPER:
				setUpper((Time)null);
				return;
			case AmaltheaPackage.DELAY_CONSTRAINT__LOWER:
				setLower((Time)null);
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
			case AmaltheaPackage.DELAY_CONSTRAINT__MAPPING_TYPE:
				return mappingType != MAPPING_TYPE_EDEFAULT;
			case AmaltheaPackage.DELAY_CONSTRAINT__SOURCE:
				return source != null;
			case AmaltheaPackage.DELAY_CONSTRAINT__TARGET:
				return target != null;
			case AmaltheaPackage.DELAY_CONSTRAINT__UPPER:
				return upper != null;
			case AmaltheaPackage.DELAY_CONSTRAINT__LOWER:
				return lower != null;
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
		result.append(" (mappingType: ");
		result.append(mappingType);
		result.append(')');
		return result.toString();
	}

} //DelayConstraintImpl
