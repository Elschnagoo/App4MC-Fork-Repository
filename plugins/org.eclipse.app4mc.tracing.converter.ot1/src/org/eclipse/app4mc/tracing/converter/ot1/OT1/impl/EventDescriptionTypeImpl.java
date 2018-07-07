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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventDescriptionTypeImpl#getEventIdMapping <em>Event Id Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventDescriptionTypeImpl extends OT1TypeImpl implements EventDescriptionType {
	/**
	 * The cached value of the '{@link #getEventIdMapping() <em>Event Id Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventIdMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<EventIdMappingType> eventIdMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.EVENT_DESCRIPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventIdMappingType> getEventIdMapping() {
		if (eventIdMapping == null) {
			eventIdMapping = new EObjectContainmentEList<EventIdMappingType>(EventIdMappingType.class, this, OT1Package.EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING);
		}
		return eventIdMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING:
				return ((InternalEList<?>)getEventIdMapping()).basicRemove(otherEnd, msgs);
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
			case OT1Package.EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING:
				return getEventIdMapping();
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
			case OT1Package.EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING:
				getEventIdMapping().clear();
				getEventIdMapping().addAll((Collection<? extends EventIdMappingType>)newValue);
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
			case OT1Package.EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING:
				getEventIdMapping().clear();
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
			case OT1Package.EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING:
				return eventIdMapping != null && !eventIdMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventDescriptionTypeImpl
