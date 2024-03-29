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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getEventChains <em>Event Chains</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getTimingConstraints <em>Timing Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getAffinityConstraints <em>Affinity Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getRunnableSequencingConstraints <em>Runnable Sequencing Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getDataAgeConstraints <em>Data Age Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getDataCoherencyGroups <em>Data Coherency Groups</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getDataStabilityGroups <em>Data Stability Groups</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getPhysicalSectionConstraints <em>Physical Section Constraints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel()
 * @model
 * @generated
 */
public interface ConstraintsModel extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Event Chains</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.EventChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Chains</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_EventChains()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventChain> getEventChains();

	/**
	 * Returns the value of the '<em><b>Timing Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.TimingConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Constraints</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_TimingConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingConstraint> getTimingConstraints();

	/**
	 * Returns the value of the '<em><b>Affinity Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.AffinityConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affinity Constraints</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_AffinityConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AffinityConstraint> getAffinityConstraints();

	/**
	 * Returns the value of the '<em><b>Runnable Sequencing Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable Sequencing Constraints</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_RunnableSequencingConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunnableSequencingConstraint> getRunnableSequencingConstraints();

	/**
	 * Returns the value of the '<em><b>Data Age Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Age Constraints</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_DataAgeConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAgeConstraint> getDataAgeConstraints();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Data Coherency Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Coherency Groups</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_DataCoherencyGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataCoherencyGroup> getDataCoherencyGroups();

	/**
	 * Returns the value of the '<em><b>Data Stability Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.DataStabilityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Stability Groups</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_DataStabilityGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStabilityGroup> getDataStabilityGroups();

	/**
	 * Returns the value of the '<em><b>Physical Section Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Section Constraints</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstraintsModel_PhysicalSectionConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalSectionConstraint> getPhysicalSectionConstraints();

} // ConstraintsModel
