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

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeCondition#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeCondition()
 * @model
 * @generated
 */
public interface ModeCondition extends ModeValue, ModeConditionDisjunctionEntry {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RelationalOperator
	 * @see #setRelation(RelationalOperator)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeCondition_Relation()
	 * @model unique="false"
	 * @generated
	 */
	RelationalOperator getRelation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeCondition#getRelation <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RelationalOperator
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(RelationalOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" contextMapType="org.eclipse.app4mc.amalthea.model.ModeValueMapEntry&lt;org.eclipse.app4mc.amalthea.model.ModeLabel, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	boolean isSatisfiedBy(EMap<ModeLabel, String> context);

} // ModeCondition
