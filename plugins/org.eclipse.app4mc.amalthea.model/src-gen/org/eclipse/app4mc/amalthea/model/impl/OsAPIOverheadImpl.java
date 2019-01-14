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
import org.eclipse.app4mc.amalthea.model.OsAPIOverhead;
import org.eclipse.app4mc.amalthea.model.Ticks;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os API Overhead</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiSendMessage <em>Api Send Message</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiTerminateTask <em>Api Terminate Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiSchedule <em>Api Schedule</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiRequestResource <em>Api Request Resource</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiReleaseResource <em>Api Release Resource</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiSetEvent <em>Api Set Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiWaitEvent <em>Api Wait Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiClearEvent <em>Api Clear Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiActivateTask <em>Api Activate Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiEnforcedMigration <em>Api Enforced Migration</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiSuspendOsInterrupts <em>Api Suspend Os Interrupts</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiResumeOsInterrupts <em>Api Resume Os Interrupts</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiRequestSpinlock <em>Api Request Spinlock</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiReleaseSpinlock <em>Api Release Spinlock</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiSenderReceiverRead <em>Api Sender Receiver Read</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiSenderReceiverWrite <em>Api Sender Receiver Write</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiSynchronousServerCallPoint <em>Api Synchronous Server Call Point</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiIocRead <em>Api Ioc Read</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIOverheadImpl#getApiIocWrite <em>Api Ioc Write</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsAPIOverheadImpl extends BaseObjectImpl implements OsAPIOverhead {
	/**
	 * The cached value of the '{@link #getApiSendMessage() <em>Api Send Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSendMessage()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiSendMessage;

	/**
	 * The cached value of the '{@link #getApiTerminateTask() <em>Api Terminate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiTerminateTask()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiTerminateTask;

	/**
	 * The cached value of the '{@link #getApiSchedule() <em>Api Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSchedule()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiSchedule;

	/**
	 * The cached value of the '{@link #getApiRequestResource() <em>Api Request Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiRequestResource()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiRequestResource;

	/**
	 * The cached value of the '{@link #getApiReleaseResource() <em>Api Release Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiReleaseResource()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiReleaseResource;

	/**
	 * The cached value of the '{@link #getApiSetEvent() <em>Api Set Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSetEvent()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiSetEvent;

	/**
	 * The cached value of the '{@link #getApiWaitEvent() <em>Api Wait Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiWaitEvent()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiWaitEvent;

	/**
	 * The cached value of the '{@link #getApiClearEvent() <em>Api Clear Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiClearEvent()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiClearEvent;

	/**
	 * The cached value of the '{@link #getApiActivateTask() <em>Api Activate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiActivateTask()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiActivateTask;

	/**
	 * The cached value of the '{@link #getApiEnforcedMigration() <em>Api Enforced Migration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEnforcedMigration()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiEnforcedMigration;

	/**
	 * The cached value of the '{@link #getApiSuspendOsInterrupts() <em>Api Suspend Os Interrupts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSuspendOsInterrupts()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiSuspendOsInterrupts;

	/**
	 * The cached value of the '{@link #getApiResumeOsInterrupts() <em>Api Resume Os Interrupts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiResumeOsInterrupts()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiResumeOsInterrupts;

	/**
	 * The cached value of the '{@link #getApiRequestSpinlock() <em>Api Request Spinlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiRequestSpinlock()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiRequestSpinlock;

	/**
	 * The cached value of the '{@link #getApiReleaseSpinlock() <em>Api Release Spinlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiReleaseSpinlock()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiReleaseSpinlock;

	/**
	 * The cached value of the '{@link #getApiSenderReceiverRead() <em>Api Sender Receiver Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSenderReceiverRead()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiSenderReceiverRead;

	/**
	 * The cached value of the '{@link #getApiSenderReceiverWrite() <em>Api Sender Receiver Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSenderReceiverWrite()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiSenderReceiverWrite;

	/**
	 * The cached value of the '{@link #getApiSynchronousServerCallPoint() <em>Api Synchronous Server Call Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSynchronousServerCallPoint()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiSynchronousServerCallPoint;

	/**
	 * The cached value of the '{@link #getApiIocRead() <em>Api Ioc Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiIocRead()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiIocRead;

	/**
	 * The cached value of the '{@link #getApiIocWrite() <em>Api Ioc Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiIocWrite()
	 * @generated
	 * @ordered
	 */
	protected Ticks apiIocWrite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsAPIOverheadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsAPIOverhead();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiSendMessage() {
		return apiSendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSendMessage(Ticks newApiSendMessage, NotificationChain msgs) {
		Ticks oldApiSendMessage = apiSendMessage;
		apiSendMessage = newApiSendMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE, oldApiSendMessage, newApiSendMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSendMessage(Ticks newApiSendMessage) {
		if (newApiSendMessage != apiSendMessage) {
			NotificationChain msgs = null;
			if (apiSendMessage != null)
				msgs = ((InternalEObject)apiSendMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE, null, msgs);
			if (newApiSendMessage != null)
				msgs = ((InternalEObject)newApiSendMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE, null, msgs);
			msgs = basicSetApiSendMessage(newApiSendMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE, newApiSendMessage, newApiSendMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiTerminateTask() {
		return apiTerminateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiTerminateTask(Ticks newApiTerminateTask, NotificationChain msgs) {
		Ticks oldApiTerminateTask = apiTerminateTask;
		apiTerminateTask = newApiTerminateTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK, oldApiTerminateTask, newApiTerminateTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiTerminateTask(Ticks newApiTerminateTask) {
		if (newApiTerminateTask != apiTerminateTask) {
			NotificationChain msgs = null;
			if (apiTerminateTask != null)
				msgs = ((InternalEObject)apiTerminateTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK, null, msgs);
			if (newApiTerminateTask != null)
				msgs = ((InternalEObject)newApiTerminateTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK, null, msgs);
			msgs = basicSetApiTerminateTask(newApiTerminateTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK, newApiTerminateTask, newApiTerminateTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiSchedule() {
		return apiSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSchedule(Ticks newApiSchedule, NotificationChain msgs) {
		Ticks oldApiSchedule = apiSchedule;
		apiSchedule = newApiSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE, oldApiSchedule, newApiSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSchedule(Ticks newApiSchedule) {
		if (newApiSchedule != apiSchedule) {
			NotificationChain msgs = null;
			if (apiSchedule != null)
				msgs = ((InternalEObject)apiSchedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE, null, msgs);
			if (newApiSchedule != null)
				msgs = ((InternalEObject)newApiSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE, null, msgs);
			msgs = basicSetApiSchedule(newApiSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE, newApiSchedule, newApiSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiRequestResource() {
		return apiRequestResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiRequestResource(Ticks newApiRequestResource, NotificationChain msgs) {
		Ticks oldApiRequestResource = apiRequestResource;
		apiRequestResource = newApiRequestResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE, oldApiRequestResource, newApiRequestResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiRequestResource(Ticks newApiRequestResource) {
		if (newApiRequestResource != apiRequestResource) {
			NotificationChain msgs = null;
			if (apiRequestResource != null)
				msgs = ((InternalEObject)apiRequestResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE, null, msgs);
			if (newApiRequestResource != null)
				msgs = ((InternalEObject)newApiRequestResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE, null, msgs);
			msgs = basicSetApiRequestResource(newApiRequestResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE, newApiRequestResource, newApiRequestResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiReleaseResource() {
		return apiReleaseResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiReleaseResource(Ticks newApiReleaseResource, NotificationChain msgs) {
		Ticks oldApiReleaseResource = apiReleaseResource;
		apiReleaseResource = newApiReleaseResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE, oldApiReleaseResource, newApiReleaseResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiReleaseResource(Ticks newApiReleaseResource) {
		if (newApiReleaseResource != apiReleaseResource) {
			NotificationChain msgs = null;
			if (apiReleaseResource != null)
				msgs = ((InternalEObject)apiReleaseResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE, null, msgs);
			if (newApiReleaseResource != null)
				msgs = ((InternalEObject)newApiReleaseResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE, null, msgs);
			msgs = basicSetApiReleaseResource(newApiReleaseResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE, newApiReleaseResource, newApiReleaseResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiSetEvent() {
		return apiSetEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSetEvent(Ticks newApiSetEvent, NotificationChain msgs) {
		Ticks oldApiSetEvent = apiSetEvent;
		apiSetEvent = newApiSetEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT, oldApiSetEvent, newApiSetEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSetEvent(Ticks newApiSetEvent) {
		if (newApiSetEvent != apiSetEvent) {
			NotificationChain msgs = null;
			if (apiSetEvent != null)
				msgs = ((InternalEObject)apiSetEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT, null, msgs);
			if (newApiSetEvent != null)
				msgs = ((InternalEObject)newApiSetEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT, null, msgs);
			msgs = basicSetApiSetEvent(newApiSetEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT, newApiSetEvent, newApiSetEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiWaitEvent() {
		return apiWaitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiWaitEvent(Ticks newApiWaitEvent, NotificationChain msgs) {
		Ticks oldApiWaitEvent = apiWaitEvent;
		apiWaitEvent = newApiWaitEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT, oldApiWaitEvent, newApiWaitEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiWaitEvent(Ticks newApiWaitEvent) {
		if (newApiWaitEvent != apiWaitEvent) {
			NotificationChain msgs = null;
			if (apiWaitEvent != null)
				msgs = ((InternalEObject)apiWaitEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT, null, msgs);
			if (newApiWaitEvent != null)
				msgs = ((InternalEObject)newApiWaitEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT, null, msgs);
			msgs = basicSetApiWaitEvent(newApiWaitEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT, newApiWaitEvent, newApiWaitEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiClearEvent() {
		return apiClearEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiClearEvent(Ticks newApiClearEvent, NotificationChain msgs) {
		Ticks oldApiClearEvent = apiClearEvent;
		apiClearEvent = newApiClearEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT, oldApiClearEvent, newApiClearEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiClearEvent(Ticks newApiClearEvent) {
		if (newApiClearEvent != apiClearEvent) {
			NotificationChain msgs = null;
			if (apiClearEvent != null)
				msgs = ((InternalEObject)apiClearEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT, null, msgs);
			if (newApiClearEvent != null)
				msgs = ((InternalEObject)newApiClearEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT, null, msgs);
			msgs = basicSetApiClearEvent(newApiClearEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT, newApiClearEvent, newApiClearEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiActivateTask() {
		return apiActivateTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiActivateTask(Ticks newApiActivateTask, NotificationChain msgs) {
		Ticks oldApiActivateTask = apiActivateTask;
		apiActivateTask = newApiActivateTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK, oldApiActivateTask, newApiActivateTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiActivateTask(Ticks newApiActivateTask) {
		if (newApiActivateTask != apiActivateTask) {
			NotificationChain msgs = null;
			if (apiActivateTask != null)
				msgs = ((InternalEObject)apiActivateTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK, null, msgs);
			if (newApiActivateTask != null)
				msgs = ((InternalEObject)newApiActivateTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK, null, msgs);
			msgs = basicSetApiActivateTask(newApiActivateTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK, newApiActivateTask, newApiActivateTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiEnforcedMigration() {
		return apiEnforcedMigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiEnforcedMigration(Ticks newApiEnforcedMigration, NotificationChain msgs) {
		Ticks oldApiEnforcedMigration = apiEnforcedMigration;
		apiEnforcedMigration = newApiEnforcedMigration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION, oldApiEnforcedMigration, newApiEnforcedMigration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiEnforcedMigration(Ticks newApiEnforcedMigration) {
		if (newApiEnforcedMigration != apiEnforcedMigration) {
			NotificationChain msgs = null;
			if (apiEnforcedMigration != null)
				msgs = ((InternalEObject)apiEnforcedMigration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION, null, msgs);
			if (newApiEnforcedMigration != null)
				msgs = ((InternalEObject)newApiEnforcedMigration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION, null, msgs);
			msgs = basicSetApiEnforcedMigration(newApiEnforcedMigration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION, newApiEnforcedMigration, newApiEnforcedMigration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiSuspendOsInterrupts() {
		return apiSuspendOsInterrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSuspendOsInterrupts(Ticks newApiSuspendOsInterrupts, NotificationChain msgs) {
		Ticks oldApiSuspendOsInterrupts = apiSuspendOsInterrupts;
		apiSuspendOsInterrupts = newApiSuspendOsInterrupts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS, oldApiSuspendOsInterrupts, newApiSuspendOsInterrupts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSuspendOsInterrupts(Ticks newApiSuspendOsInterrupts) {
		if (newApiSuspendOsInterrupts != apiSuspendOsInterrupts) {
			NotificationChain msgs = null;
			if (apiSuspendOsInterrupts != null)
				msgs = ((InternalEObject)apiSuspendOsInterrupts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS, null, msgs);
			if (newApiSuspendOsInterrupts != null)
				msgs = ((InternalEObject)newApiSuspendOsInterrupts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS, null, msgs);
			msgs = basicSetApiSuspendOsInterrupts(newApiSuspendOsInterrupts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS, newApiSuspendOsInterrupts, newApiSuspendOsInterrupts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiResumeOsInterrupts() {
		return apiResumeOsInterrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiResumeOsInterrupts(Ticks newApiResumeOsInterrupts, NotificationChain msgs) {
		Ticks oldApiResumeOsInterrupts = apiResumeOsInterrupts;
		apiResumeOsInterrupts = newApiResumeOsInterrupts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS, oldApiResumeOsInterrupts, newApiResumeOsInterrupts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiResumeOsInterrupts(Ticks newApiResumeOsInterrupts) {
		if (newApiResumeOsInterrupts != apiResumeOsInterrupts) {
			NotificationChain msgs = null;
			if (apiResumeOsInterrupts != null)
				msgs = ((InternalEObject)apiResumeOsInterrupts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS, null, msgs);
			if (newApiResumeOsInterrupts != null)
				msgs = ((InternalEObject)newApiResumeOsInterrupts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS, null, msgs);
			msgs = basicSetApiResumeOsInterrupts(newApiResumeOsInterrupts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS, newApiResumeOsInterrupts, newApiResumeOsInterrupts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiRequestSpinlock() {
		return apiRequestSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiRequestSpinlock(Ticks newApiRequestSpinlock, NotificationChain msgs) {
		Ticks oldApiRequestSpinlock = apiRequestSpinlock;
		apiRequestSpinlock = newApiRequestSpinlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK, oldApiRequestSpinlock, newApiRequestSpinlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiRequestSpinlock(Ticks newApiRequestSpinlock) {
		if (newApiRequestSpinlock != apiRequestSpinlock) {
			NotificationChain msgs = null;
			if (apiRequestSpinlock != null)
				msgs = ((InternalEObject)apiRequestSpinlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK, null, msgs);
			if (newApiRequestSpinlock != null)
				msgs = ((InternalEObject)newApiRequestSpinlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK, null, msgs);
			msgs = basicSetApiRequestSpinlock(newApiRequestSpinlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK, newApiRequestSpinlock, newApiRequestSpinlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiReleaseSpinlock() {
		return apiReleaseSpinlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiReleaseSpinlock(Ticks newApiReleaseSpinlock, NotificationChain msgs) {
		Ticks oldApiReleaseSpinlock = apiReleaseSpinlock;
		apiReleaseSpinlock = newApiReleaseSpinlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK, oldApiReleaseSpinlock, newApiReleaseSpinlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiReleaseSpinlock(Ticks newApiReleaseSpinlock) {
		if (newApiReleaseSpinlock != apiReleaseSpinlock) {
			NotificationChain msgs = null;
			if (apiReleaseSpinlock != null)
				msgs = ((InternalEObject)apiReleaseSpinlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK, null, msgs);
			if (newApiReleaseSpinlock != null)
				msgs = ((InternalEObject)newApiReleaseSpinlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK, null, msgs);
			msgs = basicSetApiReleaseSpinlock(newApiReleaseSpinlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK, newApiReleaseSpinlock, newApiReleaseSpinlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiSenderReceiverRead() {
		return apiSenderReceiverRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSenderReceiverRead(Ticks newApiSenderReceiverRead, NotificationChain msgs) {
		Ticks oldApiSenderReceiverRead = apiSenderReceiverRead;
		apiSenderReceiverRead = newApiSenderReceiverRead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ, oldApiSenderReceiverRead, newApiSenderReceiverRead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSenderReceiverRead(Ticks newApiSenderReceiverRead) {
		if (newApiSenderReceiverRead != apiSenderReceiverRead) {
			NotificationChain msgs = null;
			if (apiSenderReceiverRead != null)
				msgs = ((InternalEObject)apiSenderReceiverRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ, null, msgs);
			if (newApiSenderReceiverRead != null)
				msgs = ((InternalEObject)newApiSenderReceiverRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ, null, msgs);
			msgs = basicSetApiSenderReceiverRead(newApiSenderReceiverRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ, newApiSenderReceiverRead, newApiSenderReceiverRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiSenderReceiverWrite() {
		return apiSenderReceiverWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSenderReceiverWrite(Ticks newApiSenderReceiverWrite, NotificationChain msgs) {
		Ticks oldApiSenderReceiverWrite = apiSenderReceiverWrite;
		apiSenderReceiverWrite = newApiSenderReceiverWrite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE, oldApiSenderReceiverWrite, newApiSenderReceiverWrite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSenderReceiverWrite(Ticks newApiSenderReceiverWrite) {
		if (newApiSenderReceiverWrite != apiSenderReceiverWrite) {
			NotificationChain msgs = null;
			if (apiSenderReceiverWrite != null)
				msgs = ((InternalEObject)apiSenderReceiverWrite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE, null, msgs);
			if (newApiSenderReceiverWrite != null)
				msgs = ((InternalEObject)newApiSenderReceiverWrite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE, null, msgs);
			msgs = basicSetApiSenderReceiverWrite(newApiSenderReceiverWrite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE, newApiSenderReceiverWrite, newApiSenderReceiverWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiSynchronousServerCallPoint() {
		return apiSynchronousServerCallPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiSynchronousServerCallPoint(Ticks newApiSynchronousServerCallPoint, NotificationChain msgs) {
		Ticks oldApiSynchronousServerCallPoint = apiSynchronousServerCallPoint;
		apiSynchronousServerCallPoint = newApiSynchronousServerCallPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT, oldApiSynchronousServerCallPoint, newApiSynchronousServerCallPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiSynchronousServerCallPoint(Ticks newApiSynchronousServerCallPoint) {
		if (newApiSynchronousServerCallPoint != apiSynchronousServerCallPoint) {
			NotificationChain msgs = null;
			if (apiSynchronousServerCallPoint != null)
				msgs = ((InternalEObject)apiSynchronousServerCallPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT, null, msgs);
			if (newApiSynchronousServerCallPoint != null)
				msgs = ((InternalEObject)newApiSynchronousServerCallPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT, null, msgs);
			msgs = basicSetApiSynchronousServerCallPoint(newApiSynchronousServerCallPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT, newApiSynchronousServerCallPoint, newApiSynchronousServerCallPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiIocRead() {
		return apiIocRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiIocRead(Ticks newApiIocRead, NotificationChain msgs) {
		Ticks oldApiIocRead = apiIocRead;
		apiIocRead = newApiIocRead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ, oldApiIocRead, newApiIocRead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiIocRead(Ticks newApiIocRead) {
		if (newApiIocRead != apiIocRead) {
			NotificationChain msgs = null;
			if (apiIocRead != null)
				msgs = ((InternalEObject)apiIocRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ, null, msgs);
			if (newApiIocRead != null)
				msgs = ((InternalEObject)newApiIocRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ, null, msgs);
			msgs = basicSetApiIocRead(newApiIocRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ, newApiIocRead, newApiIocRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticks getApiIocWrite() {
		return apiIocWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApiIocWrite(Ticks newApiIocWrite, NotificationChain msgs) {
		Ticks oldApiIocWrite = apiIocWrite;
		apiIocWrite = newApiIocWrite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE, oldApiIocWrite, newApiIocWrite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiIocWrite(Ticks newApiIocWrite) {
		if (newApiIocWrite != apiIocWrite) {
			NotificationChain msgs = null;
			if (apiIocWrite != null)
				msgs = ((InternalEObject)apiIocWrite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE, null, msgs);
			if (newApiIocWrite != null)
				msgs = ((InternalEObject)newApiIocWrite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE, null, msgs);
			msgs = basicSetApiIocWrite(newApiIocWrite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE, newApiIocWrite, newApiIocWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE:
				return basicSetApiSendMessage(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK:
				return basicSetApiTerminateTask(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE:
				return basicSetApiSchedule(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE:
				return basicSetApiRequestResource(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE:
				return basicSetApiReleaseResource(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT:
				return basicSetApiSetEvent(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT:
				return basicSetApiWaitEvent(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT:
				return basicSetApiClearEvent(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK:
				return basicSetApiActivateTask(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION:
				return basicSetApiEnforcedMigration(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS:
				return basicSetApiSuspendOsInterrupts(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS:
				return basicSetApiResumeOsInterrupts(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK:
				return basicSetApiRequestSpinlock(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK:
				return basicSetApiReleaseSpinlock(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ:
				return basicSetApiSenderReceiverRead(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE:
				return basicSetApiSenderReceiverWrite(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT:
				return basicSetApiSynchronousServerCallPoint(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ:
				return basicSetApiIocRead(null, msgs);
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE:
				return basicSetApiIocWrite(null, msgs);
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
			case AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE:
				return getApiSendMessage();
			case AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK:
				return getApiTerminateTask();
			case AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE:
				return getApiSchedule();
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE:
				return getApiRequestResource();
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE:
				return getApiReleaseResource();
			case AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT:
				return getApiSetEvent();
			case AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT:
				return getApiWaitEvent();
			case AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT:
				return getApiClearEvent();
			case AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK:
				return getApiActivateTask();
			case AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION:
				return getApiEnforcedMigration();
			case AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS:
				return getApiSuspendOsInterrupts();
			case AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS:
				return getApiResumeOsInterrupts();
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK:
				return getApiRequestSpinlock();
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK:
				return getApiReleaseSpinlock();
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ:
				return getApiSenderReceiverRead();
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE:
				return getApiSenderReceiverWrite();
			case AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT:
				return getApiSynchronousServerCallPoint();
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ:
				return getApiIocRead();
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE:
				return getApiIocWrite();
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
			case AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE:
				setApiSendMessage((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK:
				setApiTerminateTask((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE:
				setApiSchedule((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE:
				setApiRequestResource((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE:
				setApiReleaseResource((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT:
				setApiSetEvent((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT:
				setApiWaitEvent((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT:
				setApiClearEvent((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK:
				setApiActivateTask((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION:
				setApiEnforcedMigration((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS:
				setApiSuspendOsInterrupts((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS:
				setApiResumeOsInterrupts((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK:
				setApiRequestSpinlock((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK:
				setApiReleaseSpinlock((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ:
				setApiSenderReceiverRead((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE:
				setApiSenderReceiverWrite((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT:
				setApiSynchronousServerCallPoint((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ:
				setApiIocRead((Ticks)newValue);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE:
				setApiIocWrite((Ticks)newValue);
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
			case AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE:
				setApiSendMessage((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK:
				setApiTerminateTask((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE:
				setApiSchedule((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE:
				setApiRequestResource((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE:
				setApiReleaseResource((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT:
				setApiSetEvent((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT:
				setApiWaitEvent((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT:
				setApiClearEvent((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK:
				setApiActivateTask((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION:
				setApiEnforcedMigration((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS:
				setApiSuspendOsInterrupts((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS:
				setApiResumeOsInterrupts((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK:
				setApiRequestSpinlock((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK:
				setApiReleaseSpinlock((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ:
				setApiSenderReceiverRead((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE:
				setApiSenderReceiverWrite((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT:
				setApiSynchronousServerCallPoint((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ:
				setApiIocRead((Ticks)null);
				return;
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE:
				setApiIocWrite((Ticks)null);
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
			case AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE:
				return apiSendMessage != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK:
				return apiTerminateTask != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE:
				return apiSchedule != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE:
				return apiRequestResource != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE:
				return apiReleaseResource != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT:
				return apiSetEvent != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT:
				return apiWaitEvent != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT:
				return apiClearEvent != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK:
				return apiActivateTask != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION:
				return apiEnforcedMigration != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS:
				return apiSuspendOsInterrupts != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS:
				return apiResumeOsInterrupts != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK:
				return apiRequestSpinlock != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK:
				return apiReleaseSpinlock != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ:
				return apiSenderReceiverRead != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE:
				return apiSenderReceiverWrite != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT:
				return apiSynchronousServerCallPoint != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ:
				return apiIocRead != null;
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE:
				return apiIocWrite != null;
		}
		return super.eIsSet(featureID);
	}

} //OsAPIOverheadImpl
