/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

import java.net.URLEncoder;

import java.nio.charset.StandardCharsets;

import java.util.Map;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.AmaltheaValidations;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.IReferable;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.EventChainImpl#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventChainImpl extends AbstractEventChainImpl implements EventChain {
	/**
	 * The default value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getEventChain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniqueName() {
		return this.computeUniqueName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String computeUniqueName() {
		return this.basicComputeUniqueName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String basicComputeUniqueName() {
		String _encode = this.encode(this.getName());
		String _plus = (_encode + "?type=");
		String _name = this.eClass().getName();
		return (_plus + _name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String basicComputeUniqueNameWithPrefix(final String prefix) {
		String _encode = this.encode(prefix);
		String _plus = (_encode + "/");
		String _basicComputeUniqueName = this.basicComputeUniqueName();
		return (_plus + _basicComputeUniqueName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String encode(final String str) {
		try {
			String _xifexpression = null;
			boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(str);
			if (_isNullOrEmpty) {
				_xifexpression = "no-name";
			}
			else {
				_xifexpression = URLEncoder.encode(str, StandardCharsets.UTF_8.toString());
			}
			return _xifexpression;
		}
		catch (Throwable _e) {
			throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInvariants(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return AmaltheaValidations.validateInvariants(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.EVENT_CHAIN__UNIQUE_NAME:
				return getUniqueName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.EVENT_CHAIN__UNIQUE_NAME:
				return UNIQUE_NAME_EDEFAULT == null ? getUniqueName() != null : !UNIQUE_NAME_EDEFAULT.equals(getUniqueName());
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
		if (baseClass == IReferable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.EVENT_CHAIN__UNIQUE_NAME: return AmaltheaPackage.IREFERABLE__UNIQUE_NAME;
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
		if (baseClass == IReferable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.IREFERABLE__UNIQUE_NAME: return AmaltheaPackage.EVENT_CHAIN__UNIQUE_NAME;
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
				case AmaltheaPackage.IREFERABLE___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.EVENT_CHAIN___COMPUTE_UNIQUE_NAME;
				case AmaltheaPackage.IREFERABLE___BASIC_COMPUTE_UNIQUE_NAME: return AmaltheaPackage.EVENT_CHAIN___BASIC_COMPUTE_UNIQUE_NAME;
				case AmaltheaPackage.IREFERABLE___BASIC_COMPUTE_UNIQUE_NAME_WITH_PREFIX__STRING: return AmaltheaPackage.EVENT_CHAIN___BASIC_COMPUTE_UNIQUE_NAME_WITH_PREFIX__STRING;
				case AmaltheaPackage.IREFERABLE___ENCODE__STRING: return AmaltheaPackage.EVENT_CHAIN___ENCODE__STRING;
				case AmaltheaPackage.IREFERABLE___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP: return AmaltheaPackage.EVENT_CHAIN___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.EVENT_CHAIN___COMPUTE_UNIQUE_NAME:
				return computeUniqueName();
			case AmaltheaPackage.EVENT_CHAIN___BASIC_COMPUTE_UNIQUE_NAME:
				return basicComputeUniqueName();
			case AmaltheaPackage.EVENT_CHAIN___BASIC_COMPUTE_UNIQUE_NAME_WITH_PREFIX__STRING:
				return basicComputeUniqueNameWithPrefix((String)arguments.get(0));
			case AmaltheaPackage.EVENT_CHAIN___ENCODE__STRING:
				return encode((String)arguments.get(0));
			case AmaltheaPackage.EVENT_CHAIN___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP:
				return validateInvariants((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EventChainImpl
