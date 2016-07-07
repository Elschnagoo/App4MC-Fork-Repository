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
import org.eclipse.app4mc.amalthea.model.MemoryType;
import org.eclipse.app4mc.amalthea.model.MemoryTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryTypeImpl#getXAccessPattern <em>XAccess Pattern</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryTypeImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryTypeImpl extends HardwareTypeDescriptionImpl implements MemoryType {
	/**
	 * The default value of the '{@link #getXAccessPattern() <em>XAccess Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAccessPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String XACCESS_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAccessPattern() <em>XAccess Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAccessPattern()
	 * @generated
	 * @ordered
	 */
	protected String xAccessPattern = XACCESS_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryTypeEnum TYPE_EDEFAULT = MemoryTypeEnum._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MemoryTypeEnum type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getMemoryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXAccessPattern() {
		return xAccessPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAccessPattern(String newXAccessPattern) {
		String oldXAccessPattern = xAccessPattern;
		xAccessPattern = newXAccessPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_TYPE__XACCESS_PATTERN, oldXAccessPattern, xAccessPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryTypeEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MemoryTypeEnum newType) {
		MemoryTypeEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_TYPE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.MEMORY_TYPE__XACCESS_PATTERN:
				return getXAccessPattern();
			case AmaltheaPackage.MEMORY_TYPE__TYPE:
				return getType();
			case AmaltheaPackage.MEMORY_TYPE__SIZE:
				return getSize();
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
			case AmaltheaPackage.MEMORY_TYPE__XACCESS_PATTERN:
				setXAccessPattern((String)newValue);
				return;
			case AmaltheaPackage.MEMORY_TYPE__TYPE:
				setType((MemoryTypeEnum)newValue);
				return;
			case AmaltheaPackage.MEMORY_TYPE__SIZE:
				setSize((Long)newValue);
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
			case AmaltheaPackage.MEMORY_TYPE__XACCESS_PATTERN:
				setXAccessPattern(XACCESS_PATTERN_EDEFAULT);
				return;
			case AmaltheaPackage.MEMORY_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.MEMORY_TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case AmaltheaPackage.MEMORY_TYPE__XACCESS_PATTERN:
				return XACCESS_PATTERN_EDEFAULT == null ? xAccessPattern != null : !XACCESS_PATTERN_EDEFAULT.equals(xAccessPattern);
			case AmaltheaPackage.MEMORY_TYPE__TYPE:
				return type != TYPE_EDEFAULT;
			case AmaltheaPackage.MEMORY_TYPE__SIZE:
				return size != SIZE_EDEFAULT;
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
		result.append(" (xAccessPattern: ");
		result.append(xAccessPattern);
		result.append(", type: ");
		result.append(type);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //MemoryTypeImpl
