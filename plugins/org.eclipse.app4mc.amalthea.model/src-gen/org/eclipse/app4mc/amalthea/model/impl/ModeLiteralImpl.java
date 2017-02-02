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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModeLiteralImpl extends ReferableBaseObjectImpl implements ModeLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getModeLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String computeUniqueName() {
		EObject _eContainer = this.eContainer();
		Object _eGet = null;
		if (_eContainer!=null) {
			EClass _eClass = this.eClass();
			EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature("name");
			_eGet=_eContainer.eGet(_eStructuralFeature);
		}
		final String containerName = this.encode(((String) _eGet));
		String _computeUniqueName = super.computeUniqueName();
		return ((containerName + "/") + _computeUniqueName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		EObject _eContainer = this.eContainer();
		Object _eGet = null;
		if (_eContainer!=null) {
			EClass _eClass = this.eClass();
			EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature("name");
			_eGet=_eContainer.eGet(_eStructuralFeature);
		}
		final String modeName = ((String) _eGet);
		String _xifexpression = null;
		boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(modeName);
		if (_isNullOrEmpty) {
			_xifexpression = "<mode>";
		}
		else {
			_xifexpression = modeName;
		}
		String _plus = (_xifexpression + "::");
		String _xifexpression_1 = null;
		String _name = this.getName();
		boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_name);
		if (_isNullOrEmpty_1) {
			_xifexpression_1 = "<literal>";
		}
		else {
			_xifexpression_1 = this.getName();
		}
		return (_plus + _xifexpression_1);
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
				case AmaltheaPackage.IREFERABLE___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.MODE_LITERAL___COMPUTE_UNIQUE_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ReferableBaseObject.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.MODE_LITERAL___COMPUTE_UNIQUE_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case AmaltheaPackage.MODE_LITERAL___COMPUTE_UNIQUE_NAME:
				return computeUniqueName();
			case AmaltheaPackage.MODE_LITERAL___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModeLiteralImpl
