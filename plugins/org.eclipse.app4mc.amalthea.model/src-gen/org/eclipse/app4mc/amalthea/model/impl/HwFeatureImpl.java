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
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwFeatureImpl#getContainingCategory <em>Containing Category</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwFeatureImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwFeatureImpl extends ReferableBaseObjectImpl implements HwFeature {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwFeatureCategory getContainingCategory() {
		if (eContainerFeatureID() != AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY) return null;
		return (HwFeatureCategory)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwFeatureCategory basicGetContainingCategory() {
		if (eContainerFeatureID() != AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY) return null;
		return (HwFeatureCategory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingCategory(HwFeatureCategory newContainingCategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingCategory, AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingCategory(HwFeatureCategory newContainingCategory) {
		if (newContainingCategory != eInternalContainer() || (eContainerFeatureID() != AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY && newContainingCategory != null)) {
			if (EcoreUtil.isAncestor(this, newContainingCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingCategory != null)
				msgs = ((InternalEObject)newContainingCategory).eInverseAdd(this, AmaltheaPackage.HW_FEATURE_CATEGORY__FEATURES, HwFeatureCategory.class, msgs);
			msgs = basicSetContainingCategory(newContainingCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY, newContainingCategory, newContainingCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_FEATURE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String computeUniqueName() {
		HwFeatureCategory _containingCategory = this.getContainingCategory();
		String _name = null;
		if (_containingCategory!=null) {
			_name=_containingCategory.getName();
		}
		return this.basicComputeUniqueNameWithPrefix(_name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		HwFeatureCategory _containingCategory = this.getContainingCategory();
		String _name = null;
		if (_containingCategory!=null) {
			_name=_containingCategory.getName();
		}
		final String featureName = _name;
		String _xifexpression = null;
		boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(featureName);
		if (_isNullOrEmpty) {
			_xifexpression = "<category>";
		}
		else {
			_xifexpression = featureName;
		}
		String _plus = (_xifexpression + "::");
		String _xifexpression_1 = null;
		boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(this.getName());
		if (_isNullOrEmpty_1) {
			_xifexpression_1 = "<feature>";
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingCategory((HwFeatureCategory)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY:
				return basicSetContainingCategory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY:
				return eInternalContainer().eInverseRemove(this, AmaltheaPackage.HW_FEATURE_CATEGORY__FEATURES, HwFeatureCategory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY:
				if (resolve) return getContainingCategory();
				return basicGetContainingCategory();
			case AmaltheaPackage.HW_FEATURE__VALUE:
				return getValue();
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
			case AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY:
				setContainingCategory((HwFeatureCategory)newValue);
				return;
			case AmaltheaPackage.HW_FEATURE__VALUE:
				setValue((Double)newValue);
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
			case AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY:
				setContainingCategory((HwFeatureCategory)null);
				return;
			case AmaltheaPackage.HW_FEATURE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case AmaltheaPackage.HW_FEATURE__CONTAINING_CATEGORY:
				return basicGetContainingCategory() != null;
			case AmaltheaPackage.HW_FEATURE__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
				case AmaltheaPackage.IREFERABLE___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.HW_FEATURE___COMPUTE_UNIQUE_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ReferableBaseObject.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.HW_FEATURE___COMPUTE_UNIQUE_NAME;
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
			case AmaltheaPackage.HW_FEATURE___COMPUTE_UNIQUE_NAME:
				return computeUniqueName();
			case AmaltheaPackage.HW_FEATURE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //HwFeatureImpl
