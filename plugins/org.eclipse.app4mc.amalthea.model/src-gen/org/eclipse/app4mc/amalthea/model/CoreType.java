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
 * A representation of the model object '<em><b>Core Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CoreType#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CoreType#getInstructionsPerCycle <em>Instructions Per Cycle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCoreType()
 * @model
 * @generated
 */
public interface CoreType extends AbstractionType {
	/**
	 * Returns the value of the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Width</em>' attribute.
	 * @see #setBitWidth(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCoreType_BitWidth()
	 * @model unique="false"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CoreType#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

	/**
	 * Returns the value of the '<em><b>Instructions Per Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions Per Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions Per Cycle</em>' attribute.
	 * @see #setInstructionsPerCycle(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCoreType_InstructionsPerCycle()
	 * @model unique="false"
	 * @generated
	 */
	int getInstructionsPerCycle();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CoreType#getInstructionsPerCycle <em>Instructions Per Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions Per Cycle</em>' attribute.
	 * @see #getInstructionsPerCycle()
	 * @generated
	 */
	void setInstructionsPerCycle(int value);

} // CoreType
