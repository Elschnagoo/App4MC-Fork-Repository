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
import org.eclipse.app4mc.amalthea.model.Instructions;
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os API Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiSendMessage <em>Api Send Message</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiTerminateTask <em>Api Terminate Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiSchedule <em>Api Schedule</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiRequestResource <em>Api Request Resource</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiReleaseResource <em>Api Release Resource</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiSetEvent <em>Api Set Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiWaitEvent <em>Api Wait Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiClearEvent <em>Api Clear Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiActivateTask <em>Api Activate Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl#getApiEnforcedMigration <em>Api Enforced Migration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsAPIInstructionsImpl extends BaseObjectImpl implements OsAPIInstructions {
	/**
	 * The cached value of the '{@link #getApiSendMessage() <em>Api Send Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSendMessage()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiSendMessage;

	/**
	 * The cached value of the '{@link #getApiTerminateTask() <em>Api Terminate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiTerminateTask()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiTerminateTask;

	/**
	 * The cached value of the '{@link #getApiSchedule() <em>Api Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSchedule()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiSchedule;

	/**
	 * The cached value of the '{@link #getApiRequestResource() <em>Api Request Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiRequestResource()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiRequestResource;

	/**
	 * The cached value of the '{@link #getApiReleaseResource() <em>Api Release Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiReleaseResource()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiReleaseResource;

	/**
	 * The cached value of the '{@link #getApiSetEvent() <em>Api Set Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSetEvent()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiSetEvent;

	/**
	 * The cached value of the '{@link #getApiWaitEvent() <em>Api Wait Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiWaitEvent()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiWaitEvent;

	/**
	 * The cached value of the '{@link #getApiClearEvent() <em>Api Clear Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiClearEvent()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiClearEvent;

	/**
	 * The cached value of the '{@link #getApiActivateTask() <em>Api Activate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiActivateTask()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiActivateTask;

	/**
	 * The cached value of the '{@link #getApiEnforcedMigration() <em>Api Enforced Migration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEnforcedMigration()
	 * @generated
	 * @ordered
	 */
	protected Instructions apiEnforcedMigration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsAPIInstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsAPIInstructions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiSendMessage() {
		return apiSendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSendMessage(Instructions newApiSendMessage, NotificationChain msgs) {
		Instructions oldApiSendMessage = apiSendMessage;
		apiSendMessage = newApiSendMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE, oldApiSendMessage, newApiSendMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSendMessage(Instructions newApiSendMessage) {
		if (newApiSendMessage != apiSendMessage) {
			NotificationChain msgs = null;
			if (apiSendMessage != null)
				msgs = ((InternalEObject)apiSendMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE, null, msgs);
			if (newApiSendMessage != null)
				msgs = ((InternalEObject)newApiSendMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE, null, msgs);
			msgs = basicSetApiSendMessage(newApiSendMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE, newApiSendMessage, newApiSendMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiTerminateTask() {
		return apiTerminateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiTerminateTask(Instructions newApiTerminateTask, NotificationChain msgs) {
		Instructions oldApiTerminateTask = apiTerminateTask;
		apiTerminateTask = newApiTerminateTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK, oldApiTerminateTask, newApiTerminateTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiTerminateTask(Instructions newApiTerminateTask) {
		if (newApiTerminateTask != apiTerminateTask) {
			NotificationChain msgs = null;
			if (apiTerminateTask != null)
				msgs = ((InternalEObject)apiTerminateTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK, null, msgs);
			if (newApiTerminateTask != null)
				msgs = ((InternalEObject)newApiTerminateTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK, null, msgs);
			msgs = basicSetApiTerminateTask(newApiTerminateTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK, newApiTerminateTask, newApiTerminateTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiSchedule() {
		return apiSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSchedule(Instructions newApiSchedule, NotificationChain msgs) {
		Instructions oldApiSchedule = apiSchedule;
		apiSchedule = newApiSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE, oldApiSchedule, newApiSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSchedule(Instructions newApiSchedule) {
		if (newApiSchedule != apiSchedule) {
			NotificationChain msgs = null;
			if (apiSchedule != null)
				msgs = ((InternalEObject)apiSchedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE, null, msgs);
			if (newApiSchedule != null)
				msgs = ((InternalEObject)newApiSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE, null, msgs);
			msgs = basicSetApiSchedule(newApiSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE, newApiSchedule, newApiSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiRequestResource() {
		return apiRequestResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiRequestResource(Instructions newApiRequestResource, NotificationChain msgs) {
		Instructions oldApiRequestResource = apiRequestResource;
		apiRequestResource = newApiRequestResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE, oldApiRequestResource, newApiRequestResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiRequestResource(Instructions newApiRequestResource) {
		if (newApiRequestResource != apiRequestResource) {
			NotificationChain msgs = null;
			if (apiRequestResource != null)
				msgs = ((InternalEObject)apiRequestResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE, null, msgs);
			if (newApiRequestResource != null)
				msgs = ((InternalEObject)newApiRequestResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE, null, msgs);
			msgs = basicSetApiRequestResource(newApiRequestResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE, newApiRequestResource, newApiRequestResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiReleaseResource() {
		return apiReleaseResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiReleaseResource(Instructions newApiReleaseResource, NotificationChain msgs) {
		Instructions oldApiReleaseResource = apiReleaseResource;
		apiReleaseResource = newApiReleaseResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE, oldApiReleaseResource, newApiReleaseResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiReleaseResource(Instructions newApiReleaseResource) {
		if (newApiReleaseResource != apiReleaseResource) {
			NotificationChain msgs = null;
			if (apiReleaseResource != null)
				msgs = ((InternalEObject)apiReleaseResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE, null, msgs);
			if (newApiReleaseResource != null)
				msgs = ((InternalEObject)newApiReleaseResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE, null, msgs);
			msgs = basicSetApiReleaseResource(newApiReleaseResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE, newApiReleaseResource, newApiReleaseResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiSetEvent() {
		return apiSetEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSetEvent(Instructions newApiSetEvent, NotificationChain msgs) {
		Instructions oldApiSetEvent = apiSetEvent;
		apiSetEvent = newApiSetEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT, oldApiSetEvent, newApiSetEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSetEvent(Instructions newApiSetEvent) {
		if (newApiSetEvent != apiSetEvent) {
			NotificationChain msgs = null;
			if (apiSetEvent != null)
				msgs = ((InternalEObject)apiSetEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT, null, msgs);
			if (newApiSetEvent != null)
				msgs = ((InternalEObject)newApiSetEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT, null, msgs);
			msgs = basicSetApiSetEvent(newApiSetEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT, newApiSetEvent, newApiSetEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiWaitEvent() {
		return apiWaitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiWaitEvent(Instructions newApiWaitEvent, NotificationChain msgs) {
		Instructions oldApiWaitEvent = apiWaitEvent;
		apiWaitEvent = newApiWaitEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT, oldApiWaitEvent, newApiWaitEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiWaitEvent(Instructions newApiWaitEvent) {
		if (newApiWaitEvent != apiWaitEvent) {
			NotificationChain msgs = null;
			if (apiWaitEvent != null)
				msgs = ((InternalEObject)apiWaitEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT, null, msgs);
			if (newApiWaitEvent != null)
				msgs = ((InternalEObject)newApiWaitEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT, null, msgs);
			msgs = basicSetApiWaitEvent(newApiWaitEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT, newApiWaitEvent, newApiWaitEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiClearEvent() {
		return apiClearEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiClearEvent(Instructions newApiClearEvent, NotificationChain msgs) {
		Instructions oldApiClearEvent = apiClearEvent;
		apiClearEvent = newApiClearEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT, oldApiClearEvent, newApiClearEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiClearEvent(Instructions newApiClearEvent) {
		if (newApiClearEvent != apiClearEvent) {
			NotificationChain msgs = null;
			if (apiClearEvent != null)
				msgs = ((InternalEObject)apiClearEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT, null, msgs);
			if (newApiClearEvent != null)
				msgs = ((InternalEObject)newApiClearEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT, null, msgs);
			msgs = basicSetApiClearEvent(newApiClearEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT, newApiClearEvent, newApiClearEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiActivateTask() {
		return apiActivateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiActivateTask(Instructions newApiActivateTask, NotificationChain msgs) {
		Instructions oldApiActivateTask = apiActivateTask;
		apiActivateTask = newApiActivateTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK, oldApiActivateTask, newApiActivateTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiActivateTask(Instructions newApiActivateTask) {
		if (newApiActivateTask != apiActivateTask) {
			NotificationChain msgs = null;
			if (apiActivateTask != null)
				msgs = ((InternalEObject)apiActivateTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK, null, msgs);
			if (newApiActivateTask != null)
				msgs = ((InternalEObject)newApiActivateTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK, null, msgs);
			msgs = basicSetApiActivateTask(newApiActivateTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK, newApiActivateTask, newApiActivateTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getApiEnforcedMigration() {
		return apiEnforcedMigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiEnforcedMigration(Instructions newApiEnforcedMigration, NotificationChain msgs) {
		Instructions oldApiEnforcedMigration = apiEnforcedMigration;
		apiEnforcedMigration = newApiEnforcedMigration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION, oldApiEnforcedMigration, newApiEnforcedMigration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiEnforcedMigration(Instructions newApiEnforcedMigration) {
		if (newApiEnforcedMigration != apiEnforcedMigration) {
			NotificationChain msgs = null;
			if (apiEnforcedMigration != null)
				msgs = ((InternalEObject)apiEnforcedMigration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION, null, msgs);
			if (newApiEnforcedMigration != null)
				msgs = ((InternalEObject)newApiEnforcedMigration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION, null, msgs);
			msgs = basicSetApiEnforcedMigration(newApiEnforcedMigration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION, newApiEnforcedMigration, newApiEnforcedMigration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE:
				return basicSetApiSendMessage(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK:
				return basicSetApiTerminateTask(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE:
				return basicSetApiSchedule(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE:
				return basicSetApiRequestResource(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE:
				return basicSetApiReleaseResource(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT:
				return basicSetApiSetEvent(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT:
				return basicSetApiWaitEvent(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT:
				return basicSetApiClearEvent(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK:
				return basicSetApiActivateTask(null, msgs);
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION:
				return basicSetApiEnforcedMigration(null, msgs);
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
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE:
				return getApiSendMessage();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK:
				return getApiTerminateTask();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE:
				return getApiSchedule();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE:
				return getApiRequestResource();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE:
				return getApiReleaseResource();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT:
				return getApiSetEvent();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT:
				return getApiWaitEvent();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT:
				return getApiClearEvent();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK:
				return getApiActivateTask();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION:
				return getApiEnforcedMigration();
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
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE:
				setApiSendMessage((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK:
				setApiTerminateTask((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE:
				setApiSchedule((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE:
				setApiRequestResource((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE:
				setApiReleaseResource((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT:
				setApiSetEvent((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT:
				setApiWaitEvent((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT:
				setApiClearEvent((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK:
				setApiActivateTask((Instructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION:
				setApiEnforcedMigration((Instructions)newValue);
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
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE:
				setApiSendMessage((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK:
				setApiTerminateTask((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE:
				setApiSchedule((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE:
				setApiRequestResource((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE:
				setApiReleaseResource((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT:
				setApiSetEvent((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT:
				setApiWaitEvent((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT:
				setApiClearEvent((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK:
				setApiActivateTask((Instructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION:
				setApiEnforcedMigration((Instructions)null);
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
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE:
				return apiSendMessage != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK:
				return apiTerminateTask != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE:
				return apiSchedule != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE:
				return apiRequestResource != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE:
				return apiReleaseResource != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT:
				return apiSetEvent != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT:
				return apiWaitEvent != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT:
				return apiClearEvent != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK:
				return apiActivateTask != null;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION:
				return apiEnforcedMigration != null;
		}
		return super.eIsSet(featureID);
	}

} //OsAPIInstructionsImpl
