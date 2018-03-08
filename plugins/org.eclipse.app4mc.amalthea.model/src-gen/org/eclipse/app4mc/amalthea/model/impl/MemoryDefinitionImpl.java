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
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.HwLatency;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryDefinitionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryDefinitionImpl#getAccessLatency <em>Access Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryDefinitionImpl#getMemoryBandwidth <em>Memory Bandwidth</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryDefinitionImpl#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryDefinitionImpl extends HwDefinitionImpl implements MemoryDefinition {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected DataSize size;

	/**
	 * The cached value of the '{@link #getAccessLatency() <em>Access Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLatency()
	 * @generated
	 * @ordered
	 */
	protected HwLatency accessLatency;

	/**
	 * The cached value of the '{@link #getMemoryBandwidth() <em>Memory Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryBandwidth()
	 * @generated
	 * @ordered
	 */
	protected DataRate memoryBandwidth;

	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryClassifier> classifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getMemoryDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(DataSize newSize, NotificationChain msgs) {
		DataSize oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(DataSize newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_DEFINITION__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_DEFINITION__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwLatency getAccessLatency() {
		return accessLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessLatency(HwLatency newAccessLatency, NotificationChain msgs) {
		HwLatency oldAccessLatency = accessLatency;
		accessLatency = newAccessLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY, oldAccessLatency, newAccessLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLatency(HwLatency newAccessLatency) {
		if (newAccessLatency != accessLatency) {
			NotificationChain msgs = null;
			if (accessLatency != null)
				msgs = ((InternalEObject)accessLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY, null, msgs);
			if (newAccessLatency != null)
				msgs = ((InternalEObject)newAccessLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY, null, msgs);
			msgs = basicSetAccessLatency(newAccessLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY, newAccessLatency, newAccessLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate getMemoryBandwidth() {
		return memoryBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryBandwidth(DataRate newMemoryBandwidth, NotificationChain msgs) {
		DataRate oldMemoryBandwidth = memoryBandwidth;
		memoryBandwidth = newMemoryBandwidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH, oldMemoryBandwidth, newMemoryBandwidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryBandwidth(DataRate newMemoryBandwidth) {
		if (newMemoryBandwidth != memoryBandwidth) {
			NotificationChain msgs = null;
			if (memoryBandwidth != null)
				msgs = ((InternalEObject)memoryBandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH, null, msgs);
			if (newMemoryBandwidth != null)
				msgs = ((InternalEObject)newMemoryBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH, null, msgs);
			msgs = basicSetMemoryBandwidth(newMemoryBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH, newMemoryBandwidth, newMemoryBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryClassifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectResolvingEList<MemoryClassifier>(MemoryClassifier.class, this, AmaltheaPackage.MEMORY_DEFINITION__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MEMORY_DEFINITION__SIZE:
				return basicSetSize(null, msgs);
			case AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY:
				return basicSetAccessLatency(null, msgs);
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH:
				return basicSetMemoryBandwidth(null, msgs);
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
			case AmaltheaPackage.MEMORY_DEFINITION__SIZE:
				return getSize();
			case AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY:
				return getAccessLatency();
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH:
				return getMemoryBandwidth();
			case AmaltheaPackage.MEMORY_DEFINITION__CLASSIFIERS:
				return getClassifiers();
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
			case AmaltheaPackage.MEMORY_DEFINITION__SIZE:
				setSize((DataSize)newValue);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY:
				setAccessLatency((HwLatency)newValue);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH:
				setMemoryBandwidth((DataRate)newValue);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends MemoryClassifier>)newValue);
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
			case AmaltheaPackage.MEMORY_DEFINITION__SIZE:
				setSize((DataSize)null);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY:
				setAccessLatency((HwLatency)null);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH:
				setMemoryBandwidth((DataRate)null);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__CLASSIFIERS:
				getClassifiers().clear();
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
			case AmaltheaPackage.MEMORY_DEFINITION__SIZE:
				return size != null;
			case AmaltheaPackage.MEMORY_DEFINITION__ACCESS_LATENCY:
				return accessLatency != null;
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_BANDWIDTH:
				return memoryBandwidth != null;
			case AmaltheaPackage.MEMORY_DEFINITION__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoryDefinitionImpl
