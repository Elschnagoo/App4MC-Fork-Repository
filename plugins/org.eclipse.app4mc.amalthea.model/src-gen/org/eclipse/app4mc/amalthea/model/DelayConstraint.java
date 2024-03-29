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
 * A representation of the model object '<em><b>Delay Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This constraint describes how a source and a target event are placed relative to each other
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getMappingType <em>Mapping Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getLower <em>Lower</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDelayConstraint()
 * @model
 * @generated
 */
public interface DelayConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Mapping Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.MappingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.MappingType
	 * @see #setMappingType(MappingType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDelayConstraint_MappingType()
	 * @model unique="false"
	 * @generated
	 */
	MappingType getMappingType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getMappingType <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.MappingType
	 * @see #getMappingType()
	 * @generated
	 */
	void setMappingType(MappingType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EntityEvent)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDelayConstraint_Source()
	 * @model required="true"
	 * @generated
	 */
	EntityEvent getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EntityEvent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EntityEvent)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDelayConstraint_Target()
	 * @model required="true"
	 * @generated
	 */
	EntityEvent getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EntityEvent value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' containment reference.
	 * @see #setUpper(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDelayConstraint_Upper()
	 * @model containment="true"
	 * @generated
	 */
	Time getUpper();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getUpper <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' containment reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Time value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' containment reference.
	 * @see #setLower(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDelayConstraint_Lower()
	 * @model containment="true"
	 * @generated
	 */
	Time getLower();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getLower <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' containment reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Time value);

} // DelayConstraint
