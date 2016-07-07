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
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Bus#getBusType <em>Bus Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends NetworkType {
	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.BusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.BusType
	 * @see #setBusType(BusType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBus_BusType()
	 * @model unique="false"
	 * @generated
	 */
	BusType getBusType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Bus#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.BusType
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(BusType value);

} // Bus
