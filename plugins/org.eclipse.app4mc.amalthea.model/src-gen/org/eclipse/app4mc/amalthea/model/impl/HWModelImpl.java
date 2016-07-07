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

import org.eclipse.app4mc.amalthea.model.AccessPath;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.ECUType;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwSystem;
import org.eclipse.app4mc.amalthea.model.MemoryType;
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType;
import org.eclipse.app4mc.amalthea.model.NetworkType;
import org.eclipse.app4mc.amalthea.model.SystemType;
import org.eclipse.app4mc.amalthea.model.Tag;

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
 * An implementation of the model object '<em><b>HW Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getSystemTypes <em>System Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getEcuTypes <em>Ecu Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getMcTypes <em>Mc Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getCoreTypes <em>Core Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getMemoryTypes <em>Memory Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getNetworkTypes <em>Network Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getAccessPaths <em>Access Paths</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HWModelImpl extends BaseObjectImpl implements HWModel {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getSystemTypes() <em>System Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemType> systemTypes;

	/**
	 * The cached value of the '{@link #getEcuTypes() <em>Ecu Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ECUType> ecuTypes;

	/**
	 * The cached value of the '{@link #getMcTypes() <em>Mc Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MicrocontrollerType> mcTypes;

	/**
	 * The cached value of the '{@link #getCoreTypes() <em>Core Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreType> coreTypes;

	/**
	 * The cached value of the '{@link #getMemoryTypes() <em>Memory Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryType> memoryTypes;

	/**
	 * The cached value of the '{@link #getNetworkTypes() <em>Network Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkType> networkTypes;

	/**
	 * The cached value of the '{@link #getAccessPaths() <em>Access Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessPath> accessPaths;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected HwSystem system;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHWModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, AmaltheaPackage.HW_MODEL__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemType> getSystemTypes() {
		if (systemTypes == null) {
			systemTypes = new EObjectContainmentEList<SystemType>(SystemType.class, this, AmaltheaPackage.HW_MODEL__SYSTEM_TYPES);
		}
		return systemTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECUType> getEcuTypes() {
		if (ecuTypes == null) {
			ecuTypes = new EObjectContainmentEList<ECUType>(ECUType.class, this, AmaltheaPackage.HW_MODEL__ECU_TYPES);
		}
		return ecuTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MicrocontrollerType> getMcTypes() {
		if (mcTypes == null) {
			mcTypes = new EObjectContainmentEList<MicrocontrollerType>(MicrocontrollerType.class, this, AmaltheaPackage.HW_MODEL__MC_TYPES);
		}
		return mcTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreType> getCoreTypes() {
		if (coreTypes == null) {
			coreTypes = new EObjectContainmentEList<CoreType>(CoreType.class, this, AmaltheaPackage.HW_MODEL__CORE_TYPES);
		}
		return coreTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryType> getMemoryTypes() {
		if (memoryTypes == null) {
			memoryTypes = new EObjectContainmentEList<MemoryType>(MemoryType.class, this, AmaltheaPackage.HW_MODEL__MEMORY_TYPES);
		}
		return memoryTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkType> getNetworkTypes() {
		if (networkTypes == null) {
			networkTypes = new EObjectContainmentEList<NetworkType>(NetworkType.class, this, AmaltheaPackage.HW_MODEL__NETWORK_TYPES);
		}
		return networkTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessPath> getAccessPaths() {
		if (accessPaths == null) {
			accessPaths = new EObjectContainmentEList<AccessPath>(AccessPath.class, this, AmaltheaPackage.HW_MODEL__ACCESS_PATHS);
		}
		return accessPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwSystem getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(HwSystem newSystem, NotificationChain msgs) {
		HwSystem oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MODEL__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(HwSystem newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MODEL__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MODEL__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MODEL__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_MODEL__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__SYSTEM_TYPES:
				return ((InternalEList<?>)getSystemTypes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__ECU_TYPES:
				return ((InternalEList<?>)getEcuTypes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__MC_TYPES:
				return ((InternalEList<?>)getMcTypes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__CORE_TYPES:
				return ((InternalEList<?>)getCoreTypes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__MEMORY_TYPES:
				return ((InternalEList<?>)getMemoryTypes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__NETWORK_TYPES:
				return ((InternalEList<?>)getNetworkTypes()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__ACCESS_PATHS:
				return ((InternalEList<?>)getAccessPaths()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__SYSTEM:
				return basicSetSystem(null, msgs);
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
			case AmaltheaPackage.HW_MODEL__TAGS:
				return getTags();
			case AmaltheaPackage.HW_MODEL__SYSTEM_TYPES:
				return getSystemTypes();
			case AmaltheaPackage.HW_MODEL__ECU_TYPES:
				return getEcuTypes();
			case AmaltheaPackage.HW_MODEL__MC_TYPES:
				return getMcTypes();
			case AmaltheaPackage.HW_MODEL__CORE_TYPES:
				return getCoreTypes();
			case AmaltheaPackage.HW_MODEL__MEMORY_TYPES:
				return getMemoryTypes();
			case AmaltheaPackage.HW_MODEL__NETWORK_TYPES:
				return getNetworkTypes();
			case AmaltheaPackage.HW_MODEL__ACCESS_PATHS:
				return getAccessPaths();
			case AmaltheaPackage.HW_MODEL__SYSTEM:
				return getSystem();
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
			case AmaltheaPackage.HW_MODEL__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__SYSTEM_TYPES:
				getSystemTypes().clear();
				getSystemTypes().addAll((Collection<? extends SystemType>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__ECU_TYPES:
				getEcuTypes().clear();
				getEcuTypes().addAll((Collection<? extends ECUType>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__MC_TYPES:
				getMcTypes().clear();
				getMcTypes().addAll((Collection<? extends MicrocontrollerType>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__CORE_TYPES:
				getCoreTypes().clear();
				getCoreTypes().addAll((Collection<? extends CoreType>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__MEMORY_TYPES:
				getMemoryTypes().clear();
				getMemoryTypes().addAll((Collection<? extends MemoryType>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__NETWORK_TYPES:
				getNetworkTypes().clear();
				getNetworkTypes().addAll((Collection<? extends NetworkType>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__ACCESS_PATHS:
				getAccessPaths().clear();
				getAccessPaths().addAll((Collection<? extends AccessPath>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__SYSTEM:
				setSystem((HwSystem)newValue);
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
			case AmaltheaPackage.HW_MODEL__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.HW_MODEL__SYSTEM_TYPES:
				getSystemTypes().clear();
				return;
			case AmaltheaPackage.HW_MODEL__ECU_TYPES:
				getEcuTypes().clear();
				return;
			case AmaltheaPackage.HW_MODEL__MC_TYPES:
				getMcTypes().clear();
				return;
			case AmaltheaPackage.HW_MODEL__CORE_TYPES:
				getCoreTypes().clear();
				return;
			case AmaltheaPackage.HW_MODEL__MEMORY_TYPES:
				getMemoryTypes().clear();
				return;
			case AmaltheaPackage.HW_MODEL__NETWORK_TYPES:
				getNetworkTypes().clear();
				return;
			case AmaltheaPackage.HW_MODEL__ACCESS_PATHS:
				getAccessPaths().clear();
				return;
			case AmaltheaPackage.HW_MODEL__SYSTEM:
				setSystem((HwSystem)null);
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
			case AmaltheaPackage.HW_MODEL__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.HW_MODEL__SYSTEM_TYPES:
				return systemTypes != null && !systemTypes.isEmpty();
			case AmaltheaPackage.HW_MODEL__ECU_TYPES:
				return ecuTypes != null && !ecuTypes.isEmpty();
			case AmaltheaPackage.HW_MODEL__MC_TYPES:
				return mcTypes != null && !mcTypes.isEmpty();
			case AmaltheaPackage.HW_MODEL__CORE_TYPES:
				return coreTypes != null && !coreTypes.isEmpty();
			case AmaltheaPackage.HW_MODEL__MEMORY_TYPES:
				return memoryTypes != null && !memoryTypes.isEmpty();
			case AmaltheaPackage.HW_MODEL__NETWORK_TYPES:
				return networkTypes != null && !networkTypes.isEmpty();
			case AmaltheaPackage.HW_MODEL__ACCESS_PATHS:
				return accessPaths != null && !accessPaths.isEmpty();
			case AmaltheaPackage.HW_MODEL__SYSTEM:
				return system != null;
		}
		return super.eIsSet(featureID);
	}

} //HWModelImpl
