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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaCrossReferenceUtil;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.ModeValueDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeValueList;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.StimulusImpl#getEnablingModeValueList <em>Enabling Mode Value List</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.StimulusImpl#getDisablingModeValueList <em>Disabling Mode Value List</em>}</li>
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
	 * The cached value of the '{@link #getEnablingModeValueList() <em>Enabling Mode Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablingModeValueList()
	 * @generated
	 * @ordered
	 */
	protected ModeValueDisjunction enablingModeValueList;

	/**
	 * The cached value of the '{@link #getDisablingModeValueList() <em>Disabling Mode Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisablingModeValueList()
	 * @generated
	 * @ordered
	 */
	protected ModeValueDisjunction disablingModeValueList;

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
	public ModeValueDisjunction getEnablingModeValueList() {
		return enablingModeValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnablingModeValueList(ModeValueDisjunction newEnablingModeValueList, NotificationChain msgs) {
		ModeValueDisjunction oldEnablingModeValueList = enablingModeValueList;
		enablingModeValueList = newEnablingModeValueList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST, oldEnablingModeValueList, newEnablingModeValueList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnablingModeValueList(ModeValueDisjunction newEnablingModeValueList) {
		if (newEnablingModeValueList != enablingModeValueList) {
			NotificationChain msgs = null;
			if (enablingModeValueList != null)
				msgs = ((InternalEObject)enablingModeValueList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST, null, msgs);
			if (newEnablingModeValueList != null)
				msgs = ((InternalEObject)newEnablingModeValueList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST, null, msgs);
			msgs = basicSetEnablingModeValueList(newEnablingModeValueList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST, newEnablingModeValueList, newEnablingModeValueList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeValueDisjunction getDisablingModeValueList() {
		return disablingModeValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisablingModeValueList(ModeValueDisjunction newDisablingModeValueList, NotificationChain msgs) {
		ModeValueDisjunction oldDisablingModeValueList = disablingModeValueList;
		disablingModeValueList = newDisablingModeValueList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST, oldDisablingModeValueList, newDisablingModeValueList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisablingModeValueList(ModeValueDisjunction newDisablingModeValueList) {
		if (newDisablingModeValueList != disablingModeValueList) {
			NotificationChain msgs = null;
			if (disablingModeValueList != null)
				msgs = ((InternalEObject)disablingModeValueList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST, null, msgs);
			if (newDisablingModeValueList != null)
				msgs = ((InternalEObject)newDisablingModeValueList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST, null, msgs);
			msgs = basicSetDisablingModeValueList(newDisablingModeValueList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST, newDisablingModeValueList, newDisablingModeValueList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.app4mc.amalthea.model.Process> getAffectedProcesses() {
		return AmaltheaCrossReferenceUtil.<org.eclipse.app4mc.amalthea.model.Process>getInverseReferences(this, 
			AmaltheaPackage.eINSTANCE.getStimulus_AffectedProcesses(), AmaltheaPackage.eINSTANCE.getProcess_Stimuli());
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
			case AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST:
				return basicSetEnablingModeValueList(null, msgs);
			case AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST:
				return basicSetDisablingModeValueList(null, msgs);
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
			case AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST:
				return getEnablingModeValueList();
			case AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST:
				return getDisablingModeValueList();
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
			case AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST:
				setEnablingModeValueList((ModeValueDisjunction)newValue);
				return;
			case AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST:
				setDisablingModeValueList((ModeValueDisjunction)newValue);
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
			case AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST:
				setEnablingModeValueList((ModeValueDisjunction)null);
				return;
			case AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST:
				setDisablingModeValueList((ModeValueDisjunction)null);
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
			case AmaltheaPackage.STIMULUS__ENABLING_MODE_VALUE_LIST:
				return enablingModeValueList != null;
			case AmaltheaPackage.STIMULUS__DISABLING_MODE_VALUE_LIST:
				return disablingModeValueList != null;
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
