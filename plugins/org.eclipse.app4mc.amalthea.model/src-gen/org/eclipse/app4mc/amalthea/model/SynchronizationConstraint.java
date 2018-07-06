/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for synchronization constraints, which limit the distance between events
 * multipleOccurrencesAllowed: Defines whether multiple event occurrences are allowed for analysis
 * tolerance: Maximum allowed tolerance
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SynchronizationConstraint#isMultipleOccurrencesAllowed <em>Multiple Occurrences Allowed</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SynchronizationConstraint#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSynchronizationConstraint()
 * @model abstract="true"
 * @generated
 */
public interface SynchronizationConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Multiple Occurrences Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Occurrences Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Occurrences Allowed</em>' attribute.
	 * @see #setMultipleOccurrencesAllowed(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSynchronizationConstraint_MultipleOccurrencesAllowed()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isMultipleOccurrencesAllowed();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SynchronizationConstraint#isMultipleOccurrencesAllowed <em>Multiple Occurrences Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Occurrences Allowed</em>' attribute.
	 * @see #isMultipleOccurrencesAllowed()
	 * @generated
	 */
	void setMultipleOccurrencesAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' containment reference.
	 * @see #setTolerance(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSynchronizationConstraint_Tolerance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getTolerance();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SynchronizationConstraint#getTolerance <em>Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' containment reference.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(Time value);

} // SynchronizationConstraint
