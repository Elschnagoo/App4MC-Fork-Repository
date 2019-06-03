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
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generalization for all Hardware related constraints
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Classification#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Classification#getGrouping <em>Grouping</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClassification()
 * @model abstract="true"
 * @generated
 */
public interface Classification extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.Condition
	 * @see #setCondition(Condition)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClassification_Condition()
	 * @model unique="false"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Classification#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.Condition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.GroupingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.GroupingType
	 * @see #setGrouping(GroupingType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClassification_Grouping()
	 * @model unique="false"
	 * @generated
	 */
	GroupingType getGrouping();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Classification#getGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.GroupingType
	 * @see #getGrouping()
	 * @generated
	 */
	void setGrouping(GroupingType value);

} // Classification
