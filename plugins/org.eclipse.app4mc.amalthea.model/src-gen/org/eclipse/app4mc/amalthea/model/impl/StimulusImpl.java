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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeValueList;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.StimulusImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.StimulusImpl#getSetModeValueList <em>Set Mode Value List</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.StimulusImpl#getExecutionCondition <em>Execution Condition</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.StimulusImpl#getAffectedProcesses <em>Affected Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StimulusImpl extends ReferableBaseObjectImpl implements Stimulus {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getSetModeValueList() <em>Set Mode Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetModeValueList()
	 * @generated
	 * @ordered
	 */
	protected ModeValueList setModeValueList;

	/**
	 * The cached value of the '{@link #getExecutionCondition() <em>Execution Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionCondition()
	 * @generated
	 * @ordered
	 */
	protected ModeConditionDisjunction executionCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getStimulus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.STIMULUS__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeValueList getSetModeValueList() {
		return setModeValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetModeValueList(ModeValueList newSetModeValueList, NotificationChain msgs) {
		ModeValueList oldSetModeValueList = setModeValueList;
		setModeValueList = newSetModeValueList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST, oldSetModeValueList, newSetModeValueList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetModeValueList(ModeValueList newSetModeValueList) {
		if (newSetModeValueList != setModeValueList) {
			NotificationChain msgs = null;
			if (setModeValueList != null)
				msgs = ((InternalEObject)setModeValueList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST, null, msgs);
			if (newSetModeValueList != null)
				msgs = ((InternalEObject)newSetModeValueList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST, null, msgs);
			msgs = basicSetSetModeValueList(newSetModeValueList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST, newSetModeValueList, newSetModeValueList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeConditionDisjunction getExecutionCondition() {
		return executionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionCondition(ModeConditionDisjunction newExecutionCondition, NotificationChain msgs) {
		ModeConditionDisjunction oldExecutionCondition = executionCondition;
		executionCondition = newExecutionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.STIMULUS__EXECUTION_CONDITION, oldExecutionCondition, newExecutionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionCondition(ModeConditionDisjunction newExecutionCondition) {
		if (newExecutionCondition != executionCondition) {
			NotificationChain msgs = null;
			if (executionCondition != null)
				msgs = ((InternalEObject)executionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.STIMULUS__EXECUTION_CONDITION, null, msgs);
			if (newExecutionCondition != null)
				msgs = ((InternalEObject)newExecutionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.STIMULUS__EXECUTION_CONDITION, null, msgs);
			msgs = basicSetExecutionCondition(newExecutionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.STIMULUS__EXECUTION_CONDITION, newExecutionCondition, newExecutionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.app4mc.amalthea.model.Process> getAffectedProcesses() {
		EReference _process_Stimuli = AmaltheaPackage.eINSTANCE.getProcess_Stimuli();
		return AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Process>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getStimulus_AffectedProcesses(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_process_Stimuli)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST:
				return basicSetSetModeValueList(null, msgs);
			case AmaltheaPackage.STIMULUS__EXECUTION_CONDITION:
				return basicSetExecutionCondition(null, msgs);
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
			case AmaltheaPackage.STIMULUS__TAGS:
				return getTags();
			case AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST:
				return getSetModeValueList();
			case AmaltheaPackage.STIMULUS__EXECUTION_CONDITION:
				return getExecutionCondition();
			case AmaltheaPackage.STIMULUS__AFFECTED_PROCESSES:
				return getAffectedProcesses();
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
			case AmaltheaPackage.STIMULUS__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST:
				setSetModeValueList((ModeValueList)newValue);
				return;
			case AmaltheaPackage.STIMULUS__EXECUTION_CONDITION:
				setExecutionCondition((ModeConditionDisjunction)newValue);
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
			case AmaltheaPackage.STIMULUS__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST:
				setSetModeValueList((ModeValueList)null);
				return;
			case AmaltheaPackage.STIMULUS__EXECUTION_CONDITION:
				setExecutionCondition((ModeConditionDisjunction)null);
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
			case AmaltheaPackage.STIMULUS__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.STIMULUS__SET_MODE_VALUE_LIST:
				return setModeValueList != null;
			case AmaltheaPackage.STIMULUS__EXECUTION_CONDITION:
				return executionCondition != null;
			case AmaltheaPackage.STIMULUS__AFFECTED_PROCESSES:
				return !getAffectedProcesses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ITaggable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.STIMULUS__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ITaggable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.STIMULUS__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StimulusImpl
