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
 * A representation of the model object '<em><b>Event Chain Latency Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A latency constraint describes the allowed range in latency between a stimulus and its response.
 * scope: Considered event chain that defines the stimulus and response relation
 * type: Defines the point of view (forward or backward)
 * minimum: Minimum allowed latency
 * maximum: Maximum allowed latency
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainLatencyConstraint()
 * @model
 * @generated
 */
public interface EventChainLatencyConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(EventChain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainLatencyConstraint_Scope()
	 * @model required="true"
	 * @generated
	 */
	EventChain getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EventChain value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.LatencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyType
	 * @see #setType(LatencyType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainLatencyConstraint_Type()
	 * @model unique="false"
	 * @generated
	 */
	LatencyType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyType
	 * @see #getType()
	 * @generated
	 */
	void setType(LatencyType value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' containment reference.
	 * @see #setMinimum(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainLatencyConstraint_Minimum()
	 * @model containment="true"
	 * @generated
	 */
	Time getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint#getMinimum <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' containment reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Time value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' containment reference.
	 * @see #setMaximum(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainLatencyConstraint_Maximum()
	 * @model containment="true"
	 * @generated
	 */
	Time getMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint#getMaximum <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' containment reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Time value);

} // EventChainLatencyConstraint
