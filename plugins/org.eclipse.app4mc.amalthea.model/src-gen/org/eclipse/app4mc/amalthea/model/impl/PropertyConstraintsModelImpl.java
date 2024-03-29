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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CoreAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint;
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
	protected EList<CoreAllocationConstraint> allocationConstraints;

	/**
	 * The cached value of the '{@link #getMappingConstraints() <em>Mapping Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryMappingConstraint> mappingConstraints;

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
	@Override
	public EList<CoreAllocationConstraint> getAllocationConstraints() {
		if (allocationConstraints == null) {
			allocationConstraints = new EObjectContainmentEList<CoreAllocationConstraint>(CoreAllocationConstraint.class, this, AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS);
		}
		return allocationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MemoryMappingConstraint> getMappingConstraints() {
		if (mappingConstraints == null) {
			mappingConstraints = new EObjectContainmentEList<MemoryMappingConstraint>(MemoryMappingConstraint.class, this, AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS);
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
				getAllocationConstraints().addAll((Collection<? extends CoreAllocationConstraint>)newValue);
				return;
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS:
				getMappingConstraints().clear();
				getMappingConstraints().addAll((Collection<? extends MemoryMappingConstraint>)newValue);
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
