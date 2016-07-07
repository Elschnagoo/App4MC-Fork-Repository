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
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeValueProvider;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeLabelImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeLabelImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeLabelImpl extends AbstractElementMemoryInformationImpl implements ModeLabel {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Mode mode;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected ModeLiteral initialValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getModeLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (Mode)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MODE_LABEL__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		Mode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_LABEL__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLiteral getInitialValue() {
		if (initialValue != null && initialValue.eIsProxy()) {
			InternalEObject oldInitialValue = (InternalEObject)initialValue;
			initialValue = (ModeLiteral)eResolveProxy(oldInitialValue);
			if (initialValue != oldInitialValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MODE_LABEL__INITIAL_VALUE, oldInitialValue, initialValue));
			}
		}
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLiteral basicGetInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(ModeLiteral newInitialValue) {
		ModeLiteral oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_LABEL__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.MODE_LABEL__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case AmaltheaPackage.MODE_LABEL__INITIAL_VALUE:
				if (resolve) return getInitialValue();
				return basicGetInitialValue();
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
			case AmaltheaPackage.MODE_LABEL__MODE:
				setMode((Mode)newValue);
				return;
			case AmaltheaPackage.MODE_LABEL__INITIAL_VALUE:
				setInitialValue((ModeLiteral)newValue);
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
			case AmaltheaPackage.MODE_LABEL__MODE:
				setMode((Mode)null);
				return;
			case AmaltheaPackage.MODE_LABEL__INITIAL_VALUE:
				setInitialValue((ModeLiteral)null);
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
			case AmaltheaPackage.MODE_LABEL__MODE:
				return mode != null;
			case AmaltheaPackage.MODE_LABEL__INITIAL_VALUE:
				return initialValue != null;
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
		if (baseClass == ModeValueProvider.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.MODE_LABEL__MODE: return AmaltheaPackage.MODE_VALUE_PROVIDER__MODE;
				case AmaltheaPackage.MODE_LABEL__INITIAL_VALUE: return AmaltheaPackage.MODE_VALUE_PROVIDER__INITIAL_VALUE;
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
		if (baseClass == ModeValueProvider.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.MODE_VALUE_PROVIDER__MODE: return AmaltheaPackage.MODE_LABEL__MODE;
				case AmaltheaPackage.MODE_VALUE_PROVIDER__INITIAL_VALUE: return AmaltheaPackage.MODE_LABEL__INITIAL_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModeLabelImpl
