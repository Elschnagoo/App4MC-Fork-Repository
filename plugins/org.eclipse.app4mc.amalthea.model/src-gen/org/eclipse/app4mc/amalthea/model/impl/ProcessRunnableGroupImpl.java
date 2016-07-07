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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup;
import org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry;
import org.eclipse.app4mc.amalthea.model.RunnableGroupingType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Runnable Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessRunnableGroupImpl#getGroupingType <em>Grouping Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessRunnableGroupImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRunnableGroupImpl extends BaseObjectImpl implements ProcessRunnableGroup {
	/**
	 * The default value of the '{@link #getGroupingType() <em>Grouping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingType()
	 * @generated
	 * @ordered
	 */
	protected static final RunnableGroupingType GROUPING_TYPE_EDEFAULT = RunnableGroupingType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getGroupingType() <em>Grouping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingType()
	 * @generated
	 * @ordered
	 */
	protected RunnableGroupingType groupingType = GROUPING_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessRunnableGroupEntry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRunnableGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProcessRunnableGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableGroupingType getGroupingType() {
		return groupingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingType(RunnableGroupingType newGroupingType) {
		RunnableGroupingType oldGroupingType = groupingType;
		groupingType = newGroupingType == null ? GROUPING_TYPE_EDEFAULT : newGroupingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_RUNNABLE_GROUP__GROUPING_TYPE, oldGroupingType, groupingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessRunnableGroupEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList.Resolving<ProcessRunnableGroupEntry>(ProcessRunnableGroupEntry.class, this, AmaltheaPackage.PROCESS_RUNNABLE_GROUP__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__GROUPING_TYPE:
				return getGroupingType();
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__ENTRIES:
				return getEntries();
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
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__GROUPING_TYPE:
				setGroupingType((RunnableGroupingType)newValue);
				return;
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends ProcessRunnableGroupEntry>)newValue);
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
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__GROUPING_TYPE:
				setGroupingType(GROUPING_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__ENTRIES:
				getEntries().clear();
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
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__GROUPING_TYPE:
				return groupingType != GROUPING_TYPE_EDEFAULT;
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (groupingType: ");
		result.append(groupingType);
		result.append(')');
		return result.toString();
	}

} //ProcessRunnableGroupImpl
