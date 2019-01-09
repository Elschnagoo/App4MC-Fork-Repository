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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.IDiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.SchedPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectionHandlerDefinitionImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectionHandlerDefinitionImpl#getReadLatency <em>Read Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectionHandlerDefinitionImpl#getWriteLatency <em>Write Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectionHandlerDefinitionImpl#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectionHandlerDefinitionImpl#getMaxBurstSize <em>Max Burst Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectionHandlerDefinitionImpl#getMaxConcurrentTransfers <em>Max Concurrent Transfers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionHandlerDefinitionImpl extends HwDefinitionImpl implements ConnectionHandlerDefinition {
	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedPolicy POLICY_EDEFAULT = SchedPolicy._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedPolicy policy = POLICY_EDEFAULT;

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
	 * The default value of the '{@link #getMaxBurstSize() <em>Max Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBurstSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_BURST_SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxBurstSize() <em>Max Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBurstSize()
	 * @generated
	 * @ordered
	 */
	protected int maxBurstSize = MAX_BURST_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxConcurrentTransfers() <em>Max Concurrent Transfers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConcurrentTransfers()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CONCURRENT_TRANSFERS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxConcurrentTransfers() <em>Max Concurrent Transfers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConcurrentTransfers()
	 * @generated
	 * @ordered
	 */
	protected int maxConcurrentTransfers = MAX_CONCURRENT_TRANSFERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionHandlerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedPolicy getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(SchedPolicy newPolicy) {
		SchedPolicy oldPolicy = policy;
		policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY, oldPolicy, policy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY, oldReadLatency, newReadLatency);
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
				msgs = ((InternalEObject)readLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY, null, msgs);
			if (newReadLatency != null)
				msgs = ((InternalEObject)newReadLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY, null, msgs);
			msgs = basicSetReadLatency(newReadLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY, newReadLatency, newReadLatency));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY, oldWriteLatency, newWriteLatency);
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
				msgs = ((InternalEObject)writeLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY, null, msgs);
			if (newWriteLatency != null)
				msgs = ((InternalEObject)newWriteLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY, null, msgs);
			msgs = basicSetWriteLatency(newWriteLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY, newWriteLatency, newWriteLatency));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE, oldDataRate, newDataRate);
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
				msgs = ((InternalEObject)dataRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE, null, msgs);
			if (newDataRate != null)
				msgs = ((InternalEObject)newDataRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE, null, msgs);
			msgs = basicSetDataRate(newDataRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE, newDataRate, newDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxBurstSize() {
		return maxBurstSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBurstSize(int newMaxBurstSize) {
		int oldMaxBurstSize = maxBurstSize;
		maxBurstSize = newMaxBurstSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_BURST_SIZE, oldMaxBurstSize, maxBurstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxConcurrentTransfers() {
		return maxConcurrentTransfers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxConcurrentTransfers(int newMaxConcurrentTransfers) {
		int oldMaxConcurrentTransfers = maxConcurrentTransfers;
		maxConcurrentTransfers = newMaxConcurrentTransfers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_CONCURRENT_TRANSFERS, oldMaxConcurrentTransfers, maxConcurrentTransfers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
				return basicSetReadLatency(null, msgs);
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				return basicSetWriteLatency(null, msgs);
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE:
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
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY:
				return getPolicy();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
				return getReadLatency();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				return getWriteLatency();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE:
				return getDataRate();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_BURST_SIZE:
				return getMaxBurstSize();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_CONCURRENT_TRANSFERS:
				return getMaxConcurrentTransfers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY:
				setPolicy((SchedPolicy)newValue);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
				setReadLatency((IDiscreteDeviation)newValue);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				setWriteLatency((IDiscreteDeviation)newValue);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE:
				setDataRate((DataRate)newValue);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_BURST_SIZE:
				setMaxBurstSize((Integer)newValue);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_CONCURRENT_TRANSFERS:
				setMaxConcurrentTransfers((Integer)newValue);
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
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY:
				setPolicy(POLICY_EDEFAULT);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
				setReadLatency((IDiscreteDeviation)null);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				setWriteLatency((IDiscreteDeviation)null);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE:
				setDataRate((DataRate)null);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_BURST_SIZE:
				setMaxBurstSize(MAX_BURST_SIZE_EDEFAULT);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_CONCURRENT_TRANSFERS:
				setMaxConcurrentTransfers(MAX_CONCURRENT_TRANSFERS_EDEFAULT);
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
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY:
				return policy != POLICY_EDEFAULT;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
				return readLatency != null;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				return writeLatency != null;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE:
				return dataRate != null;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_BURST_SIZE:
				return maxBurstSize != MAX_BURST_SIZE_EDEFAULT;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_CONCURRENT_TRANSFERS:
				return maxConcurrentTransfers != MAX_CONCURRENT_TRANSFERS_EDEFAULT;
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
		result.append(" (policy: ");
		result.append(policy);
		result.append(", maxBurstSize: ");
		result.append(maxBurstSize);
		result.append(", maxConcurrentTransfers: ");
		result.append(maxConcurrentTransfers);
		result.append(')');
		return result.toString();
	}

} //ConnectionHandlerDefinitionImpl
