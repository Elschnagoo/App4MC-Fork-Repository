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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableOrderType;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable Sequencing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableSequencingConstraintImpl#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableSequencingConstraintImpl#getRunnableGroups <em>Runnable Groups</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableSequencingConstraintImpl#getProcessScope <em>Process Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableSequencingConstraintImpl extends ReferableBaseObjectImpl implements RunnableSequencingConstraint {
	/**
	 * The default value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected static final RunnableOrderType ORDER_TYPE_EDEFAULT = RunnableOrderType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected RunnableOrderType orderType = ORDER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRunnableGroups() <em>Runnable Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableEntityGroup> runnableGroups;

	/**
	 * The cached value of the '{@link #getProcessScope() <em>Process Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessScope()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractProcess> processScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableSequencingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnableSequencingConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableOrderType getOrderType() {
		return orderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderType(RunnableOrderType newOrderType) {
		RunnableOrderType oldOrderType = orderType;
		orderType = newOrderType == null ? ORDER_TYPE_EDEFAULT : newOrderType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__ORDER_TYPE, oldOrderType, orderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableEntityGroup> getRunnableGroups() {
		if (runnableGroups == null) {
			runnableGroups = new EObjectContainmentEList<RunnableEntityGroup>(RunnableEntityGroup.class, this, AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__RUNNABLE_GROUPS);
		}
		return runnableGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractProcess> getProcessScope() {
		if (processScope == null) {
			processScope = new EObjectResolvingEList<AbstractProcess>(AbstractProcess.class, this, AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__PROCESS_SCOPE);
		}
		return processScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__RUNNABLE_GROUPS:
				return ((InternalEList<?>)getRunnableGroups()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__ORDER_TYPE:
				return getOrderType();
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__RUNNABLE_GROUPS:
				return getRunnableGroups();
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__PROCESS_SCOPE:
				return getProcessScope();
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
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__ORDER_TYPE:
				setOrderType((RunnableOrderType)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__RUNNABLE_GROUPS:
				getRunnableGroups().clear();
				getRunnableGroups().addAll((Collection<? extends RunnableEntityGroup>)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__PROCESS_SCOPE:
				getProcessScope().clear();
				getProcessScope().addAll((Collection<? extends AbstractProcess>)newValue);
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
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__ORDER_TYPE:
				setOrderType(ORDER_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__RUNNABLE_GROUPS:
				getRunnableGroups().clear();
				return;
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__PROCESS_SCOPE:
				getProcessScope().clear();
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
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__ORDER_TYPE:
				return orderType != ORDER_TYPE_EDEFAULT;
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__RUNNABLE_GROUPS:
				return runnableGroups != null && !runnableGroups.isEmpty();
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT__PROCESS_SCOPE:
				return processScope != null && !processScope.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (orderType: ");
		result.append(orderType);
		result.append(')');
		return result.toString();
	}

} //RunnableSequencingConstraintImpl
