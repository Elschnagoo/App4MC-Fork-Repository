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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataUnit;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataUnitImpl#getNumberBits <em>Number Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataUnitImpl extends AmaltheaExtendedEObjectImpl implements DataUnit {
	/**
	 * The default value of the '{@link #getNumberBits() <em>Number Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBits()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_BITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberBits() <em>Number Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBits()
	 * @generated
	 * @ordered
	 */
	protected int numberBits = NUMBER_BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDataUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberBits() {
		return numberBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberBits(int newNumberBits) {
		int oldNumberBits = numberBits;
		numberBits = newNumberBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_UNIT__NUMBER_BITS, oldNumberBits, numberBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		int _numberBits = this.getNumberBits();
		return (Integer.valueOf(_numberBits) + " bit");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberBytes() {
		int _numberBits = this.getNumberBits();
		int _divide = (_numberBits / 8);
		double _ceil = Math.ceil(_divide);
		return Double.valueOf(_ceil).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberBytes(final int numberBytes) {
		this.setNumberBits((numberBytes * 8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.DATA_UNIT__NUMBER_BITS:
				return getNumberBits();
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
			case AmaltheaPackage.DATA_UNIT__NUMBER_BITS:
				setNumberBits((Integer)newValue);
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
			case AmaltheaPackage.DATA_UNIT__NUMBER_BITS:
				setNumberBits(NUMBER_BITS_EDEFAULT);
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
			case AmaltheaPackage.DATA_UNIT__NUMBER_BITS:
				return numberBits != NUMBER_BITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.DATA_UNIT___TO_STRING:
				return toString();
			case AmaltheaPackage.DATA_UNIT___GET_NUMBER_BYTES:
				return getNumberBytes();
			case AmaltheaPackage.DATA_UNIT___SET_NUMBER_BYTES__INT:
				setNumberBytes((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataUnitImpl
