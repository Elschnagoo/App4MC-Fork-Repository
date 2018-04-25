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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Need;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ExecutionNeedImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ExecutionNeedImpl#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionNeedImpl extends ComputationItemImpl implements ExecutionNeed {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Need> default_;

	/**
	 * The cached value of the '{@link #getExtended() <em>Extended</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtended()
	 * @generated
	 * @ordered
	 */
	protected EMap<ProcessingUnitDefinition, EMap<String, Need>> extended;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionNeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getExecutionNeed();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Need> getDefault() {
		if (default_ == null) {
			default_ = new EcoreEMap<String,Need>(AmaltheaPackage.eINSTANCE.getNeedEntry(), NeedEntryImpl.class, this, AmaltheaPackage.EXECUTION_NEED__DEFAULT);
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<ProcessingUnitDefinition, EMap<String, Need>> getExtended() {
		if (extended == null) {
			extended = new EcoreEMap<ProcessingUnitDefinition,EMap<String, Need>>(AmaltheaPackage.eINSTANCE.getExecutionNeedExtended(), ExecutionNeedExtendedImpl.class, this, AmaltheaPackage.EXECUTION_NEED__EXTENDED);
		}
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.EXECUTION_NEED__DEFAULT:
				return ((InternalEList<?>)getDefault()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.EXECUTION_NEED__EXTENDED:
				return ((InternalEList<?>)getExtended()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.EXECUTION_NEED__DEFAULT:
				if (coreType) return getDefault();
				else return getDefault().map();
			case AmaltheaPackage.EXECUTION_NEED__EXTENDED:
				if (coreType) return getExtended();
				else return getExtended().map();
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
			case AmaltheaPackage.EXECUTION_NEED__DEFAULT:
				((EStructuralFeature.Setting)getDefault()).set(newValue);
				return;
			case AmaltheaPackage.EXECUTION_NEED__EXTENDED:
				((EStructuralFeature.Setting)getExtended()).set(newValue);
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
			case AmaltheaPackage.EXECUTION_NEED__DEFAULT:
				getDefault().clear();
				return;
			case AmaltheaPackage.EXECUTION_NEED__EXTENDED:
				getExtended().clear();
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
			case AmaltheaPackage.EXECUTION_NEED__DEFAULT:
				return default_ != null && !default_.isEmpty();
			case AmaltheaPackage.EXECUTION_NEED__EXTENDED:
				return extended != null && !extended.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutionNeedImpl
