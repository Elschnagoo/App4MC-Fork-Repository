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
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;

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
 * An implementation of the model object '<em><b>Mode Switch Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeSwitchEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeSwitchEntryImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeSwitchEntryImpl#getGraphEntries <em>Graph Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeSwitchEntryImpl extends BaseObjectImpl implements ModeSwitchEntry {
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
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGraphEntries() <em>Graph Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphEntryBase> graphEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeSwitchEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getModeSwitchEntry();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MODE_SWITCH_ENTRY__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_SWITCH_ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_SWITCH_ENTRY__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphEntryBase> getGraphEntries() {
		if (graphEntries == null) {
			graphEntries = new EObjectContainmentEList.Resolving<GraphEntryBase>(GraphEntryBase.class, this, AmaltheaPackage.MODE_SWITCH_ENTRY__GRAPH_ENTRIES);
		}
		return graphEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MODE_SWITCH_ENTRY__GRAPH_ENTRIES:
				return ((InternalEList<?>)getGraphEntries()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.MODE_SWITCH_ENTRY__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case AmaltheaPackage.MODE_SWITCH_ENTRY__DEFAULT:
				return isDefault();
			case AmaltheaPackage.MODE_SWITCH_ENTRY__GRAPH_ENTRIES:
				return getGraphEntries();
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
			case AmaltheaPackage.MODE_SWITCH_ENTRY__VALUE:
				setValue((ModeLiteral)newValue);
				return;
			case AmaltheaPackage.MODE_SWITCH_ENTRY__DEFAULT:
				setDefault((Boolean)newValue);
				return;
			case AmaltheaPackage.MODE_SWITCH_ENTRY__GRAPH_ENTRIES:
				getGraphEntries().clear();
				getGraphEntries().addAll((Collection<? extends GraphEntryBase>)newValue);
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
			case AmaltheaPackage.MODE_SWITCH_ENTRY__VALUE:
				setValue((ModeLiteral)null);
				return;
			case AmaltheaPackage.MODE_SWITCH_ENTRY__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case AmaltheaPackage.MODE_SWITCH_ENTRY__GRAPH_ENTRIES:
				getGraphEntries().clear();
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
			case AmaltheaPackage.MODE_SWITCH_ENTRY__VALUE:
				return value != null;
			case AmaltheaPackage.MODE_SWITCH_ENTRY__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case AmaltheaPackage.MODE_SWITCH_ENTRY__GRAPH_ENTRIES:
				return graphEntries != null && !graphEntries.isEmpty();
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
		result.append(" (default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //ModeSwitchEntryImpl
