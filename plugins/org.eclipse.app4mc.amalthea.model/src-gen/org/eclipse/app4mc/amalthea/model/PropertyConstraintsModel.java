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
package org.eclipse.app4mc.amalthea.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraints Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * ===============================================================================
 * ===============================================================================
 * 
 * 								Property Constraints Model
 * 
 * ===============================================================================
 * ===============================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getAllocationConstraints <em>Allocation Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getMappingConstraints <em>Mapping Constraints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPropertyConstraintsModel()
 * @model
 * @generated
 */
public interface PropertyConstraintsModel extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Allocation Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.AllocationConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Constraints</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPropertyConstraintsModel_AllocationConstraints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AllocationConstraint> getAllocationConstraints();

	/**
	 * Returns the value of the '<em><b>Mapping Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.MappingConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Constraints</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPropertyConstraintsModel_MappingConstraints()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<MappingConstraint> getMappingConstraints();

} // PropertyConstraintsModel
