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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.ProcessChain;
import org.eclipse.app4mc.amalthea.model.ProcessChainEvent;
import org.eclipse.app4mc.amalthea.model.ProcessEventType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Chain Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessChainEventImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessChainEventImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessChainEventImpl#getCore <em>Core</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessChainEventImpl extends EntityEventImpl implements ProcessChainEvent {
	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessEventType EVENT_TYPE_EDEFAULT = ProcessEventType._ALL_;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected ProcessEventType eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected ProcessChain entity;

	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected Core core;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessChainEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProcessChainEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessEventType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(ProcessEventType newEventType) {
		ProcessEventType oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_CHAIN_EVENT__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessChain getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (ProcessChain)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESS_CHAIN_EVENT__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessChain basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(ProcessChain newEntity) {
		ProcessChain oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_CHAIN_EVENT__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core getCore() {
		if (core != null && core.eIsProxy()) {
			InternalEObject oldCore = (InternalEObject)core;
			core = (Core)eResolveProxy(oldCore);
			if (core != oldCore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESS_CHAIN_EVENT__CORE, oldCore, core));
			}
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core basicGetCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(Core newCore) {
		Core oldCore = core;
		core = newCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESS_CHAIN_EVENT__CORE, oldCore, core));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__EVENT_TYPE:
				return getEventType();
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__CORE:
				if (resolve) return getCore();
				return basicGetCore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__EVENT_TYPE:
				setEventType((ProcessEventType)newValue);
				return;
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__ENTITY:
				setEntity((ProcessChain)newValue);
				return;
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__CORE:
				setCore((Core)newValue);
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
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__ENTITY:
				setEntity((ProcessChain)null);
				return;
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__CORE:
				setCore((Core)null);
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
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__EVENT_TYPE:
				return eventType != EVENT_TYPE_EDEFAULT;
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__ENTITY:
				return entity != null;
			case AmaltheaPackage.PROCESS_CHAIN_EVENT__CORE:
				return core != null;
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
		result.append(" (eventType: ");
		result.append(eventType);
		result.append(')');
		return result.toString();
	}

} //ProcessChainEventImpl
