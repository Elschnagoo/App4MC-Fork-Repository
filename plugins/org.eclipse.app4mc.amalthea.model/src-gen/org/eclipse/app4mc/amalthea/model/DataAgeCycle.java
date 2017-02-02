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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Age Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataAgeCycle#getMinimumCycle <em>Minimum Cycle</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataAgeCycle#getMaximumCycle <em>Maximum Cycle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeCycle()
 * @model
 * @generated
 */
public interface DataAgeCycle extends DataAge {
	/**
	 * Returns the value of the '<em><b>Minimum Cycle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Cycle</em>' attribute.
	 * @see #setMinimumCycle(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeCycle_MinimumCycle()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinimumCycle();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataAgeCycle#getMinimumCycle <em>Minimum Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Cycle</em>' attribute.
	 * @see #getMinimumCycle()
	 * @generated
	 */
	void setMinimumCycle(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Cycle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Cycle</em>' attribute.
	 * @see #setMaximumCycle(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeCycle_MaximumCycle()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMaximumCycle();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataAgeCycle#getMaximumCycle <em>Maximum Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Cycle</em>' attribute.
	 * @see #getMaximumCycle()
	 * @generated
	 */
	void setMaximumCycle(int value);

} // DataAgeCycle
