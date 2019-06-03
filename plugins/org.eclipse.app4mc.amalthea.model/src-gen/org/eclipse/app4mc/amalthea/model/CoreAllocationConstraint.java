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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract Class, used to describe Constraints for Allocations
 * (these usually target Cores and their features/attributes)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CoreAllocationConstraint#getCoreClassification <em>Core Classification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCoreAllocationConstraint()
 * @model abstract="true"
 * @generated
 */
public interface CoreAllocationConstraint extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Core Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Classification</em>' containment reference.
	 * @see #setCoreClassification(CoreClassification)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCoreAllocationConstraint_CoreClassification()
	 * @model containment="true"
	 * @generated
	 */
	CoreClassification getCoreClassification();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CoreAllocationConstraint#getCoreClassification <em>Core Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Classification</em>' containment reference.
	 * @see #getCoreClassification()
	 * @generated
	 */
	void setCoreClassification(CoreClassification value);

} // CoreAllocationConstraint
