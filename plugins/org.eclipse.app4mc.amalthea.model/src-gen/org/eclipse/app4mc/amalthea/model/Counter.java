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
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A counter for the call sequence items
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Counter#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Counter#getPrescaler <em>Prescaler</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCounter()
 * @model
 * @generated
 */
public interface Counter extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCounter_Offset()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Counter#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(long value);

	/**
	 * Returns the value of the '<em><b>Prescaler</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescaler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescaler</em>' attribute.
	 * @see #setPrescaler(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCounter_Prescaler()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getPrescaler();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Counter#getPrescaler <em>Prescaler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescaler</em>' attribute.
	 * @see #getPrescaler()
	 * @generated
	 */
	void setPrescaler(long value);

} // Counter
