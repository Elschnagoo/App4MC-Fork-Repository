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
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.StructureType;
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
 * An implementation of the model object '<em><b>Hw Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwStructureImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwStructureImpl#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwStructureImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwStructureImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwStructureImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwStructureImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwStructureImpl#getInnerPorts <em>Inner Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwStructureImpl extends ReferableBaseObjectImpl implements HwStructure {
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
	 * The default value of the '{@link #getStructureType() <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected static final StructureType STRUCTURE_TYPE_EDEFAULT = StructureType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getStructureType() <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected StructureType structureType = STRUCTURE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<HwStructure> structures;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<HwModule> modules;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<HwConnection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.HW_STRUCTURE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureType getStructureType() {
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructureType(StructureType newStructureType) {
		StructureType oldStructureType = structureType;
		structureType = newStructureType == null ? STRUCTURE_TYPE_EDEFAULT : newStructureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_STRUCTURE__STRUCTURE_TYPE, oldStructureType, structureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HwPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<HwPort>(HwPort.class, this, AmaltheaPackage.HW_STRUCTURE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HwStructure> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentEList<HwStructure>(HwStructure.class, this, AmaltheaPackage.HW_STRUCTURE__STRUCTURES);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HwModule> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<HwModule>(HwModule.class, this, AmaltheaPackage.HW_STRUCTURE__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HwConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<HwConnection>(HwConnection.class, this, AmaltheaPackage.HW_STRUCTURE__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HwPort> getInnerPorts() {
		return AmaltheaServices.getInnerPorts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_STRUCTURE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURES:
				return ((InternalEList<?>)getStructures()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_STRUCTURE__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_STRUCTURE__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.HW_STRUCTURE__TAGS:
				return getTags();
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURE_TYPE:
				return getStructureType();
			case AmaltheaPackage.HW_STRUCTURE__PORTS:
				return getPorts();
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURES:
				return getStructures();
			case AmaltheaPackage.HW_STRUCTURE__MODULES:
				return getModules();
			case AmaltheaPackage.HW_STRUCTURE__CONNECTIONS:
				return getConnections();
			case AmaltheaPackage.HW_STRUCTURE__INNER_PORTS:
				return getInnerPorts();
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
			case AmaltheaPackage.HW_STRUCTURE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURE_TYPE:
				setStructureType((StructureType)newValue);
				return;
			case AmaltheaPackage.HW_STRUCTURE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends HwPort>)newValue);
				return;
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends HwStructure>)newValue);
				return;
			case AmaltheaPackage.HW_STRUCTURE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends HwModule>)newValue);
				return;
			case AmaltheaPackage.HW_STRUCTURE__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends HwConnection>)newValue);
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
			case AmaltheaPackage.HW_STRUCTURE__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURE_TYPE:
				setStructureType(STRUCTURE_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.HW_STRUCTURE__PORTS:
				getPorts().clear();
				return;
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURES:
				getStructures().clear();
				return;
			case AmaltheaPackage.HW_STRUCTURE__MODULES:
				getModules().clear();
				return;
			case AmaltheaPackage.HW_STRUCTURE__CONNECTIONS:
				getConnections().clear();
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
			case AmaltheaPackage.HW_STRUCTURE__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURE_TYPE:
				return structureType != STRUCTURE_TYPE_EDEFAULT;
			case AmaltheaPackage.HW_STRUCTURE__PORTS:
				return ports != null && !ports.isEmpty();
			case AmaltheaPackage.HW_STRUCTURE__STRUCTURES:
				return structures != null && !structures.isEmpty();
			case AmaltheaPackage.HW_STRUCTURE__MODULES:
				return modules != null && !modules.isEmpty();
			case AmaltheaPackage.HW_STRUCTURE__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case AmaltheaPackage.HW_STRUCTURE__INNER_PORTS:
				return !getInnerPorts().isEmpty();
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
				case AmaltheaPackage.HW_STRUCTURE__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
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
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.HW_STRUCTURE__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (structureType: ");
		result.append(structureType);
		result.append(')');
		return result.toString();
	}

} //HwStructureImpl
