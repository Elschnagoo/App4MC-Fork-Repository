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
 * A representation of the model object '<em><b>Instruction Fetch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getMisses <em>Misses</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getCyclesPerFetch <em>Cycles Per Fetch</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInstructionFetch()
 * @model
 * @generated
 */
public interface InstructionFetch extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(NumericStatistic)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInstructionFetch_Count()
	 * @model containment="true"
	 * @generated
	 */
	NumericStatistic getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(NumericStatistic value);

	/**
	 * Returns the value of the '<em><b>Misses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misses</em>' containment reference.
	 * @see #setMisses(NumericStatistic)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInstructionFetch_Misses()
	 * @model containment="true"
	 * @generated
	 */
	NumericStatistic getMisses();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getMisses <em>Misses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Misses</em>' containment reference.
	 * @see #getMisses()
	 * @generated
	 */
	void setMisses(NumericStatistic value);

	/**
	 * Returns the value of the '<em><b>Cycles Per Fetch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycles Per Fetch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycles Per Fetch</em>' containment reference.
	 * @see #setCyclesPerFetch(NumericStatistic)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInstructionFetch_CyclesPerFetch()
	 * @model containment="true"
	 * @generated
	 */
	NumericStatistic getCyclesPerFetch();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getCyclesPerFetch <em>Cycles Per Fetch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycles Per Fetch</em>' containment reference.
	 * @see #getCyclesPerFetch()
	 * @generated
	 */
	void setCyclesPerFetch(NumericStatistic value);

} // InstructionFetch
