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
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.HwComponent;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.Network;
import org.eclipse.app4mc.amalthea.model.Prescaler;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexNodeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexNodeImpl#getPrescaler <em>Prescaler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexNodeImpl#getMemories <em>Memories</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexNodeImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexNodeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexNodeImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComplexNodeImpl extends ReferableBaseObjectImpl implements ComplexNode {
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
	 * The cached value of the '{@link #getPrescaler() <em>Prescaler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescaler()
	 * @generated
	 * @ordered
	 */
	protected Prescaler prescaler;

	/**
	 * The cached value of the '{@link #getMemories() <em>Memories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemories()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> memories;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networks;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<HwComponent> components;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getComplexNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.COMPLEX_NODE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescaler getPrescaler() {
		return prescaler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescaler(Prescaler newPrescaler, NotificationChain msgs) {
		Prescaler oldPrescaler = prescaler;
		prescaler = newPrescaler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_NODE__PRESCALER, oldPrescaler, newPrescaler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescaler(Prescaler newPrescaler) {
		if (newPrescaler != prescaler) {
			NotificationChain msgs = null;
			if (prescaler != null)
				msgs = ((InternalEObject)prescaler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.COMPLEX_NODE__PRESCALER, null, msgs);
			if (newPrescaler != null)
				msgs = ((InternalEObject)newPrescaler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.COMPLEX_NODE__PRESCALER, null, msgs);
			msgs = basicSetPrescaler(newPrescaler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_NODE__PRESCALER, newPrescaler, newPrescaler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemories() {
		if (memories == null) {
			memories = new EObjectContainmentEList<Memory>(Memory.class, this, AmaltheaPackage.COMPLEX_NODE__MEMORIES);
		}
		return memories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Network>(Network.class, this, AmaltheaPackage.COMPLEX_NODE__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<HwComponent>(HwComponent.class, this, AmaltheaPackage.COMPLEX_NODE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<HwPort>(HwPort.class, this, AmaltheaPackage.COMPLEX_NODE__PORTS, AmaltheaPackage.HW_PORT__CONTAINING_NODE);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.COMPLEX_NODE__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.COMPLEX_NODE__PRESCALER:
				return basicSetPrescaler(null, msgs);
			case AmaltheaPackage.COMPLEX_NODE__MEMORIES:
				return ((InternalEList<?>)getMemories()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.COMPLEX_NODE__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.COMPLEX_NODE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.COMPLEX_NODE__PORTS:
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
			case AmaltheaPackage.COMPLEX_NODE__TAGS:
				return getTags();
			case AmaltheaPackage.COMPLEX_NODE__PRESCALER:
				return getPrescaler();
			case AmaltheaPackage.COMPLEX_NODE__MEMORIES:
				return getMemories();
			case AmaltheaPackage.COMPLEX_NODE__NETWORKS:
				return getNetworks();
			case AmaltheaPackage.COMPLEX_NODE__COMPONENTS:
				return getComponents();
			case AmaltheaPackage.COMPLEX_NODE__PORTS:
				return getPorts();
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
			case AmaltheaPackage.COMPLEX_NODE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.COMPLEX_NODE__PRESCALER:
				setPrescaler((Prescaler)newValue);
				return;
			case AmaltheaPackage.COMPLEX_NODE__MEMORIES:
				getMemories().clear();
				getMemories().addAll((Collection<? extends Memory>)newValue);
				return;
			case AmaltheaPackage.COMPLEX_NODE__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case AmaltheaPackage.COMPLEX_NODE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends HwComponent>)newValue);
				return;
			case AmaltheaPackage.COMPLEX_NODE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends HwPort>)newValue);
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
			case AmaltheaPackage.COMPLEX_NODE__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.COMPLEX_NODE__PRESCALER:
				setPrescaler((Prescaler)null);
				return;
			case AmaltheaPackage.COMPLEX_NODE__MEMORIES:
				getMemories().clear();
				return;
			case AmaltheaPackage.COMPLEX_NODE__NETWORKS:
				getNetworks().clear();
				return;
			case AmaltheaPackage.COMPLEX_NODE__COMPONENTS:
				getComponents().clear();
				return;
			case AmaltheaPackage.COMPLEX_NODE__PORTS:
				getPorts().clear();
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
			case AmaltheaPackage.COMPLEX_NODE__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.COMPLEX_NODE__PRESCALER:
				return prescaler != null;
			case AmaltheaPackage.COMPLEX_NODE__MEMORIES:
				return memories != null && !memories.isEmpty();
			case AmaltheaPackage.COMPLEX_NODE__NETWORKS:
				return networks != null && !networks.isEmpty();
			case AmaltheaPackage.COMPLEX_NODE__COMPONENTS:
				return components != null && !components.isEmpty();
			case AmaltheaPackage.COMPLEX_NODE__PORTS:
				return ports != null && !ports.isEmpty();
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
				case AmaltheaPackage.COMPLEX_NODE__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
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
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.COMPLEX_NODE__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComplexNodeImpl
