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
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwDestination;
import org.eclipse.app4mc.amalthea.model.HwLatency;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Access Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getAccessPaths <em>Access Paths</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getReadLatency <em>Read Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getWriteLatency <em>Write Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getReadDataRate <em>Read Data Rate</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessElementImpl#getWriteDataRate <em>Write Data Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwAccessElementImpl extends AmaltheaExtendedEObjectImpl implements HwAccessElement {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected HwDestination destination;

	/**
	 * The cached value of the '{@link #getAccessPaths() <em>Access Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<HwAccessPath> accessPaths;

	/**
	 * The cached value of the '{@link #getReadLatency() <em>Read Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadLatency()
	 * @generated
	 * @ordered
	 */
	protected HwLatency readLatency;

	/**
	 * The cached value of the '{@link #getWriteLatency() <em>Write Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteLatency()
	 * @generated
	 * @ordered
	 */
	protected HwLatency writeLatency;

	/**
	 * The cached value of the '{@link #getReadDataRate() <em>Read Data Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadDataRate()
	 * @generated
	 * @ordered
	 */
	protected DataRate readDataRate;

	/**
	 * The cached value of the '{@link #getWriteDataRate() <em>Write Data Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteDataRate()
	 * @generated
	 * @ordered
	 */
	protected DataRate writeDataRate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwAccessElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwAccessElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.HW_ACCESS_ELEMENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnit getSource() {
		if (eContainerFeatureID() != AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE) return null;
		return (ProcessingUnit)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnit basicGetSource() {
		if (eContainerFeatureID() != AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE) return null;
		return (ProcessingUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDestination getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (HwDestination)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_ACCESS_ELEMENT__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDestination basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(HwDestination newDestination) {
		HwDestination oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwAccessPath> getAccessPaths() {
		if (accessPaths == null) {
			accessPaths = new EObjectContainmentWithInverseEList<HwAccessPath>(HwAccessPath.class, this, AmaltheaPackage.HW_ACCESS_ELEMENT__ACCESS_PATHS, AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT);
		}
		return accessPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwLatency getReadLatency() {
		return readLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadLatency(HwLatency newReadLatency, NotificationChain msgs) {
		HwLatency oldReadLatency = readLatency;
		readLatency = newReadLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY, oldReadLatency, newReadLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLatency(HwLatency newReadLatency) {
		if (newReadLatency != readLatency) {
			NotificationChain msgs = null;
			if (readLatency != null)
				msgs = ((InternalEObject)readLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY, null, msgs);
			if (newReadLatency != null)
				msgs = ((InternalEObject)newReadLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY, null, msgs);
			msgs = basicSetReadLatency(newReadLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY, newReadLatency, newReadLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwLatency getWriteLatency() {
		return writeLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteLatency(HwLatency newWriteLatency, NotificationChain msgs) {
		HwLatency oldWriteLatency = writeLatency;
		writeLatency = newWriteLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY, oldWriteLatency, newWriteLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteLatency(HwLatency newWriteLatency) {
		if (newWriteLatency != writeLatency) {
			NotificationChain msgs = null;
			if (writeLatency != null)
				msgs = ((InternalEObject)writeLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY, null, msgs);
			if (newWriteLatency != null)
				msgs = ((InternalEObject)newWriteLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY, null, msgs);
			msgs = basicSetWriteLatency(newWriteLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY, newWriteLatency, newWriteLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate getReadDataRate() {
		return readDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadDataRate(DataRate newReadDataRate, NotificationChain msgs) {
		DataRate oldReadDataRate = readDataRate;
		readDataRate = newReadDataRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE, oldReadDataRate, newReadDataRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadDataRate(DataRate newReadDataRate) {
		if (newReadDataRate != readDataRate) {
			NotificationChain msgs = null;
			if (readDataRate != null)
				msgs = ((InternalEObject)readDataRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE, null, msgs);
			if (newReadDataRate != null)
				msgs = ((InternalEObject)newReadDataRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE, null, msgs);
			msgs = basicSetReadDataRate(newReadDataRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE, newReadDataRate, newReadDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate getWriteDataRate() {
		return writeDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteDataRate(DataRate newWriteDataRate, NotificationChain msgs) {
		DataRate oldWriteDataRate = writeDataRate;
		writeDataRate = newWriteDataRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE, oldWriteDataRate, newWriteDataRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteDataRate(DataRate newWriteDataRate) {
		if (newWriteDataRate != writeDataRate) {
			NotificationChain msgs = null;
			if (writeDataRate != null)
				msgs = ((InternalEObject)writeDataRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE, null, msgs);
			if (newWriteDataRate != null)
				msgs = ((InternalEObject)newWriteDataRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE, null, msgs);
			msgs = basicSetWriteDataRate(newWriteDataRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE, newWriteDataRate, newWriteDataRate));
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
			case AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE, msgs);
			case AmaltheaPackage.HW_ACCESS_ELEMENT__ACCESS_PATHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessPaths()).basicAdd(otherEnd, msgs);
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
			case AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE:
				return eBasicSetContainer(null, AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE, msgs);
			case AmaltheaPackage.HW_ACCESS_ELEMENT__ACCESS_PATHS:
				return ((InternalEList<?>)getAccessPaths()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY:
				return basicSetReadLatency(null, msgs);
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY:
				return basicSetWriteLatency(null, msgs);
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE:
				return basicSetReadDataRate(null, msgs);
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE:
				return basicSetWriteDataRate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE:
				return eInternalContainer().eInverseRemove(this, AmaltheaPackage.PROCESSING_UNIT__ACCESS_ELEMENTS, ProcessingUnit.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.HW_ACCESS_ELEMENT__TAGS:
				return getTags();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__NAME:
				return getName();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__ACCESS_PATHS:
				return getAccessPaths();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY:
				return getReadLatency();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY:
				return getWriteLatency();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE:
				return getReadDataRate();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE:
				return getWriteDataRate();
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
			case AmaltheaPackage.HW_ACCESS_ELEMENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__DESTINATION:
				setDestination((HwDestination)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__ACCESS_PATHS:
				getAccessPaths().clear();
				getAccessPaths().addAll((Collection<? extends HwAccessPath>)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY:
				setReadLatency((HwLatency)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY:
				setWriteLatency((HwLatency)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE:
				setReadDataRate((DataRate)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE:
				setWriteDataRate((DataRate)newValue);
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
			case AmaltheaPackage.HW_ACCESS_ELEMENT__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__DESTINATION:
				setDestination((HwDestination)null);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__ACCESS_PATHS:
				getAccessPaths().clear();
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY:
				setReadLatency((HwLatency)null);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY:
				setWriteLatency((HwLatency)null);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE:
				setReadDataRate((DataRate)null);
				return;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE:
				setWriteDataRate((DataRate)null);
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
			case AmaltheaPackage.HW_ACCESS_ELEMENT__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE:
				return basicGetSource() != null;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__DESTINATION:
				return destination != null;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__ACCESS_PATHS:
				return accessPaths != null && !accessPaths.isEmpty();
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_LATENCY:
				return readLatency != null;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_LATENCY:
				return writeLatency != null;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__READ_DATA_RATE:
				return readDataRate != null;
			case AmaltheaPackage.HW_ACCESS_ELEMENT__WRITE_DATA_RATE:
				return writeDataRate != null;
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
		if (baseClass == INamed.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.HW_ACCESS_ELEMENT__NAME: return AmaltheaPackage.INAMED__NAME;
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
		if (baseClass == INamed.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.INAMED__NAME: return AmaltheaPackage.HW_ACCESS_ELEMENT__NAME;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HwAccessElementImpl
