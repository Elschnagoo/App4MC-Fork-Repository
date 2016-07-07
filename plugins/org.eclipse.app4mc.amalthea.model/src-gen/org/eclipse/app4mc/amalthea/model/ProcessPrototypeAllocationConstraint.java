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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Prototype Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ProcessPrototypeAllocationConstraints describe the constraints for
 * ProcessPrototype-to-Core allocations
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint#getProcessPrototype <em>Process Prototype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototypeAllocationConstraint()
 * @model
 * @generated
 */
public interface ProcessPrototypeAllocationConstraint extends AllocationConstraint {
	/**
	 * Returns the value of the '<em><b>Process Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Prototype</em>' reference.
	 * @see #setProcessPrototype(ProcessPrototype)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototypeAllocationConstraint_ProcessPrototype()
	 * @model
	 * @generated
	 */
	ProcessPrototype getProcessPrototype();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint#getProcessPrototype <em>Process Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Prototype</em>' reference.
	 * @see #getProcessPrototype()
	 * @generated
	 */
	void setProcessPrototype(ProcessPrototype value);

} // ProcessPrototypeAllocationConstraint
