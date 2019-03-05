/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.PowerDomain;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwModuleImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwModuleImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwModuleImpl#getPowerDomain <em>Power Domain</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwModuleImpl#getFrequencyDomain <em>Frequency Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HwModuleImpl extends ReferableBaseObjectImpl implements HwModule {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<HwPort> ports;

	/**
	 * The cached value of the '{@link #getPowerDomain() <em>Power Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerDomain()
	 * @generated
	 * @ordered
	 */
	protected PowerDomain powerDomain;

	/**
	 * The cached value of the '{@link #getFrequencyDomain() <em>Frequency Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyDomain()
	 * @generated
	 * @ordered
	 */
	protected FrequencyDomain frequencyDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.HW_MODULE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HwPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<HwPort>(HwPort.class, this, AmaltheaPackage.HW_MODULE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerDomain getPowerDomain() {
		if (powerDomain != null && powerDomain.eIsProxy()) {
			InternalEObject oldPowerDomain = (InternalEObject)powerDomain;
			powerDomain = (PowerDomain)eResolveProxy(oldPowerDomain);
			if (powerDomain != oldPowerDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_MODULE__POWER_DOMAIN, oldPowerDomain, powerDomain));
			}
		}
		return powerDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerDomain basicGetPowerDomain() {
		return powerDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerDomain(PowerDomain newPowerDomain) {
		PowerDomain oldPowerDomain = powerDomain;
		powerDomain = newPowerDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MODULE__POWER_DOMAIN, oldPowerDomain, powerDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyDomain getFrequencyDomain() {
		if (frequencyDomain != null && frequencyDomain.eIsProxy()) {
			InternalEObject oldFrequencyDomain = (InternalEObject)frequencyDomain;
			frequencyDomain = (FrequencyDomain)eResolveProxy(oldFrequencyDomain);
			if (frequencyDomain != oldFrequencyDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_MODULE__FREQUENCY_DOMAIN, oldFrequencyDomain, frequencyDomain));
			}
		}
		return frequencyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyDomain basicGetFrequencyDomain() {
		return frequencyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequencyDomain(FrequencyDomain newFrequencyDomain) {
		FrequencyDomain oldFrequencyDomain = frequencyDomain;
		frequencyDomain = newFrequencyDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MODULE__FREQUENCY_DOMAIN, oldFrequencyDomain, frequencyDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_MODULE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.HW_MODULE__TAGS:
				return getTags();
			case AmaltheaPackage.HW_MODULE__PORTS:
				return getPorts();
			case AmaltheaPackage.HW_MODULE__POWER_DOMAIN:
				if (resolve) return getPowerDomain();
				return basicGetPowerDomain();
			case AmaltheaPackage.HW_MODULE__FREQUENCY_DOMAIN:
				if (resolve) return getFrequencyDomain();
				return basicGetFrequencyDomain();
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
			case AmaltheaPackage.HW_MODULE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.HW_MODULE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends HwPort>)newValue);
				return;
			case AmaltheaPackage.HW_MODULE__POWER_DOMAIN:
				setPowerDomain((PowerDomain)newValue);
				return;
			case AmaltheaPackage.HW_MODULE__FREQUENCY_DOMAIN:
				setFrequencyDomain((FrequencyDomain)newValue);
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
			case AmaltheaPackage.HW_MODULE__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.HW_MODULE__PORTS:
				getPorts().clear();
				return;
			case AmaltheaPackage.HW_MODULE__POWER_DOMAIN:
				setPowerDomain((PowerDomain)null);
				return;
			case AmaltheaPackage.HW_MODULE__FREQUENCY_DOMAIN:
				setFrequencyDomain((FrequencyDomain)null);
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
			case AmaltheaPackage.HW_MODULE__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.HW_MODULE__PORTS:
				return ports != null && !ports.isEmpty();
			case AmaltheaPackage.HW_MODULE__POWER_DOMAIN:
				return powerDomain != null;
			case AmaltheaPackage.HW_MODULE__FREQUENCY_DOMAIN:
				return frequencyDomain != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ITaggable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.HW_MODULE__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ITaggable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.HW_MODULE__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HwModuleImpl
