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
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.Connector;
import org.eclipse.app4mc.amalthea.model.ISystem;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SystemImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SystemImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SystemImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ReferableBaseObjectImpl implements org.eclipse.app4mc.amalthea.model.System {
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
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstances;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.SYSTEM__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, AmaltheaPackage.SYSTEM__COMPONENT_INSTANCES);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, AmaltheaPackage.SYSTEM__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SYSTEM__COMPONENT_INSTANCES:
				return ((InternalEList<?>)getComponentInstances()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SYSTEM__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.SYSTEM__TAGS:
				return getTags();
			case AmaltheaPackage.SYSTEM__COMPONENT_INSTANCES:
				return getComponentInstances();
			case AmaltheaPackage.SYSTEM__CONNECTORS:
				return getConnectors();
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
			case AmaltheaPackage.SYSTEM__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.SYSTEM__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case AmaltheaPackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
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
			case AmaltheaPackage.SYSTEM__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.SYSTEM__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				return;
			case AmaltheaPackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
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
			case AmaltheaPackage.SYSTEM__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.SYSTEM__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case AmaltheaPackage.SYSTEM__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
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
				case AmaltheaPackage.SYSTEM__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
				default: return -1;
			}
		}
		if (baseClass == ISystem.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.SYSTEM__COMPONENT_INSTANCES: return AmaltheaPackage.ISYSTEM__COMPONENT_INSTANCES;
				case AmaltheaPackage.SYSTEM__CONNECTORS: return AmaltheaPackage.ISYSTEM__CONNECTORS;
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
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.SYSTEM__TAGS;
				default: return -1;
			}
		}
		if (baseClass == ISystem.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ISYSTEM__COMPONENT_INSTANCES: return AmaltheaPackage.SYSTEM__COMPONENT_INSTANCES;
				case AmaltheaPackage.ISYSTEM__CONNECTORS: return AmaltheaPackage.SYSTEM__CONNECTORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SystemImpl
