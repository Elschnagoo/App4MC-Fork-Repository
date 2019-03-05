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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.RunnableEvent;
import org.eclipse.app4mc.amalthea.model.RunnableEventType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableEventImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableEventImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableEventImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableEventImpl#getProcessingUnit <em>Processing Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableEventImpl extends TriggerEventImpl implements RunnableEvent {
	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final RunnableEventType EVENT_TYPE_EDEFAULT = RunnableEventType._ALL_;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected RunnableEventType eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable entity;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Process process;

	/**
	 * The cached value of the '{@link #getProcessingUnit() <em>Processing Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnit()
	 * @generated
	 * @ordered
	 */
	protected ProcessingUnit processingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnableEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableEventType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventType(RunnableEventType newEventType) {
		RunnableEventType oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_EVENT__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.app4mc.amalthea.model.Runnable getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_EVENT__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(org.eclipse.app4mc.amalthea.model.Runnable newEntity) {
		org.eclipse.app4mc.amalthea.model.Runnable oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_EVENT__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.app4mc.amalthea.model.Process getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (org.eclipse.app4mc.amalthea.model.Process)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_EVENT__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Process basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(org.eclipse.app4mc.amalthea.model.Process newProcess) {
		org.eclipse.app4mc.amalthea.model.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_EVENT__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingUnit getProcessingUnit() {
		if (processingUnit != null && processingUnit.eIsProxy()) {
			InternalEObject oldProcessingUnit = (InternalEObject)processingUnit;
			processingUnit = (ProcessingUnit)eResolveProxy(oldProcessingUnit);
			if (processingUnit != oldProcessingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_EVENT__PROCESSING_UNIT, oldProcessingUnit, processingUnit));
			}
		}
		return processingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnit basicGetProcessingUnit() {
		return processingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingUnit(ProcessingUnit newProcessingUnit) {
		ProcessingUnit oldProcessingUnit = processingUnit;
		processingUnit = newProcessingUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_EVENT__PROCESSING_UNIT, oldProcessingUnit, processingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE_EVENT__EVENT_TYPE:
				return getEventType();
			case AmaltheaPackage.RUNNABLE_EVENT__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case AmaltheaPackage.RUNNABLE_EVENT__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
			case AmaltheaPackage.RUNNABLE_EVENT__PROCESSING_UNIT:
				if (resolve) return getProcessingUnit();
				return basicGetProcessingUnit();
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
			case AmaltheaPackage.RUNNABLE_EVENT__EVENT_TYPE:
				setEventType((RunnableEventType)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_EVENT__ENTITY:
				setEntity((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_EVENT__PROCESS:
				setProcess((org.eclipse.app4mc.amalthea.model.Process)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_EVENT__PROCESSING_UNIT:
				setProcessingUnit((ProcessingUnit)newValue);
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
			case AmaltheaPackage.RUNNABLE_EVENT__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE_EVENT__ENTITY:
				setEntity((org.eclipse.app4mc.amalthea.model.Runnable)null);
				return;
			case AmaltheaPackage.RUNNABLE_EVENT__PROCESS:
				setProcess((org.eclipse.app4mc.amalthea.model.Process)null);
				return;
			case AmaltheaPackage.RUNNABLE_EVENT__PROCESSING_UNIT:
				setProcessingUnit((ProcessingUnit)null);
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
			case AmaltheaPackage.RUNNABLE_EVENT__EVENT_TYPE:
				return eventType != EVENT_TYPE_EDEFAULT;
			case AmaltheaPackage.RUNNABLE_EVENT__ENTITY:
				return entity != null;
			case AmaltheaPackage.RUNNABLE_EVENT__PROCESS:
				return process != null;
			case AmaltheaPackage.RUNNABLE_EVENT__PROCESSING_UNIT:
				return processingUnit != null;
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
		result.append(" (eventType: ");
		result.append(eventType);
		result.append(')');
		return result.toString();
	}

} //RunnableEventImpl
