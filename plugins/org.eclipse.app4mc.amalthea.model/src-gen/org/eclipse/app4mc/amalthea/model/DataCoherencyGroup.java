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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Coherency Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataCoherencyGroup()
 * @model
 * @generated
 */
public interface DataCoherencyGroup extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataCoherencyGroup_Labels()
	 * @model
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(DataGroupScope)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataCoherencyGroup_Scope()
	 * @model containment="true"
	 * @generated
	 */
	DataGroupScope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(DataGroupScope value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.CoherencyDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.CoherencyDirection
	 * @see #setDirection(CoherencyDirection)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataCoherencyGroup_Direction()
	 * @model unique="false"
	 * @generated
	 */
	CoherencyDirection getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.CoherencyDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(CoherencyDirection value);

} // DataCoherencyGroup
