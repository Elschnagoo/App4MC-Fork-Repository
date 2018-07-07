/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *     Generated using Eclipse EMF
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import java.util.Collection;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracing Overhead Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadContainerTypeImpl#getTracingOverhead <em>Tracing Overhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracingOverheadContainerTypeImpl extends OT1TypeImpl implements TracingOverheadContainerType {
	/**
	 * The cached value of the '{@link #getTracingOverhead() <em>Tracing Overhead</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracingOverhead()
	 * @generated
	 * @ordered
	 */
	protected EList<TracingOverheadType> tracingOverhead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracingOverheadContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TRACING_OVERHEAD_CONTAINER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracingOverheadType> getTracingOverhead() {
		if (tracingOverhead == null) {
			tracingOverhead = new EObjectContainmentEList<TracingOverheadType>(TracingOverheadType.class, this, OT1Package.TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD);
		}
		return tracingOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD:
				return ((InternalEList<?>)getTracingOverhead()).basicRemove(otherEnd, msgs);
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
			case OT1Package.TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD:
				return getTracingOverhead();
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
			case OT1Package.TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD:
				getTracingOverhead().clear();
				getTracingOverhead().addAll((Collection<? extends TracingOverheadType>)newValue);
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
			case OT1Package.TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD:
				getTracingOverhead().clear();
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
			case OT1Package.TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD:
				return tracingOverhead != null && !tracingOverhead.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracingOverheadContainerTypeImpl
