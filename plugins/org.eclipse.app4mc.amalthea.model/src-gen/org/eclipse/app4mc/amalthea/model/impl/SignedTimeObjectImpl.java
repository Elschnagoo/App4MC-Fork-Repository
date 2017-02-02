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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.SignedTimeObject;
import org.eclipse.app4mc.amalthea.model.Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signed Time Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SignedTimeObjectImpl extends AbstractTimeImpl implements SignedTimeObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignedTimeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSignedTimeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		String _string = super.toString();
		return ("(SignedTime) " + _string);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containerNotificationRequired() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractTime.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.ABSTRACT_TIME___TO_STRING: return AmaltheaPackage.SIGNED_TIME_OBJECT___TO_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Value.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.VALUE___CONTAINER_NOTIFICATION_REQUIRED: return AmaltheaPackage.SIGNED_TIME_OBJECT___CONTAINER_NOTIFICATION_REQUIRED;
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
			case AmaltheaPackage.SIGNED_TIME_OBJECT___TO_STRING:
				return toString();
			case AmaltheaPackage.SIGNED_TIME_OBJECT___CONTAINER_NOTIFICATION_REQUIRED:
				return containerNotificationRequired();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SignedTimeObjectImpl
