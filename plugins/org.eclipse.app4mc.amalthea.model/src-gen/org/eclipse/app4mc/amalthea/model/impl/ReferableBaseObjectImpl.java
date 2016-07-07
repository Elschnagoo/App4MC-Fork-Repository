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

import java.net.URLEncoder;

import java.nio.charset.StandardCharsets;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;
import org.eclipse.app4mc.amalthea.model.Value;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referable Base Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ReferableBaseObjectImpl#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ReferableBaseObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ReferableBaseObjectImpl#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferableBaseObjectImpl extends AmaltheaExtendedEObjectImpl implements ReferableBaseObject {
	/**
	 * The cached value of the '{@link #getCustomProperties() <em>Custom Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Value> customProperties;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected ReferableBaseObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getReferableBaseObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Value> getCustomProperties() {
		if (customProperties == null) {
			customProperties = new EcoreEMap<String,Value>(AmaltheaPackage.eINSTANCE.getCustomProperty(), CustomPropertyImpl.class, this, AmaltheaPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES);
		}
		return customProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REFERABLE_BASE_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueName() {
		return this.computeUniqueName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String computeUniqueName() {
		String _name = this.getName();
		String _encode = this.encode(_name);
		String _plus = (_encode + "?type=");
		EClass _eClass = this.eClass();
		String _name_1 = _eClass.getName();
		return (_plus + _name_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String encode(final String str) {
		try {
			String _xifexpression = null;
			boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(str);
			if (_isNullOrEmpty) {
				_xifexpression = "no-name";
			}
			else {
				String _string = StandardCharsets.UTF_8.toString();
				_xifexpression = URLEncoder.encode(str, _string);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				return ((InternalEList<?>)getCustomProperties()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				if (coreType) return getCustomProperties();
				else return getCustomProperties().map();
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__NAME:
				return getName();
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__UNIQUE_NAME:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				((EStructuralFeature.Setting)getCustomProperties()).set(newValue);
				return;
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__NAME:
				setName((String)newValue);
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
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				getCustomProperties().clear();
				return;
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__NAME:
				setName(NAME_EDEFAULT);
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
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				return customProperties != null && !customProperties.isEmpty();
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmaltheaPackage.REFERABLE_BASE_OBJECT__UNIQUE_NAME:
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
				case AmaltheaPackage.REFERABLE_BASE_OBJECT__NAME: return AmaltheaPackage.IREFERABLE__NAME;
				case AmaltheaPackage.REFERABLE_BASE_OBJECT__UNIQUE_NAME: return AmaltheaPackage.IREFERABLE__UNIQUE_NAME;
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
				case AmaltheaPackage.IREFERABLE__NAME: return AmaltheaPackage.REFERABLE_BASE_OBJECT__NAME;
				case AmaltheaPackage.IREFERABLE__UNIQUE_NAME: return AmaltheaPackage.REFERABLE_BASE_OBJECT__UNIQUE_NAME;
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
				case AmaltheaPackage.IREFERABLE___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;
				case AmaltheaPackage.IREFERABLE___ENCODE__STRING: return AmaltheaPackage.REFERABLE_BASE_OBJECT___ENCODE__STRING;
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
			case AmaltheaPackage.REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME:
				return computeUniqueName();
			case AmaltheaPackage.REFERABLE_BASE_OBJECT___ENCODE__STRING:
				return encode((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ReferableBaseObjectImpl
