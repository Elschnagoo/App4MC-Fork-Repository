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
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreEvent;
import org.eclipse.app4mc.amalthea.model.SemaphoreEventType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaphore Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreEventImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreEventImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreEventImpl#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreEventImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreEventImpl#getProcessingUnit <em>Processing Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemaphoreEventImpl extends EntityEventImpl implements SemaphoreEvent {
	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final SemaphoreEventType EVENT_TYPE_EDEFAULT = SemaphoreEventType._ALL_;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected SemaphoreEventType eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Semaphore entity;

	/**
	 * The cached value of the '{@link #getRunnable() <em>Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable runnable;

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
	protected SemaphoreEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSemaphoreEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemaphoreEventType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventType(SemaphoreEventType newEventType) {
		SemaphoreEventType oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE_EVENT__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semaphore getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Semaphore)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SEMAPHORE_EVENT__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Semaphore newEntity) {
		Semaphore oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE_EVENT__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.app4mc.amalthea.model.Runnable getRunnable() {
		if (runnable != null && runnable.eIsProxy()) {
			InternalEObject oldRunnable = (InternalEObject)runnable;
			runnable = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldRunnable);
			if (runnable != oldRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SEMAPHORE_EVENT__RUNNABLE, oldRunnable, runnable));
			}
		}
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetRunnable() {
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunnable(org.eclipse.app4mc.amalthea.model.Runnable newRunnable) {
		org.eclipse.app4mc.amalthea.model.Runnable oldRunnable = runnable;
		runnable = newRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE_EVENT__RUNNABLE, oldRunnable, runnable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SEMAPHORE_EVENT__PROCESS, oldProcess, process));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE_EVENT__PROCESS, oldProcess, process));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SEMAPHORE_EVENT__PROCESSING_UNIT, oldProcessingUnit, processingUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE_EVENT__PROCESSING_UNIT, oldProcessingUnit, processingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.SEMAPHORE_EVENT__EVENT_TYPE:
				return getEventType();
			case AmaltheaPackage.SEMAPHORE_EVENT__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case AmaltheaPackage.SEMAPHORE_EVENT__RUNNABLE:
				if (resolve) return getRunnable();
				return basicGetRunnable();
			case AmaltheaPackage.SEMAPHORE_EVENT__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
			case AmaltheaPackage.SEMAPHORE_EVENT__PROCESSING_UNIT:
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
			case AmaltheaPackage.SEMAPHORE_EVENT__EVENT_TYPE:
				setEventType((SemaphoreEventType)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE_EVENT__ENTITY:
				setEntity((Semaphore)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE_EVENT__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE_EVENT__PROCESS:
				setProcess((org.eclipse.app4mc.amalthea.model.Process)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE_EVENT__PROCESSING_UNIT:
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
			case AmaltheaPackage.SEMAPHORE_EVENT__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.SEMAPHORE_EVENT__ENTITY:
				setEntity((Semaphore)null);
				return;
			case AmaltheaPackage.SEMAPHORE_EVENT__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
				return;
			case AmaltheaPackage.SEMAPHORE_EVENT__PROCESS:
				setProcess((org.eclipse.app4mc.amalthea.model.Process)null);
				return;
			case AmaltheaPackage.SEMAPHORE_EVENT__PROCESSING_UNIT:
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
			case AmaltheaPackage.SEMAPHORE_EVENT__EVENT_TYPE:
				return eventType != EVENT_TYPE_EDEFAULT;
			case AmaltheaPackage.SEMAPHORE_EVENT__ENTITY:
				return entity != null;
			case AmaltheaPackage.SEMAPHORE_EVENT__RUNNABLE:
				return runnable != null;
			case AmaltheaPackage.SEMAPHORE_EVENT__PROCESS:
				return process != null;
			case AmaltheaPackage.SEMAPHORE_EVENT__PROCESSING_UNIT:
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

} //SemaphoreEventImpl
