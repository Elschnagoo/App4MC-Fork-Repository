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
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TransmissionPolicyImpl#getChunkSize <em>Chunk Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TransmissionPolicyImpl#getChunkProcessingInstructions <em>Chunk Processing Instructions</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TransmissionPolicyImpl#getTransmitRatio <em>Transmit Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionPolicyImpl extends AmaltheaExtendedEObjectImpl implements TransmissionPolicy {
	/**
	 * The cached value of the '{@link #getChunkSize() <em>Chunk Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkSize()
	 * @generated
	 * @ordered
	 */
	protected DataSize chunkSize;

	/**
	 * The default value of the '{@link #getChunkProcessingInstructions() <em>Chunk Processing Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkProcessingInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final int CHUNK_PROCESSING_INSTRUCTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChunkProcessingInstructions() <em>Chunk Processing Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunkProcessingInstructions()
	 * @generated
	 * @ordered
	 */
	protected int chunkProcessingInstructions = CHUNK_PROCESSING_INSTRUCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmitRatio() <em>Transmit Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSMIT_RATIO_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getTransmitRatio() <em>Transmit Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitRatio()
	 * @generated
	 * @ordered
	 */
	protected double transmitRatio = TRANSMIT_RATIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTransmissionPolicy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getChunkSize() {
		return chunkSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChunkSize(DataSize newChunkSize, NotificationChain msgs) {
		DataSize oldChunkSize = chunkSize;
		chunkSize = newChunkSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE, oldChunkSize, newChunkSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChunkSize(DataSize newChunkSize) {
		if (newChunkSize != chunkSize) {
			NotificationChain msgs = null;
			if (chunkSize != null)
				msgs = ((InternalEObject)chunkSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE, null, msgs);
			if (newChunkSize != null)
				msgs = ((InternalEObject)newChunkSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE, null, msgs);
			msgs = basicSetChunkSize(newChunkSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE, newChunkSize, newChunkSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChunkProcessingInstructions() {
		return chunkProcessingInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChunkProcessingInstructions(int newChunkProcessingInstructions) {
		int oldChunkProcessingInstructions = chunkProcessingInstructions;
		chunkProcessingInstructions = newChunkProcessingInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_PROCESSING_INSTRUCTIONS, oldChunkProcessingInstructions, chunkProcessingInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransmitRatio() {
		return transmitRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmitRatio(double newTransmitRatio) {
		double oldTransmitRatio = transmitRatio;
		transmitRatio = newTransmitRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TRANSMISSION_POLICY__TRANSMIT_RATIO, oldTransmitRatio, transmitRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE:
				return basicSetChunkSize(null, msgs);
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
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE:
				return getChunkSize();
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_PROCESSING_INSTRUCTIONS:
				return getChunkProcessingInstructions();
			case AmaltheaPackage.TRANSMISSION_POLICY__TRANSMIT_RATIO:
				return getTransmitRatio();
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
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE:
				setChunkSize((DataSize)newValue);
				return;
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_PROCESSING_INSTRUCTIONS:
				setChunkProcessingInstructions((Integer)newValue);
				return;
			case AmaltheaPackage.TRANSMISSION_POLICY__TRANSMIT_RATIO:
				setTransmitRatio((Double)newValue);
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
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE:
				setChunkSize((DataSize)null);
				return;
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_PROCESSING_INSTRUCTIONS:
				setChunkProcessingInstructions(CHUNK_PROCESSING_INSTRUCTIONS_EDEFAULT);
				return;
			case AmaltheaPackage.TRANSMISSION_POLICY__TRANSMIT_RATIO:
				setTransmitRatio(TRANSMIT_RATIO_EDEFAULT);
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
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_SIZE:
				return chunkSize != null;
			case AmaltheaPackage.TRANSMISSION_POLICY__CHUNK_PROCESSING_INSTRUCTIONS:
				return chunkProcessingInstructions != CHUNK_PROCESSING_INSTRUCTIONS_EDEFAULT;
			case AmaltheaPackage.TRANSMISSION_POLICY__TRANSMIT_RATIO:
				return transmitRatio != TRANSMIT_RATIO_EDEFAULT;
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
		result.append(" (chunkProcessingInstructions: ");
		result.append(chunkProcessingInstructions);
		result.append(", transmitRatio: ");
		result.append(transmitRatio);
		result.append(')');
		return result.toString();
	}

} //TransmissionPolicyImpl
