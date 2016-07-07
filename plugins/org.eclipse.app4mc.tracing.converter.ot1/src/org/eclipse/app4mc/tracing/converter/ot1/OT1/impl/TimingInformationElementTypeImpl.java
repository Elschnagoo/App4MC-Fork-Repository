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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Information Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationElementTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationElementTypeImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationElementTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingInformationElementTypeImpl extends TimingValueElementTypeImpl implements TimingInformationElementType {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType value;

	/**
	 * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected static final TimingInformationSubTypeEnum SUB_TYPE_EDEFAULT = TimingInformationSubTypeEnum.MIN;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected TimingInformationSubTypeEnum subType = SUB_TYPE_EDEFAULT;

	/**
	 * This is true if the Sub Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subTypeESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TimingInformationTypeEnum TYPE_EDEFAULT = TimingInformationTypeEnum.CET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TimingInformationTypeEnum type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingInformationElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TIMING_INFORMATION_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(TimeValueType newValue, NotificationChain msgs) {
		TimeValueType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(TimeValueType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationSubTypeEnum getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(TimingInformationSubTypeEnum newSubType) {
		TimingInformationSubTypeEnum oldSubType = subType;
		subType = newSubType == null ? SUB_TYPE_EDEFAULT : newSubType;
		boolean oldSubTypeESet = subTypeESet;
		subTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE, oldSubType, subType, !oldSubTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubType() {
		TimingInformationSubTypeEnum oldSubType = subType;
		boolean oldSubTypeESet = subTypeESet;
		subType = SUB_TYPE_EDEFAULT;
		subTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE, oldSubType, SUB_TYPE_EDEFAULT, oldSubTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubType() {
		return subTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationTypeEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TimingInformationTypeEnum newType) {
		TimingInformationTypeEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TimingInformationTypeEnum oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE:
				return basicSetValue(null, msgs);
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
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE:
				return getValue();
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE:
				return getSubType();
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__TYPE:
				return getType();
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
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE:
				setValue((TimeValueType)newValue);
				return;
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE:
				setSubType((TimingInformationSubTypeEnum)newValue);
				return;
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__TYPE:
				setType((TimingInformationTypeEnum)newValue);
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
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE:
				setValue((TimeValueType)null);
				return;
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE:
				unsetSubType();
				return;
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__TYPE:
				unsetType();
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
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__VALUE:
				return value != null;
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE:
				return isSetSubType();
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE__TYPE:
				return isSetType();
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
		result.append(" (subType: ");
		if (subTypeESet) result.append(subType); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimingInformationElementTypeImpl
