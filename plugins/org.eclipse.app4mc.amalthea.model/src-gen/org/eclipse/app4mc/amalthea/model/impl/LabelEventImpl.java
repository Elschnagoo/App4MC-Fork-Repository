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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.LabelEventType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelEventImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelEventImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelEventImpl#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelEventImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelEventImpl extends TriggerEventImpl implements LabelEvent {
	/**
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final LabelEventType EVENT_TYPE_EDEFAULT = LabelEventType._ALL_;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected LabelEventType eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Label entity;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLabelEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelEventType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(LabelEventType newEventType) {
		LabelEventType oldEventType = eventType;
		eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_EVENT__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Label)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL_EVENT__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Label newEntity) {
		Label oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_EVENT__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getRunnable() {
		if (runnable != null && runnable.eIsProxy()) {
			InternalEObject oldRunnable = (InternalEObject)runnable;
			runnable = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldRunnable);
			if (runnable != oldRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL_EVENT__RUNNABLE, oldRunnable, runnable));
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
	public void setRunnable(org.eclipse.app4mc.amalthea.model.Runnable newRunnable) {
		org.eclipse.app4mc.amalthea.model.Runnable oldRunnable = runnable;
		runnable = newRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_EVENT__RUNNABLE, oldRunnable, runnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Process getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (org.eclipse.app4mc.amalthea.model.Process)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL_EVENT__PROCESS, oldProcess, process));
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
	public void setProcess(org.eclipse.app4mc.amalthea.model.Process newProcess) {
		org.eclipse.app4mc.amalthea.model.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_EVENT__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.LABEL_EVENT__EVENT_TYPE:
				return getEventType();
			case AmaltheaPackage.LABEL_EVENT__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case AmaltheaPackage.LABEL_EVENT__RUNNABLE:
				if (resolve) return getRunnable();
				return basicGetRunnable();
			case AmaltheaPackage.LABEL_EVENT__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
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
			case AmaltheaPackage.LABEL_EVENT__EVENT_TYPE:
				setEventType((LabelEventType)newValue);
				return;
			case AmaltheaPackage.LABEL_EVENT__ENTITY:
				setEntity((Label)newValue);
				return;
			case AmaltheaPackage.LABEL_EVENT__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
				return;
			case AmaltheaPackage.LABEL_EVENT__PROCESS:
				setProcess((org.eclipse.app4mc.amalthea.model.Process)newValue);
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
			case AmaltheaPackage.LABEL_EVENT__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL_EVENT__ENTITY:
				setEntity((Label)null);
				return;
			case AmaltheaPackage.LABEL_EVENT__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
				return;
			case AmaltheaPackage.LABEL_EVENT__PROCESS:
				setProcess((org.eclipse.app4mc.amalthea.model.Process)null);
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
			case AmaltheaPackage.LABEL_EVENT__EVENT_TYPE:
				return eventType != EVENT_TYPE_EDEFAULT;
			case AmaltheaPackage.LABEL_EVENT__ENTITY:
				return entity != null;
			case AmaltheaPackage.LABEL_EVENT__RUNNABLE:
				return runnable != null;
			case AmaltheaPackage.LABEL_EVENT__PROCESS:
				return process != null;
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

} //LabelEventImpl
