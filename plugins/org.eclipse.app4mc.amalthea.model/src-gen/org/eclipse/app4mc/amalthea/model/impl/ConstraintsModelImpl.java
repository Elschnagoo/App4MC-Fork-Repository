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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AffinityConstraint;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint;
import org.eclipse.app4mc.amalthea.model.DataCoherencyGroup;
import org.eclipse.app4mc.amalthea.model.DataStabilityGroup;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint;
import org.eclipse.app4mc.amalthea.model.Requirement;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.TimingConstraint;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getEventChains <em>Event Chains</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getTimingConstraints <em>Timing Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getAffinityConstraints <em>Affinity Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getRunnableSequencingConstraints <em>Runnable Sequencing Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getDataAgeConstraints <em>Data Age Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getDataCoherencyGroups <em>Data Coherency Groups</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getDataStabilityGroups <em>Data Stability Groups</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl#getPhysicalSectionConstraints <em>Physical Section Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintsModelImpl extends BaseObjectImpl implements ConstraintsModel {
	/**
	 * The cached value of the '{@link #getEventChains() <em>Event Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChains()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> eventChains;

	/**
	 * The cached value of the '{@link #getTimingConstraints() <em>Timing Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingConstraint> timingConstraints;

	/**
	 * The cached value of the '{@link #getAffinityConstraints() <em>Affinity Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AffinityConstraint> affinityConstraints;

	/**
	 * The cached value of the '{@link #getRunnableSequencingConstraints() <em>Runnable Sequencing Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableSequencingConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableSequencingConstraint> runnableSequencingConstraints;

	/**
	 * The cached value of the '{@link #getDataAgeConstraints() <em>Data Age Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAgeConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAgeConstraint> dataAgeConstraints;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getDataCoherencyGroups() <em>Data Coherency Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCoherencyGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<DataCoherencyGroup> dataCoherencyGroups;

	/**
	 * The cached value of the '{@link #getDataStabilityGroups() <em>Data Stability Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStabilityGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStabilityGroup> dataStabilityGroups;

	/**
	 * The cached value of the '{@link #getPhysicalSectionConstraints() <em>Physical Section Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSectionConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalSectionConstraint> physicalSectionConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getConstraintsModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChain> getEventChains() {
		if (eventChains == null) {
			eventChains = new EObjectContainmentEList<EventChain>(EventChain.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__EVENT_CHAINS);
		}
		return eventChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingConstraint> getTimingConstraints() {
		if (timingConstraints == null) {
			timingConstraints = new EObjectContainmentEList<TimingConstraint>(TimingConstraint.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__TIMING_CONSTRAINTS);
		}
		return timingConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AffinityConstraint> getAffinityConstraints() {
		if (affinityConstraints == null) {
			affinityConstraints = new EObjectContainmentEList<AffinityConstraint>(AffinityConstraint.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS);
		}
		return affinityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableSequencingConstraint> getRunnableSequencingConstraints() {
		if (runnableSequencingConstraints == null) {
			runnableSequencingConstraints = new EObjectContainmentEList<RunnableSequencingConstraint>(RunnableSequencingConstraint.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS);
		}
		return runnableSequencingConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAgeConstraint> getDataAgeConstraints() {
		if (dataAgeConstraints == null) {
			dataAgeConstraints = new EObjectContainmentEList<DataAgeConstraint>(DataAgeConstraint.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS);
		}
		return dataAgeConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataCoherencyGroup> getDataCoherencyGroups() {
		if (dataCoherencyGroups == null) {
			dataCoherencyGroups = new EObjectContainmentEList<DataCoherencyGroup>(DataCoherencyGroup.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS);
		}
		return dataCoherencyGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStabilityGroup> getDataStabilityGroups() {
		if (dataStabilityGroups == null) {
			dataStabilityGroups = new EObjectContainmentEList<DataStabilityGroup>(DataStabilityGroup.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__DATA_STABILITY_GROUPS);
		}
		return dataStabilityGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalSectionConstraint> getPhysicalSectionConstraints() {
		if (physicalSectionConstraints == null) {
			physicalSectionConstraints = new EObjectContainmentEList<PhysicalSectionConstraint>(PhysicalSectionConstraint.class, this, AmaltheaPackage.CONSTRAINTS_MODEL__PHYSICAL_SECTION_CONSTRAINTS);
		}
		return physicalSectionConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CONSTRAINTS_MODEL__EVENT_CHAINS:
				return ((InternalEList<?>)getEventChains()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.CONSTRAINTS_MODEL__TIMING_CONSTRAINTS:
				return ((InternalEList<?>)getTimingConstraints()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS:
				return ((InternalEList<?>)getAffinityConstraints()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS:
				return ((InternalEList<?>)getRunnableSequencingConstraints()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS:
				return ((InternalEList<?>)getDataAgeConstraints()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.CONSTRAINTS_MODEL__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS:
				return ((InternalEList<?>)getDataCoherencyGroups()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_STABILITY_GROUPS:
				return ((InternalEList<?>)getDataStabilityGroups()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.CONSTRAINTS_MODEL__PHYSICAL_SECTION_CONSTRAINTS:
				return ((InternalEList<?>)getPhysicalSectionConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.CONSTRAINTS_MODEL__EVENT_CHAINS:
				return getEventChains();
			case AmaltheaPackage.CONSTRAINTS_MODEL__TIMING_CONSTRAINTS:
				return getTimingConstraints();
			case AmaltheaPackage.CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS:
				return getAffinityConstraints();
			case AmaltheaPackage.CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS:
				return getRunnableSequencingConstraints();
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS:
				return getDataAgeConstraints();
			case AmaltheaPackage.CONSTRAINTS_MODEL__REQUIREMENTS:
				return getRequirements();
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS:
				return getDataCoherencyGroups();
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_STABILITY_GROUPS:
				return getDataStabilityGroups();
			case AmaltheaPackage.CONSTRAINTS_MODEL__PHYSICAL_SECTION_CONSTRAINTS:
				return getPhysicalSectionConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.CONSTRAINTS_MODEL__EVENT_CHAINS:
				getEventChains().clear();
				getEventChains().addAll((Collection<? extends EventChain>)newValue);
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__TIMING_CONSTRAINTS:
				getTimingConstraints().clear();
				getTimingConstraints().addAll((Collection<? extends TimingConstraint>)newValue);
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS:
				getAffinityConstraints().clear();
				getAffinityConstraints().addAll((Collection<? extends AffinityConstraint>)newValue);
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS:
				getRunnableSequencingConstraints().clear();
				getRunnableSequencingConstraints().addAll((Collection<? extends RunnableSequencingConstraint>)newValue);
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS:
				getDataAgeConstraints().clear();
				getDataAgeConstraints().addAll((Collection<? extends DataAgeConstraint>)newValue);
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS:
				getDataCoherencyGroups().clear();
				getDataCoherencyGroups().addAll((Collection<? extends DataCoherencyGroup>)newValue);
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_STABILITY_GROUPS:
				getDataStabilityGroups().clear();
				getDataStabilityGroups().addAll((Collection<? extends DataStabilityGroup>)newValue);
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__PHYSICAL_SECTION_CONSTRAINTS:
				getPhysicalSectionConstraints().clear();
				getPhysicalSectionConstraints().addAll((Collection<? extends PhysicalSectionConstraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.CONSTRAINTS_MODEL__EVENT_CHAINS:
				getEventChains().clear();
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__TIMING_CONSTRAINTS:
				getTimingConstraints().clear();
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS:
				getAffinityConstraints().clear();
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS:
				getRunnableSequencingConstraints().clear();
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS:
				getDataAgeConstraints().clear();
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__REQUIREMENTS:
				getRequirements().clear();
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS:
				getDataCoherencyGroups().clear();
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_STABILITY_GROUPS:
				getDataStabilityGroups().clear();
				return;
			case AmaltheaPackage.CONSTRAINTS_MODEL__PHYSICAL_SECTION_CONSTRAINTS:
				getPhysicalSectionConstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.CONSTRAINTS_MODEL__EVENT_CHAINS:
				return eventChains != null && !eventChains.isEmpty();
			case AmaltheaPackage.CONSTRAINTS_MODEL__TIMING_CONSTRAINTS:
				return timingConstraints != null && !timingConstraints.isEmpty();
			case AmaltheaPackage.CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS:
				return affinityConstraints != null && !affinityConstraints.isEmpty();
			case AmaltheaPackage.CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS:
				return runnableSequencingConstraints != null && !runnableSequencingConstraints.isEmpty();
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS:
				return dataAgeConstraints != null && !dataAgeConstraints.isEmpty();
			case AmaltheaPackage.CONSTRAINTS_MODEL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS:
				return dataCoherencyGroups != null && !dataCoherencyGroups.isEmpty();
			case AmaltheaPackage.CONSTRAINTS_MODEL__DATA_STABILITY_GROUPS:
				return dataStabilityGroups != null && !dataStabilityGroups.isEmpty();
			case AmaltheaPackage.CONSTRAINTS_MODEL__PHYSICAL_SECTION_CONSTRAINTS:
				return physicalSectionConstraints != null && !physicalSectionConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintsModelImpl
