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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AllocationConstraint;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.MappingConstraint;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Constraints Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PropertyConstraintsModelImpl#getAllocationConstraints <em>Allocation Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PropertyConstraintsModelImpl#getMappingConstraints <em>Mapping Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyConstraintsModelImpl extends BaseObjectImpl implements PropertyConstraintsModel {
	/**
	 * The cached value of the '{@link #getAllocationConstraints() <em>Allocation Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationConstraint> allocationConstraints;

	/**
	 * The cached value of the '{@link #getMappingConstraints() <em>Mapping Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingConstraint> mappingConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyConstraintsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getPropertyConstraintsModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationConstraint> getAllocationConstraints() {
		if (allocationConstraints == null) {
			allocationConstraints = new EObjectContainmentEList<AllocationConstraint>(AllocationConstraint.class, this, AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS);
		}
		return allocationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingConstraint> getMappingConstraints() {
		if (mappingConstraints == null) {
			mappingConstraints = new EObjectContainmentEList<MappingConstraint>(MappingConstraint.class, this, AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS);
		}
		return mappingConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS:
				return ((InternalEList<?>)getAllocationConstraints()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS:
				return ((InternalEList<?>)getMappingConstraints()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS:
				return getAllocationConstraints();
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS:
				return getMappingConstraints();
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
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS:
				getAllocationConstraints().clear();
				getAllocationConstraints().addAll((Collection<? extends AllocationConstraint>)newValue);
				return;
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS:
				getMappingConstraints().clear();
				getMappingConstraints().addAll((Collection<? extends MappingConstraint>)newValue);
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
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS:
				getAllocationConstraints().clear();
				return;
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS:
				getMappingConstraints().clear();
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
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS:
				return allocationConstraints != null && !allocationConstraints.isEmpty();
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS:
				return mappingConstraints != null && !mappingConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyConstraintsModelImpl
