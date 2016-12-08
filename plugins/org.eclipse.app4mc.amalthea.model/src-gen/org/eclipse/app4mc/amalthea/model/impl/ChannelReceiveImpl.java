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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ChannelReceive;
import org.eclipse.app4mc.amalthea.model.ReceiveOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Receive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelReceiveImpl#getReceiveOperation <em>Receive Operation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelReceiveImpl#isDataMustBeNew <em>Data Must Be New</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelReceiveImpl#getElementIndex <em>Element Index</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelReceiveImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelReceiveImpl extends ChannelAccessImpl implements ChannelReceive {
	/**
	 * The default value of the '{@link #getReceiveOperation() <em>Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ReceiveOperation RECEIVE_OPERATION_EDEFAULT = ReceiveOperation._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getReceiveOperation() <em>Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveOperation()
	 * @generated
	 * @ordered
	 */
	protected ReceiveOperation receiveOperation = RECEIVE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDataMustBeNew() <em>Data Must Be New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataMustBeNew()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_MUST_BE_NEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataMustBeNew() <em>Data Must Be New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataMustBeNew()
	 * @generated
	 * @ordered
	 */
	protected boolean dataMustBeNew = DATA_MUST_BE_NEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementIndex() <em>Element Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENT_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElementIndex() <em>Element Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementIndex()
	 * @generated
	 * @ordered
	 */
	protected int elementIndex = ELEMENT_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelReceiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getChannelReceive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveOperation getReceiveOperation() {
		return receiveOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveOperation(ReceiveOperation newReceiveOperation) {
		ReceiveOperation oldReceiveOperation = receiveOperation;
		receiveOperation = newReceiveOperation == null ? RECEIVE_OPERATION_EDEFAULT : newReceiveOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_RECEIVE__RECEIVE_OPERATION, oldReceiveOperation, receiveOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataMustBeNew() {
		return dataMustBeNew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataMustBeNew(boolean newDataMustBeNew) {
		boolean oldDataMustBeNew = dataMustBeNew;
		dataMustBeNew = newDataMustBeNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_RECEIVE__DATA_MUST_BE_NEW, oldDataMustBeNew, dataMustBeNew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElementIndex() {
		return elementIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementIndex(int newElementIndex) {
		int oldElementIndex = elementIndex;
		elementIndex = newElementIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_RECEIVE__ELEMENT_INDEX, oldElementIndex, elementIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL_RECEIVE__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.CHANNEL_RECEIVE__RECEIVE_OPERATION:
				return getReceiveOperation();
			case AmaltheaPackage.CHANNEL_RECEIVE__DATA_MUST_BE_NEW:
				return isDataMustBeNew();
			case AmaltheaPackage.CHANNEL_RECEIVE__ELEMENT_INDEX:
				return getElementIndex();
			case AmaltheaPackage.CHANNEL_RECEIVE__LOWER_BOUND:
				return getLowerBound();
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
			case AmaltheaPackage.CHANNEL_RECEIVE__RECEIVE_OPERATION:
				setReceiveOperation((ReceiveOperation)newValue);
				return;
			case AmaltheaPackage.CHANNEL_RECEIVE__DATA_MUST_BE_NEW:
				setDataMustBeNew((Boolean)newValue);
				return;
			case AmaltheaPackage.CHANNEL_RECEIVE__ELEMENT_INDEX:
				setElementIndex((Integer)newValue);
				return;
			case AmaltheaPackage.CHANNEL_RECEIVE__LOWER_BOUND:
				setLowerBound((Integer)newValue);
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
			case AmaltheaPackage.CHANNEL_RECEIVE__RECEIVE_OPERATION:
				setReceiveOperation(RECEIVE_OPERATION_EDEFAULT);
				return;
			case AmaltheaPackage.CHANNEL_RECEIVE__DATA_MUST_BE_NEW:
				setDataMustBeNew(DATA_MUST_BE_NEW_EDEFAULT);
				return;
			case AmaltheaPackage.CHANNEL_RECEIVE__ELEMENT_INDEX:
				setElementIndex(ELEMENT_INDEX_EDEFAULT);
				return;
			case AmaltheaPackage.CHANNEL_RECEIVE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
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
			case AmaltheaPackage.CHANNEL_RECEIVE__RECEIVE_OPERATION:
				return receiveOperation != RECEIVE_OPERATION_EDEFAULT;
			case AmaltheaPackage.CHANNEL_RECEIVE__DATA_MUST_BE_NEW:
				return dataMustBeNew != DATA_MUST_BE_NEW_EDEFAULT;
			case AmaltheaPackage.CHANNEL_RECEIVE__ELEMENT_INDEX:
				return elementIndex != ELEMENT_INDEX_EDEFAULT;
			case AmaltheaPackage.CHANNEL_RECEIVE__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
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
		result.append(" (receiveOperation: ");
		result.append(receiveOperation);
		result.append(", dataMustBeNew: ");
		result.append(dataMustBeNew);
		result.append(", elementIndex: ");
		result.append(elementIndex);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(')');
		return result.toString();
	}

} //ChannelReceiveImpl
