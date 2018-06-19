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
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
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
 * An implementation of the model object '<em><b>Mode Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ModeLiteralImpl#getContainingMode <em>Containing Mode</em>}</li>
 * </ul>
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
	public Mode getContainingMode() {
		if (eContainerFeatureID() != AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE) return null;
		return (Mode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetContainingMode() {
		if (eContainerFeatureID() != AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE) return null;
		return (Mode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingMode(Mode newContainingMode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingMode, AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingMode(Mode newContainingMode) {
		if (newContainingMode != eInternalContainer() || (eContainerFeatureID() != AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE && newContainingMode != null)) {
			if (EcoreUtil.isAncestor(this, newContainingMode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingMode != null)
				msgs = ((InternalEObject)newContainingMode).eInverseAdd(this, AmaltheaPackage.MODE__LITERALS, Mode.class, msgs);
			msgs = basicSetContainingMode(newContainingMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE, newContainingMode, newContainingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String computeUniqueName() {
		Mode _containingMode = this.getContainingMode();
		String _name = null;
		if (_containingMode!=null) {
			_name=_containingMode.getName();
		}
		return this.basicComputeUniqueNameWithPrefix(_name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		Mode _containingMode = this.getContainingMode();
		String _name = null;
		if (_containingMode!=null) {
			_name=_containingMode.getName();
		}
		final String modeName = _name;
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
		boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(this.getName());
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingMode((Mode)otherEnd, msgs);
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
			case AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE:
				return basicSetContainingMode(null, msgs);
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
			case AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE:
				return eInternalContainer().eInverseRemove(this, AmaltheaPackage.MODE__LITERALS, Mode.class, msgs);
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
			case AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE:
				if (resolve) return getContainingMode();
				return basicGetContainingMode();
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
			case AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE:
				setContainingMode((Mode)newValue);
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
			case AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE:
				setContainingMode((Mode)null);
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
			case AmaltheaPackage.MODE_LITERAL__CONTAINING_MODE:
				return basicGetContainingMode() != null;
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
