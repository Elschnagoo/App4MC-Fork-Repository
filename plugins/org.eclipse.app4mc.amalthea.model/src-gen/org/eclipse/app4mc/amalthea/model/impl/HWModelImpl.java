/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwDomain;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwStructure;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getFeatureCategories <em>Feature Categories</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl#getDomains <em>Domains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HWModelImpl extends BaseObjectImpl implements HWModel {
	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<HwDefinition> definitions;

	/**
	 * The cached value of the '{@link #getFeatureCategories() <em>Feature Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<HwFeatureCategory> featureCategories;

	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<HwStructure> structures;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<HwDomain> domains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHWModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<HwDefinition>(HwDefinition.class, this, AmaltheaPackage.HW_MODEL__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwFeatureCategory> getFeatureCategories() {
		if (featureCategories == null) {
			featureCategories = new EObjectContainmentEList<HwFeatureCategory>(HwFeatureCategory.class, this, AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES);
		}
		return featureCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwStructure> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentEList<HwStructure>(HwStructure.class, this, AmaltheaPackage.HW_MODEL__STRUCTURES);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwDomain> getDomains() {
		if (domains == null) {
			domains = new EObjectContainmentEList<HwDomain>(HwDomain.class, this, AmaltheaPackage.HW_MODEL__DOMAINS);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_MODEL__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES:
				return ((InternalEList<?>)getFeatureCategories()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__STRUCTURES:
				return ((InternalEList<?>)getStructures()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.HW_MODEL__DOMAINS:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.HW_MODEL__DEFINITIONS:
				return getDefinitions();
			case AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES:
				return getFeatureCategories();
			case AmaltheaPackage.HW_MODEL__STRUCTURES:
				return getStructures();
			case AmaltheaPackage.HW_MODEL__DOMAINS:
				return getDomains();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.HW_MODEL__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends HwDefinition>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES:
				getFeatureCategories().clear();
				getFeatureCategories().addAll((Collection<? extends HwFeatureCategory>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends HwStructure>)newValue);
				return;
			case AmaltheaPackage.HW_MODEL__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends HwDomain>)newValue);
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
			case AmaltheaPackage.HW_MODEL__DEFINITIONS:
				getDefinitions().clear();
				return;
			case AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES:
				getFeatureCategories().clear();
				return;
			case AmaltheaPackage.HW_MODEL__STRUCTURES:
				getStructures().clear();
				return;
			case AmaltheaPackage.HW_MODEL__DOMAINS:
				getDomains().clear();
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
			case AmaltheaPackage.HW_MODEL__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES:
				return featureCategories != null && !featureCategories.isEmpty();
			case AmaltheaPackage.HW_MODEL__STRUCTURES:
				return structures != null && !structures.isEmpty();
			case AmaltheaPackage.HW_MODEL__DOMAINS:
				return domains != null && !domains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWModelImpl
