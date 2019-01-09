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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwPathElement;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.IDiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwConnectionImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwConnectionImpl#getReadLatency <em>Read Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwConnectionImpl#getWriteLatency <em>Write Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwConnectionImpl#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwConnectionImpl#getPort1 <em>Port1</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwConnectionImpl#getPort2 <em>Port2</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwConnectionImpl#isInternal <em>Internal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwConnectionImpl extends ReferableBaseObjectImpl implements HwConnection {
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
	 * The cached value of the '{@link #getReadLatency() <em>Read Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadLatency()
	 * @generated
	 * @ordered
	 */
	protected IDiscreteDeviation readLatency;

	/**
	 * The cached value of the '{@link #getWriteLatency() <em>Write Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteLatency()
	 * @generated
	 * @ordered
	 */
	protected IDiscreteDeviation writeLatency;

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
	 * The cached value of the '{@link #getPort1() <em>Port1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort1()
	 * @generated
	 * @ordered
	 */
	protected HwPort port1;

	/**
	 * The cached value of the '{@link #getPort2() <em>Port2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort2()
	 * @generated
	 * @ordered
	 */
	protected HwPort port2;

	/**
	 * The default value of the '{@link #isInternal() <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERNAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.HW_CONNECTION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiscreteDeviation getReadLatency() {
		return readLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadLatency(IDiscreteDeviation newReadLatency, NotificationChain msgs) {
		IDiscreteDeviation oldReadLatency = readLatency;
		readLatency = newReadLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CONNECTION__READ_LATENCY, oldReadLatency, newReadLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLatency(IDiscreteDeviation newReadLatency) {
		if (newReadLatency != readLatency) {
			NotificationChain msgs = null;
			if (readLatency != null)
				msgs = ((InternalEObject)readLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CONNECTION__READ_LATENCY, null, msgs);
			if (newReadLatency != null)
				msgs = ((InternalEObject)newReadLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CONNECTION__READ_LATENCY, null, msgs);
			msgs = basicSetReadLatency(newReadLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CONNECTION__READ_LATENCY, newReadLatency, newReadLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiscreteDeviation getWriteLatency() {
		return writeLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteLatency(IDiscreteDeviation newWriteLatency, NotificationChain msgs) {
		IDiscreteDeviation oldWriteLatency = writeLatency;
		writeLatency = newWriteLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY, oldWriteLatency, newWriteLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteLatency(IDiscreteDeviation newWriteLatency) {
		if (newWriteLatency != writeLatency) {
			NotificationChain msgs = null;
			if (writeLatency != null)
				msgs = ((InternalEObject)writeLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY, null, msgs);
			if (newWriteLatency != null)
				msgs = ((InternalEObject)newWriteLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY, null, msgs);
			msgs = basicSetWriteLatency(newWriteLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY, newWriteLatency, newWriteLatency));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CONNECTION__DATA_RATE, oldDataRate, newDataRate);
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
				msgs = ((InternalEObject)dataRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CONNECTION__DATA_RATE, null, msgs);
			if (newDataRate != null)
				msgs = ((InternalEObject)newDataRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CONNECTION__DATA_RATE, null, msgs);
			msgs = basicSetDataRate(newDataRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CONNECTION__DATA_RATE, newDataRate, newDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPort getPort1() {
		if (port1 != null && port1.eIsProxy()) {
			InternalEObject oldPort1 = (InternalEObject)port1;
			port1 = (HwPort)eResolveProxy(oldPort1);
			if (port1 != oldPort1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_CONNECTION__PORT1, oldPort1, port1));
			}
		}
		return port1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPort basicGetPort1() {
		return port1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort1(HwPort newPort1) {
		HwPort oldPort1 = port1;
		port1 = newPort1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CONNECTION__PORT1, oldPort1, port1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPort getPort2() {
		if (port2 != null && port2.eIsProxy()) {
			InternalEObject oldPort2 = (InternalEObject)port2;
			port2 = (HwPort)eResolveProxy(oldPort2);
			if (port2 != oldPort2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_CONNECTION__PORT2, oldPort2, port2));
			}
		}
		return port2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPort basicGetPort2() {
		return port2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort2(HwPort newPort2) {
		HwPort oldPort2 = port2;
		port2 = newPort2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CONNECTION__PORT2, oldPort2, port2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInternal() {
		EObject _eContainer = this.eContainer();
		return (_eContainer instanceof ConnectionHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String computeUniqueName() {
		EObject _eContainer = this.eContainer();
		String _name = null;
		if (((INamed) _eContainer)!=null) {
			_name=((INamed) _eContainer).getName();
		}
		return this.basicComputeUniqueNameWithPrefix(_name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwPort> getPorts() {
		return ECollections.<HwPort>unmodifiableEList(ECollections.<HwPort>toEList(IterableExtensions.<HwPort>filterNull(CollectionLiterals.<HwPort>newArrayList(this.getPort1(), this.getPort2()))));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_CONNECTION__READ_LATENCY:
				return basicSetReadLatency(null, msgs);
			case AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY:
				return basicSetWriteLatency(null, msgs);
			case AmaltheaPackage.HW_CONNECTION__DATA_RATE:
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
			case AmaltheaPackage.HW_CONNECTION__TAGS:
				return getTags();
			case AmaltheaPackage.HW_CONNECTION__READ_LATENCY:
				return getReadLatency();
			case AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY:
				return getWriteLatency();
			case AmaltheaPackage.HW_CONNECTION__DATA_RATE:
				return getDataRate();
			case AmaltheaPackage.HW_CONNECTION__PORT1:
				if (resolve) return getPort1();
				return basicGetPort1();
			case AmaltheaPackage.HW_CONNECTION__PORT2:
				if (resolve) return getPort2();
				return basicGetPort2();
			case AmaltheaPackage.HW_CONNECTION__INTERNAL:
				return isInternal();
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
			case AmaltheaPackage.HW_CONNECTION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.HW_CONNECTION__READ_LATENCY:
				setReadLatency((IDiscreteDeviation)newValue);
				return;
			case AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY:
				setWriteLatency((IDiscreteDeviation)newValue);
				return;
			case AmaltheaPackage.HW_CONNECTION__DATA_RATE:
				setDataRate((DataRate)newValue);
				return;
			case AmaltheaPackage.HW_CONNECTION__PORT1:
				setPort1((HwPort)newValue);
				return;
			case AmaltheaPackage.HW_CONNECTION__PORT2:
				setPort2((HwPort)newValue);
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
			case AmaltheaPackage.HW_CONNECTION__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.HW_CONNECTION__READ_LATENCY:
				setReadLatency((IDiscreteDeviation)null);
				return;
			case AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY:
				setWriteLatency((IDiscreteDeviation)null);
				return;
			case AmaltheaPackage.HW_CONNECTION__DATA_RATE:
				setDataRate((DataRate)null);
				return;
			case AmaltheaPackage.HW_CONNECTION__PORT1:
				setPort1((HwPort)null);
				return;
			case AmaltheaPackage.HW_CONNECTION__PORT2:
				setPort2((HwPort)null);
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
			case AmaltheaPackage.HW_CONNECTION__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.HW_CONNECTION__READ_LATENCY:
				return readLatency != null;
			case AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY:
				return writeLatency != null;
			case AmaltheaPackage.HW_CONNECTION__DATA_RATE:
				return dataRate != null;
			case AmaltheaPackage.HW_CONNECTION__PORT1:
				return port1 != null;
			case AmaltheaPackage.HW_CONNECTION__PORT2:
				return port2 != null;
			case AmaltheaPackage.HW_CONNECTION__INTERNAL:
				return isInternal() != INTERNAL_EDEFAULT;
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
		if (baseClass == HwPathElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ITaggable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.HW_CONNECTION__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
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
		if (baseClass == HwPathElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ITaggable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.HW_CONNECTION__TAGS;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IReferable.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.IREFERABLE___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.HW_CONNECTION___COMPUTE_UNIQUE_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ReferableBaseObject.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.HW_CONNECTION___COMPUTE_UNIQUE_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HwPathElement.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.HW_PATH_ELEMENT___GET_PORTS: return AmaltheaPackage.HW_CONNECTION___GET_PORTS;
				default: return -1;
			}
		}
		if (baseClass == ITaggable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.HW_CONNECTION___COMPUTE_UNIQUE_NAME:
				return computeUniqueName();
			case AmaltheaPackage.HW_CONNECTION___GET_PORTS:
				return getPorts();
		}
		return super.eInvoke(operationID, arguments);
	}

} //HwConnectionImpl
