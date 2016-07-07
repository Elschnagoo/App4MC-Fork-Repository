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
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions;
import org.eclipse.app4mc.amalthea.model.OsExecutionInstructions;

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
	protected OsExecutionInstructions apiSendMessage;

	/**
	 * The cached value of the '{@link #getApiTerminateTask() <em>Api Terminate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiTerminateTask()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiTerminateTask;

	/**
	 * The cached value of the '{@link #getApiSchedule() <em>Api Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSchedule()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiSchedule;

	/**
	 * The cached value of the '{@link #getApiRequestResource() <em>Api Request Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiRequestResource()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiRequestResource;

	/**
	 * The cached value of the '{@link #getApiReleaseResource() <em>Api Release Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiReleaseResource()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiReleaseResource;

	/**
	 * The cached value of the '{@link #getApiSetEvent() <em>Api Set Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSetEvent()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiSetEvent;

	/**
	 * The cached value of the '{@link #getApiWaitEvent() <em>Api Wait Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiWaitEvent()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiWaitEvent;

	/**
	 * The cached value of the '{@link #getApiClearEvent() <em>Api Clear Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiClearEvent()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiClearEvent;

	/**
	 * The cached value of the '{@link #getApiActivateTask() <em>Api Activate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiActivateTask()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiActivateTask;

	/**
	 * The cached value of the '{@link #getApiEnforcedMigration() <em>Api Enforced Migration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEnforcedMigration()
	 * @generated
	 * @ordered
	 */
	protected OsExecutionInstructions apiEnforcedMigration;

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
	public OsExecutionInstructions getApiSendMessage() {
		if (apiSendMessage != null && apiSendMessage.eIsProxy()) {
			InternalEObject oldApiSendMessage = (InternalEObject)apiSendMessage;
			apiSendMessage = (OsExecutionInstructions)eResolveProxy(oldApiSendMessage);
			if (apiSendMessage != oldApiSendMessage) {
				InternalEObject newApiSendMessage = (InternalEObject)apiSendMessage;
				NotificationChain msgs = oldApiSendMessage.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE, null, null);
				if (newApiSendMessage.eInternalContainer() == null) {
					msgs = newApiSendMessage.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SEND_MESSAGE, oldApiSendMessage, apiSendMessage));
			}
		}
		return apiSendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiSendMessage() {
		return apiSendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSendMessage(OsExecutionInstructions newApiSendMessage, NotificationChain msgs) {
		OsExecutionInstructions oldApiSendMessage = apiSendMessage;
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
	public void setApiSendMessage(OsExecutionInstructions newApiSendMessage) {
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
	public OsExecutionInstructions getApiTerminateTask() {
		if (apiTerminateTask != null && apiTerminateTask.eIsProxy()) {
			InternalEObject oldApiTerminateTask = (InternalEObject)apiTerminateTask;
			apiTerminateTask = (OsExecutionInstructions)eResolveProxy(oldApiTerminateTask);
			if (apiTerminateTask != oldApiTerminateTask) {
				InternalEObject newApiTerminateTask = (InternalEObject)apiTerminateTask;
				NotificationChain msgs = oldApiTerminateTask.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK, null, null);
				if (newApiTerminateTask.eInternalContainer() == null) {
					msgs = newApiTerminateTask.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK, oldApiTerminateTask, apiTerminateTask));
			}
		}
		return apiTerminateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiTerminateTask() {
		return apiTerminateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiTerminateTask(OsExecutionInstructions newApiTerminateTask, NotificationChain msgs) {
		OsExecutionInstructions oldApiTerminateTask = apiTerminateTask;
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
	public void setApiTerminateTask(OsExecutionInstructions newApiTerminateTask) {
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
	public OsExecutionInstructions getApiSchedule() {
		if (apiSchedule != null && apiSchedule.eIsProxy()) {
			InternalEObject oldApiSchedule = (InternalEObject)apiSchedule;
			apiSchedule = (OsExecutionInstructions)eResolveProxy(oldApiSchedule);
			if (apiSchedule != oldApiSchedule) {
				InternalEObject newApiSchedule = (InternalEObject)apiSchedule;
				NotificationChain msgs = oldApiSchedule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE, null, null);
				if (newApiSchedule.eInternalContainer() == null) {
					msgs = newApiSchedule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE, oldApiSchedule, apiSchedule));
			}
		}
		return apiSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiSchedule() {
		return apiSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSchedule(OsExecutionInstructions newApiSchedule, NotificationChain msgs) {
		OsExecutionInstructions oldApiSchedule = apiSchedule;
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
	public void setApiSchedule(OsExecutionInstructions newApiSchedule) {
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
	public OsExecutionInstructions getApiRequestResource() {
		if (apiRequestResource != null && apiRequestResource.eIsProxy()) {
			InternalEObject oldApiRequestResource = (InternalEObject)apiRequestResource;
			apiRequestResource = (OsExecutionInstructions)eResolveProxy(oldApiRequestResource);
			if (apiRequestResource != oldApiRequestResource) {
				InternalEObject newApiRequestResource = (InternalEObject)apiRequestResource;
				NotificationChain msgs = oldApiRequestResource.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE, null, null);
				if (newApiRequestResource.eInternalContainer() == null) {
					msgs = newApiRequestResource.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE, oldApiRequestResource, apiRequestResource));
			}
		}
		return apiRequestResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiRequestResource() {
		return apiRequestResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiRequestResource(OsExecutionInstructions newApiRequestResource, NotificationChain msgs) {
		OsExecutionInstructions oldApiRequestResource = apiRequestResource;
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
	public void setApiRequestResource(OsExecutionInstructions newApiRequestResource) {
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
	public OsExecutionInstructions getApiReleaseResource() {
		if (apiReleaseResource != null && apiReleaseResource.eIsProxy()) {
			InternalEObject oldApiReleaseResource = (InternalEObject)apiReleaseResource;
			apiReleaseResource = (OsExecutionInstructions)eResolveProxy(oldApiReleaseResource);
			if (apiReleaseResource != oldApiReleaseResource) {
				InternalEObject newApiReleaseResource = (InternalEObject)apiReleaseResource;
				NotificationChain msgs = oldApiReleaseResource.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE, null, null);
				if (newApiReleaseResource.eInternalContainer() == null) {
					msgs = newApiReleaseResource.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE, oldApiReleaseResource, apiReleaseResource));
			}
		}
		return apiReleaseResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiReleaseResource() {
		return apiReleaseResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiReleaseResource(OsExecutionInstructions newApiReleaseResource, NotificationChain msgs) {
		OsExecutionInstructions oldApiReleaseResource = apiReleaseResource;
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
	public void setApiReleaseResource(OsExecutionInstructions newApiReleaseResource) {
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
	public OsExecutionInstructions getApiSetEvent() {
		if (apiSetEvent != null && apiSetEvent.eIsProxy()) {
			InternalEObject oldApiSetEvent = (InternalEObject)apiSetEvent;
			apiSetEvent = (OsExecutionInstructions)eResolveProxy(oldApiSetEvent);
			if (apiSetEvent != oldApiSetEvent) {
				InternalEObject newApiSetEvent = (InternalEObject)apiSetEvent;
				NotificationChain msgs = oldApiSetEvent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT, null, null);
				if (newApiSetEvent.eInternalContainer() == null) {
					msgs = newApiSetEvent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT, oldApiSetEvent, apiSetEvent));
			}
		}
		return apiSetEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiSetEvent() {
		return apiSetEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSetEvent(OsExecutionInstructions newApiSetEvent, NotificationChain msgs) {
		OsExecutionInstructions oldApiSetEvent = apiSetEvent;
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
	public void setApiSetEvent(OsExecutionInstructions newApiSetEvent) {
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
	public OsExecutionInstructions getApiWaitEvent() {
		if (apiWaitEvent != null && apiWaitEvent.eIsProxy()) {
			InternalEObject oldApiWaitEvent = (InternalEObject)apiWaitEvent;
			apiWaitEvent = (OsExecutionInstructions)eResolveProxy(oldApiWaitEvent);
			if (apiWaitEvent != oldApiWaitEvent) {
				InternalEObject newApiWaitEvent = (InternalEObject)apiWaitEvent;
				NotificationChain msgs = oldApiWaitEvent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT, null, null);
				if (newApiWaitEvent.eInternalContainer() == null) {
					msgs = newApiWaitEvent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT, oldApiWaitEvent, apiWaitEvent));
			}
		}
		return apiWaitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiWaitEvent() {
		return apiWaitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiWaitEvent(OsExecutionInstructions newApiWaitEvent, NotificationChain msgs) {
		OsExecutionInstructions oldApiWaitEvent = apiWaitEvent;
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
	public void setApiWaitEvent(OsExecutionInstructions newApiWaitEvent) {
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
	public OsExecutionInstructions getApiClearEvent() {
		if (apiClearEvent != null && apiClearEvent.eIsProxy()) {
			InternalEObject oldApiClearEvent = (InternalEObject)apiClearEvent;
			apiClearEvent = (OsExecutionInstructions)eResolveProxy(oldApiClearEvent);
			if (apiClearEvent != oldApiClearEvent) {
				InternalEObject newApiClearEvent = (InternalEObject)apiClearEvent;
				NotificationChain msgs = oldApiClearEvent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT, null, null);
				if (newApiClearEvent.eInternalContainer() == null) {
					msgs = newApiClearEvent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT, oldApiClearEvent, apiClearEvent));
			}
		}
		return apiClearEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiClearEvent() {
		return apiClearEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiClearEvent(OsExecutionInstructions newApiClearEvent, NotificationChain msgs) {
		OsExecutionInstructions oldApiClearEvent = apiClearEvent;
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
	public void setApiClearEvent(OsExecutionInstructions newApiClearEvent) {
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
	public OsExecutionInstructions getApiActivateTask() {
		if (apiActivateTask != null && apiActivateTask.eIsProxy()) {
			InternalEObject oldApiActivateTask = (InternalEObject)apiActivateTask;
			apiActivateTask = (OsExecutionInstructions)eResolveProxy(oldApiActivateTask);
			if (apiActivateTask != oldApiActivateTask) {
				InternalEObject newApiActivateTask = (InternalEObject)apiActivateTask;
				NotificationChain msgs = oldApiActivateTask.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK, null, null);
				if (newApiActivateTask.eInternalContainer() == null) {
					msgs = newApiActivateTask.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK, oldApiActivateTask, apiActivateTask));
			}
		}
		return apiActivateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiActivateTask() {
		return apiActivateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiActivateTask(OsExecutionInstructions newApiActivateTask, NotificationChain msgs) {
		OsExecutionInstructions oldApiActivateTask = apiActivateTask;
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
	public void setApiActivateTask(OsExecutionInstructions newApiActivateTask) {
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
	public OsExecutionInstructions getApiEnforcedMigration() {
		if (apiEnforcedMigration != null && apiEnforcedMigration.eIsProxy()) {
			InternalEObject oldApiEnforcedMigration = (InternalEObject)apiEnforcedMigration;
			apiEnforcedMigration = (OsExecutionInstructions)eResolveProxy(oldApiEnforcedMigration);
			if (apiEnforcedMigration != oldApiEnforcedMigration) {
				InternalEObject newApiEnforcedMigration = (InternalEObject)apiEnforcedMigration;
				NotificationChain msgs = oldApiEnforcedMigration.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION, null, null);
				if (newApiEnforcedMigration.eInternalContainer() == null) {
					msgs = newApiEnforcedMigration.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION, oldApiEnforcedMigration, apiEnforcedMigration));
			}
		}
		return apiEnforcedMigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsExecutionInstructions basicGetApiEnforcedMigration() {
		return apiEnforcedMigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiEnforcedMigration(OsExecutionInstructions newApiEnforcedMigration, NotificationChain msgs) {
		OsExecutionInstructions oldApiEnforcedMigration = apiEnforcedMigration;
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
	public void setApiEnforcedMigration(OsExecutionInstructions newApiEnforcedMigration) {
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
				if (resolve) return getApiSendMessage();
				return basicGetApiSendMessage();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK:
				if (resolve) return getApiTerminateTask();
				return basicGetApiTerminateTask();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE:
				if (resolve) return getApiSchedule();
				return basicGetApiSchedule();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE:
				if (resolve) return getApiRequestResource();
				return basicGetApiRequestResource();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE:
				if (resolve) return getApiReleaseResource();
				return basicGetApiReleaseResource();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT:
				if (resolve) return getApiSetEvent();
				return basicGetApiSetEvent();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT:
				if (resolve) return getApiWaitEvent();
				return basicGetApiWaitEvent();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT:
				if (resolve) return getApiClearEvent();
				return basicGetApiClearEvent();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK:
				if (resolve) return getApiActivateTask();
				return basicGetApiActivateTask();
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION:
				if (resolve) return getApiEnforcedMigration();
				return basicGetApiEnforcedMigration();
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
				setApiSendMessage((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK:
				setApiTerminateTask((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE:
				setApiSchedule((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE:
				setApiRequestResource((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE:
				setApiReleaseResource((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT:
				setApiSetEvent((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT:
				setApiWaitEvent((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT:
				setApiClearEvent((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK:
				setApiActivateTask((OsExecutionInstructions)newValue);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION:
				setApiEnforcedMigration((OsExecutionInstructions)newValue);
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
				setApiSendMessage((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_TERMINATE_TASK:
				setApiTerminateTask((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SCHEDULE:
				setApiSchedule((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE:
				setApiRequestResource((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE:
				setApiReleaseResource((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_SET_EVENT:
				setApiSetEvent((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_WAIT_EVENT:
				setApiWaitEvent((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_CLEAR_EVENT:
				setApiClearEvent((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ACTIVATE_TASK:
				setApiActivateTask((OsExecutionInstructions)null);
				return;
			case AmaltheaPackage.OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION:
				setApiEnforcedMigration((OsExecutionInstructions)null);
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
