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

import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.TimeObject;
import org.eclipse.app4mc.amalthea.model.Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TimeObjectImpl extends AbstractTimeImpl implements TimeObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTimeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		String _string = super.toString();
		return ("(Time) " + _string);
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
				case AmaltheaPackage.ABSTRACT_TIME___TO_STRING: return AmaltheaPackage.TIME_OBJECT___TO_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Value.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.VALUE___CONTAINER_NOTIFICATION_REQUIRED: return AmaltheaPackage.TIME_OBJECT___CONTAINER_NOTIFICATION_REQUIRED;
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
			case AmaltheaPackage.TIME_OBJECT___TO_STRING:
				return toString();
			case AmaltheaPackage.TIME_OBJECT___CONTAINER_NOTIFICATION_REQUIRED:
				return containerNotificationRequired();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TimeObjectImpl
