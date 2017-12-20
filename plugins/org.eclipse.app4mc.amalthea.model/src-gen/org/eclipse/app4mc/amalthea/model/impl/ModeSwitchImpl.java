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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
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
 * An implementation of the model object '<em><b>Mode Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeSwitchImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeSwitchImpl#getDefaultEntry <em>Default Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeSwitchImpl extends GraphEntryBaseImpl implements ModeSwitch {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeSwitchEntry<GraphEntryBase>> entries;

	/**
	 * The cached value of the '{@link #getDefaultEntry() <em>Default Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultEntry()
	 * @generated
	 * @ordered
	 */
	protected ModeSwitchDefault<GraphEntryBase> defaultEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getModeSwitch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeSwitchEntry<GraphEntryBase>> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<ModeSwitchEntry<GraphEntryBase>>(ModeSwitchEntry.class, this, AmaltheaPackage.MODE_SWITCH__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSwitchDefault<GraphEntryBase> getDefaultEntry() {
		return defaultEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultEntry(ModeSwitchDefault<GraphEntryBase> newDefaultEntry, NotificationChain msgs) {
		ModeSwitchDefault<GraphEntryBase> oldDefaultEntry = defaultEntry;
		defaultEntry = newDefaultEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY, oldDefaultEntry, newDefaultEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultEntry(ModeSwitchDefault<GraphEntryBase> newDefaultEntry) {
		if (newDefaultEntry != defaultEntry) {
			NotificationChain msgs = null;
			if (defaultEntry != null)
				msgs = ((InternalEObject)defaultEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY, null, msgs);
			if (newDefaultEntry != null)
				msgs = ((InternalEObject)newDefaultEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY, null, msgs);
			msgs = basicSetDefaultEntry(newDefaultEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY, newDefaultEntry, newDefaultEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MODE_SWITCH__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY:
				return basicSetDefaultEntry(null, msgs);
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
			case AmaltheaPackage.MODE_SWITCH__ENTRIES:
				return getEntries();
			case AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY:
				return getDefaultEntry();
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
			case AmaltheaPackage.MODE_SWITCH__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends ModeSwitchEntry<GraphEntryBase>>)newValue);
				return;
			case AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY:
				setDefaultEntry((ModeSwitchDefault<GraphEntryBase>)newValue);
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
			case AmaltheaPackage.MODE_SWITCH__ENTRIES:
				getEntries().clear();
				return;
			case AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY:
				setDefaultEntry((ModeSwitchDefault<GraphEntryBase>)null);
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
			case AmaltheaPackage.MODE_SWITCH__ENTRIES:
				return entries != null && !entries.isEmpty();
			case AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY:
				return defaultEntry != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeSwitchImpl
