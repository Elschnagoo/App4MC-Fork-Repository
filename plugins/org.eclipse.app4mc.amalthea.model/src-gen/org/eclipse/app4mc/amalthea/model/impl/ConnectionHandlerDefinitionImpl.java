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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.HwLatency;
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectionHandlerDefinitionImpl#getReadDataRate <em>Read Data Rate</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectionHandlerDefinitionImpl#getWriteDataRate <em>Write Data Rate</em>}</li>
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
	public void setReadLatency(HwLatency newReadLatency) {
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
	public void setWriteLatency(HwLatency newWriteLatency) {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE, oldReadDataRate, newReadDataRate);
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
				msgs = ((InternalEObject)readDataRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE, null, msgs);
			if (newReadDataRate != null)
				msgs = ((InternalEObject)newReadDataRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE, null, msgs);
			msgs = basicSetReadDataRate(newReadDataRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE, newReadDataRate, newReadDataRate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE, oldWriteDataRate, newWriteDataRate);
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
				msgs = ((InternalEObject)writeDataRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE, null, msgs);
			if (newWriteDataRate != null)
				msgs = ((InternalEObject)newWriteDataRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE, null, msgs);
			msgs = basicSetWriteDataRate(newWriteDataRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE, newWriteDataRate, newWriteDataRate));
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
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE:
				return basicSetReadDataRate(null, msgs);
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY:
				return getPolicy();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
				return getReadLatency();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				return getWriteLatency();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE:
				return getReadDataRate();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE:
				return getWriteDataRate();
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
				setReadLatency((HwLatency)newValue);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				setWriteLatency((HwLatency)newValue);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE:
				setReadDataRate((DataRate)newValue);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE:
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
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY:
				setPolicy(POLICY_EDEFAULT);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
				setReadLatency((HwLatency)null);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				setWriteLatency((HwLatency)null);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE:
				setReadDataRate((DataRate)null);
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE:
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
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY:
				return policy != POLICY_EDEFAULT;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
				return readLatency != null;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
				return writeLatency != null;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_DATA_RATE:
				return readDataRate != null;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_DATA_RATE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (policy: ");
		result.append(policy);
		result.append(')');
		return result.toString();
	}

} //ConnectionHandlerDefinitionImpl
