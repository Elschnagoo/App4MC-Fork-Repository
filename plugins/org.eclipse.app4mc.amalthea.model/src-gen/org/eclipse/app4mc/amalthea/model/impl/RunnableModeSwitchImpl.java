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
import org.eclipse.app4mc.amalthea.model.ModeSwitchItem;
import org.eclipse.app4mc.amalthea.model.ModeValueProvider;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch;

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
 * An implementation of the model object '<em><b>Runnable Mode Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableModeSwitchImpl#getValueProvider <em>Value Provider</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableModeSwitchImpl#getModeItems <em>Mode Items</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableModeSwitchImpl#getDefaultItems <em>Default Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableModeSwitchImpl extends RunnableItemImpl implements RunnableModeSwitch {
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
	 * The cached value of the '{@link #getModeItems() <em>Mode Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeSwitchItem> modeItems;

	/**
	 * The cached value of the '{@link #getDefaultItems() <em>Default Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultItems()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableItem> defaultItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableModeSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnableModeSwitch();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_MODE_SWITCH__VALUE_PROVIDER, oldValueProvider, valueProvider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_MODE_SWITCH__VALUE_PROVIDER, oldValueProvider, valueProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeSwitchItem> getModeItems() {
		if (modeItems == null) {
			modeItems = new EObjectContainmentEList.Resolving<ModeSwitchItem>(ModeSwitchItem.class, this, AmaltheaPackage.RUNNABLE_MODE_SWITCH__MODE_ITEMS);
		}
		return modeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableItem> getDefaultItems() {
		if (defaultItems == null) {
			defaultItems = new EObjectContainmentEList.Resolving<RunnableItem>(RunnableItem.class, this, AmaltheaPackage.RUNNABLE_MODE_SWITCH__DEFAULT_ITEMS);
		}
		return defaultItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__MODE_ITEMS:
				return ((InternalEList<?>)getModeItems()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__DEFAULT_ITEMS:
				return ((InternalEList<?>)getDefaultItems()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__VALUE_PROVIDER:
				if (resolve) return getValueProvider();
				return basicGetValueProvider();
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__MODE_ITEMS:
				return getModeItems();
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__DEFAULT_ITEMS:
				return getDefaultItems();
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
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__VALUE_PROVIDER:
				setValueProvider((ModeValueProvider)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__MODE_ITEMS:
				getModeItems().clear();
				getModeItems().addAll((Collection<? extends ModeSwitchItem>)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__DEFAULT_ITEMS:
				getDefaultItems().clear();
				getDefaultItems().addAll((Collection<? extends RunnableItem>)newValue);
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
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__VALUE_PROVIDER:
				setValueProvider((ModeValueProvider)null);
				return;
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__MODE_ITEMS:
				getModeItems().clear();
				return;
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__DEFAULT_ITEMS:
				getDefaultItems().clear();
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
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__VALUE_PROVIDER:
				return valueProvider != null;
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__MODE_ITEMS:
				return modeItems != null && !modeItems.isEmpty();
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__DEFAULT_ITEMS:
				return defaultItems != null && !defaultItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RunnableModeSwitchImpl
