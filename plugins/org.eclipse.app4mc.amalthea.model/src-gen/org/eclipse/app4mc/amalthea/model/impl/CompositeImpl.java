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
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.Composite;
import org.eclipse.app4mc.amalthea.model.Connector;
import org.eclipse.app4mc.amalthea.model.ISystem;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CompositeImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CompositeImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CompositeImpl#getGroundedPorts <em>Grounded Ports</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CompositeImpl#getInnerPorts <em>Inner Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends ComponentImpl implements Composite {
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
	 * The cached value of the '{@link #getGroundedPorts() <em>Grounded Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<QualifiedPort> groundedPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getComposite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, AmaltheaPackage.COMPOSITE__COMPONENT_INSTANCES);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, AmaltheaPackage.COMPOSITE__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualifiedPort> getGroundedPorts() {
		if (groundedPorts == null) {
			groundedPorts = new EObjectContainmentEList<QualifiedPort>(QualifiedPort.class, this, AmaltheaPackage.COMPOSITE__GROUNDED_PORTS);
		}
		return groundedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualifiedPort> getInnerPorts() {
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
			case AmaltheaPackage.COMPOSITE__COMPONENT_INSTANCES:
				return ((InternalEList<?>)getComponentInstances()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.COMPOSITE__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.COMPOSITE__GROUNDED_PORTS:
				return ((InternalEList<?>)getGroundedPorts()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.COMPOSITE__COMPONENT_INSTANCES:
				return getComponentInstances();
			case AmaltheaPackage.COMPOSITE__CONNECTORS:
				return getConnectors();
			case AmaltheaPackage.COMPOSITE__GROUNDED_PORTS:
				return getGroundedPorts();
			case AmaltheaPackage.COMPOSITE__INNER_PORTS:
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
			case AmaltheaPackage.COMPOSITE__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case AmaltheaPackage.COMPOSITE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case AmaltheaPackage.COMPOSITE__GROUNDED_PORTS:
				getGroundedPorts().clear();
				getGroundedPorts().addAll((Collection<? extends QualifiedPort>)newValue);
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
			case AmaltheaPackage.COMPOSITE__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				return;
			case AmaltheaPackage.COMPOSITE__CONNECTORS:
				getConnectors().clear();
				return;
			case AmaltheaPackage.COMPOSITE__GROUNDED_PORTS:
				getGroundedPorts().clear();
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
			case AmaltheaPackage.COMPOSITE__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case AmaltheaPackage.COMPOSITE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case AmaltheaPackage.COMPOSITE__GROUNDED_PORTS:
				return groundedPorts != null && !groundedPorts.isEmpty();
			case AmaltheaPackage.COMPOSITE__INNER_PORTS:
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
		if (baseClass == ISystem.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.COMPOSITE__COMPONENT_INSTANCES: return AmaltheaPackage.ISYSTEM__COMPONENT_INSTANCES;
				case AmaltheaPackage.COMPOSITE__CONNECTORS: return AmaltheaPackage.ISYSTEM__CONNECTORS;
				case AmaltheaPackage.COMPOSITE__GROUNDED_PORTS: return AmaltheaPackage.ISYSTEM__GROUNDED_PORTS;
				case AmaltheaPackage.COMPOSITE__INNER_PORTS: return AmaltheaPackage.ISYSTEM__INNER_PORTS;
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
		if (baseClass == ISystem.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ISYSTEM__COMPONENT_INSTANCES: return AmaltheaPackage.COMPOSITE__COMPONENT_INSTANCES;
				case AmaltheaPackage.ISYSTEM__CONNECTORS: return AmaltheaPackage.COMPOSITE__CONNECTORS;
				case AmaltheaPackage.ISYSTEM__GROUNDED_PORTS: return AmaltheaPackage.COMPOSITE__GROUNDED_PORTS;
				case AmaltheaPackage.ISYSTEM__INNER_PORTS: return AmaltheaPackage.COMPOSITE__INNER_PORTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CompositeImpl
