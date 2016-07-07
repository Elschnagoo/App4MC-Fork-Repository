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
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeValueListEntry;
import org.eclipse.app4mc.amalthea.model.ModeValueProvider;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Value List Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeValueListEntryImpl#getValueProvider <em>Value Provider</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeValueListEntryImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeValueListEntryImpl extends BaseObjectImpl implements ModeValueListEntry {
	/**
	 * The cached value of the '{@link #getValueProvider() <em>Value Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueProvider()
	 * @generated
	 * @ordered
	 */
	protected ModeValueProvider valueProvider;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ModeLiteral value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeValueListEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getModeValueListEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeValueProvider getValueProvider() {
		if (valueProvider != null && valueProvider.eIsProxy()) {
			InternalEObject oldValueProvider = (InternalEObject)valueProvider;
			valueProvider = (ModeValueProvider)eResolveProxy(oldValueProvider);
			if (valueProvider != oldValueProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE_PROVIDER, oldValueProvider, valueProvider));
			}
		}
		return valueProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeValueProvider basicGetValueProvider() {
		return valueProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueProvider(ModeValueProvider newValueProvider) {
		ModeValueProvider oldValueProvider = valueProvider;
		valueProvider = newValueProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE_PROVIDER, oldValueProvider, valueProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLiteral getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (ModeLiteral)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLiteral basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ModeLiteral newValue) {
		ModeLiteral oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE_PROVIDER:
				if (resolve) return getValueProvider();
				return basicGetValueProvider();
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE_PROVIDER:
				setValueProvider((ModeValueProvider)newValue);
				return;
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE:
				setValue((ModeLiteral)newValue);
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
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE_PROVIDER:
				setValueProvider((ModeValueProvider)null);
				return;
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE:
				setValue((ModeLiteral)null);
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
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE_PROVIDER:
				return valueProvider != null;
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeValueListEntryImpl
