/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.MemoryType;

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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryDefinitionImpl#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryDefinitionImpl#getMemoryType <em>Memory Type</em>}</li>
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
	protected DiscreteDeviation accessLatency;

	/**
	 * The cached value of the '{@link #getDataRate() <em>Data Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRate()
	 * @generated
	 * @ordered
	 */
	protected DataRate dataRate;

	/**
	 * The default value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryType MEMORY_TYPE_EDEFAULT = MemoryType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected MemoryType memoryType = MEMORY_TYPE_EDEFAULT;

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
	public DiscreteDeviation getAccessLatency() {
		return accessLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessLatency(DiscreteDeviation newAccessLatency, NotificationChain msgs) {
		DiscreteDeviation oldAccessLatency = accessLatency;
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
	public void setAccessLatency(DiscreteDeviation newAccessLatency) {
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
	public DataRate getDataRate() {
		return dataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataRate(DataRate newDataRate, NotificationChain msgs) {
		DataRate oldDataRate = dataRate;
		dataRate = newDataRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE, oldDataRate, newDataRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRate(DataRate newDataRate) {
		if (newDataRate != dataRate) {
			NotificationChain msgs = null;
			if (dataRate != null)
				msgs = ((InternalEObject)dataRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE, null, msgs);
			if (newDataRate != null)
				msgs = ((InternalEObject)newDataRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE, null, msgs);
			msgs = basicSetDataRate(newDataRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE, newDataRate, newDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryType getMemoryType() {
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryType(MemoryType newMemoryType) {
		MemoryType oldMemoryType = memoryType;
		memoryType = newMemoryType == null ? MEMORY_TYPE_EDEFAULT : newMemoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_DEFINITION__MEMORY_TYPE, oldMemoryType, memoryType));
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
			case AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE:
				return basicSetDataRate(null, msgs);
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
			case AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE:
				return getDataRate();
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_TYPE:
				return getMemoryType();
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
				setAccessLatency((DiscreteDeviation)newValue);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE:
				setDataRate((DataRate)newValue);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_TYPE:
				setMemoryType((MemoryType)newValue);
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
				setAccessLatency((DiscreteDeviation)null);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE:
				setDataRate((DataRate)null);
				return;
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_TYPE:
				setMemoryType(MEMORY_TYPE_EDEFAULT);
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
			case AmaltheaPackage.MEMORY_DEFINITION__DATA_RATE:
				return dataRate != null;
			case AmaltheaPackage.MEMORY_DEFINITION__MEMORY_TYPE:
				return memoryType != MEMORY_TYPE_EDEFAULT;
			case AmaltheaPackage.MEMORY_DEFINITION__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (memoryType: ");
		result.append(memoryType);
		result.append(')');
		return result.toString();
	}

} //MemoryDefinitionImpl
