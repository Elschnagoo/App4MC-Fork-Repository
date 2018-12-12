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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os API Overhead</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSendMessage <em>Api Send Message</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiTerminateTask <em>Api Terminate Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSchedule <em>Api Schedule</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiRequestResource <em>Api Request Resource</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiReleaseResource <em>Api Release Resource</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSetEvent <em>Api Set Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiWaitEvent <em>Api Wait Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiClearEvent <em>Api Clear Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiActivateTask <em>Api Activate Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiEnforcedMigration <em>Api Enforced Migration</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSuspendOsInterrupts <em>Api Suspend Os Interrupts</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiResumeOsInterrupts <em>Api Resume Os Interrupts</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiRequestSpinlock <em>Api Request Spinlock</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiReleaseSpinlock <em>Api Release Spinlock</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSenderReceiverRead <em>Api Sender Receiver Read</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSenderReceiverWrite <em>Api Sender Receiver Write</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSynchronousServerCallPoint <em>Api Synchronous Server Call Point</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiIocRead <em>Api Ioc Read</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiIocWrite <em>Api Ioc Write</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead()
 * @model
 * @generated
 */
public interface OsAPIOverhead extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Api Send Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Send Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Send Message</em>' containment reference.
	 * @see #setApiSendMessage(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSendMessage()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiSendMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSendMessage <em>Api Send Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Send Message</em>' containment reference.
	 * @see #getApiSendMessage()
	 * @generated
	 */
	void setApiSendMessage(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Terminate Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Terminate Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Terminate Task</em>' containment reference.
	 * @see #setApiTerminateTask(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiTerminateTask()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiTerminateTask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiTerminateTask <em>Api Terminate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Terminate Task</em>' containment reference.
	 * @see #getApiTerminateTask()
	 * @generated
	 */
	void setApiTerminateTask(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Schedule</em>' containment reference.
	 * @see #setApiSchedule(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSchedule()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiSchedule();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSchedule <em>Api Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Schedule</em>' containment reference.
	 * @see #getApiSchedule()
	 * @generated
	 */
	void setApiSchedule(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Request Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Request Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Request Resource</em>' containment reference.
	 * @see #setApiRequestResource(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiRequestResource()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiRequestResource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiRequestResource <em>Api Request Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Request Resource</em>' containment reference.
	 * @see #getApiRequestResource()
	 * @generated
	 */
	void setApiRequestResource(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Release Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Release Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Release Resource</em>' containment reference.
	 * @see #setApiReleaseResource(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiReleaseResource()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiReleaseResource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiReleaseResource <em>Api Release Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Release Resource</em>' containment reference.
	 * @see #getApiReleaseResource()
	 * @generated
	 */
	void setApiReleaseResource(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Set Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Set Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Set Event</em>' containment reference.
	 * @see #setApiSetEvent(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSetEvent()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiSetEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSetEvent <em>Api Set Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Set Event</em>' containment reference.
	 * @see #getApiSetEvent()
	 * @generated
	 */
	void setApiSetEvent(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Wait Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Wait Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Wait Event</em>' containment reference.
	 * @see #setApiWaitEvent(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiWaitEvent()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiWaitEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiWaitEvent <em>Api Wait Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Wait Event</em>' containment reference.
	 * @see #getApiWaitEvent()
	 * @generated
	 */
	void setApiWaitEvent(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Clear Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Clear Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Clear Event</em>' containment reference.
	 * @see #setApiClearEvent(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiClearEvent()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiClearEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiClearEvent <em>Api Clear Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Clear Event</em>' containment reference.
	 * @see #getApiClearEvent()
	 * @generated
	 */
	void setApiClearEvent(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Activate Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Activate Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Activate Task</em>' containment reference.
	 * @see #setApiActivateTask(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiActivateTask()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiActivateTask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiActivateTask <em>Api Activate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Activate Task</em>' containment reference.
	 * @see #getApiActivateTask()
	 * @generated
	 */
	void setApiActivateTask(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Enforced Migration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Enforced Migration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Enforced Migration</em>' containment reference.
	 * @see #setApiEnforcedMigration(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiEnforcedMigration()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiEnforcedMigration();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiEnforcedMigration <em>Api Enforced Migration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Enforced Migration</em>' containment reference.
	 * @see #getApiEnforcedMigration()
	 * @generated
	 */
	void setApiEnforcedMigration(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Suspend Os Interrupts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Suspend Os Interrupts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Suspend Os Interrupts</em>' containment reference.
	 * @see #setApiSuspendOsInterrupts(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSuspendOsInterrupts()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiSuspendOsInterrupts();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSuspendOsInterrupts <em>Api Suspend Os Interrupts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Suspend Os Interrupts</em>' containment reference.
	 * @see #getApiSuspendOsInterrupts()
	 * @generated
	 */
	void setApiSuspendOsInterrupts(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Resume Os Interrupts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Resume Os Interrupts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Resume Os Interrupts</em>' containment reference.
	 * @see #setApiResumeOsInterrupts(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiResumeOsInterrupts()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiResumeOsInterrupts();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiResumeOsInterrupts <em>Api Resume Os Interrupts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Resume Os Interrupts</em>' containment reference.
	 * @see #getApiResumeOsInterrupts()
	 * @generated
	 */
	void setApiResumeOsInterrupts(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Request Spinlock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Request Spinlock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Request Spinlock</em>' containment reference.
	 * @see #setApiRequestSpinlock(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiRequestSpinlock()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiRequestSpinlock();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiRequestSpinlock <em>Api Request Spinlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Request Spinlock</em>' containment reference.
	 * @see #getApiRequestSpinlock()
	 * @generated
	 */
	void setApiRequestSpinlock(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Release Spinlock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Release Spinlock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Release Spinlock</em>' containment reference.
	 * @see #setApiReleaseSpinlock(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiReleaseSpinlock()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiReleaseSpinlock();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiReleaseSpinlock <em>Api Release Spinlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Release Spinlock</em>' containment reference.
	 * @see #getApiReleaseSpinlock()
	 * @generated
	 */
	void setApiReleaseSpinlock(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Sender Receiver Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Sender Receiver Read</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Sender Receiver Read</em>' containment reference.
	 * @see #setApiSenderReceiverRead(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSenderReceiverRead()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiSenderReceiverRead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSenderReceiverRead <em>Api Sender Receiver Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Sender Receiver Read</em>' containment reference.
	 * @see #getApiSenderReceiverRead()
	 * @generated
	 */
	void setApiSenderReceiverRead(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Sender Receiver Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Sender Receiver Write</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Sender Receiver Write</em>' containment reference.
	 * @see #setApiSenderReceiverWrite(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSenderReceiverWrite()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiSenderReceiverWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSenderReceiverWrite <em>Api Sender Receiver Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Sender Receiver Write</em>' containment reference.
	 * @see #getApiSenderReceiverWrite()
	 * @generated
	 */
	void setApiSenderReceiverWrite(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Synchronous Server Call Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Synchronous Server Call Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Synchronous Server Call Point</em>' containment reference.
	 * @see #setApiSynchronousServerCallPoint(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSynchronousServerCallPoint()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiSynchronousServerCallPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSynchronousServerCallPoint <em>Api Synchronous Server Call Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Synchronous Server Call Point</em>' containment reference.
	 * @see #getApiSynchronousServerCallPoint()
	 * @generated
	 */
	void setApiSynchronousServerCallPoint(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Ioc Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Ioc Read</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Ioc Read</em>' containment reference.
	 * @see #setApiIocRead(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiIocRead()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiIocRead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiIocRead <em>Api Ioc Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Ioc Read</em>' containment reference.
	 * @see #getApiIocRead()
	 * @generated
	 */
	void setApiIocRead(Ticks value);

	/**
	 * Returns the value of the '<em><b>Api Ioc Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Ioc Write</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Ioc Write</em>' containment reference.
	 * @see #setApiIocWrite(Ticks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiIocWrite()
	 * @model containment="true"
	 * @generated
	 */
	Ticks getApiIocWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiIocWrite <em>Api Ioc Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Ioc Write</em>' containment reference.
	 * @see #getApiIocWrite()
	 * @generated
	 */
	void setApiIocWrite(Ticks value);

} // OsAPIOverhead
