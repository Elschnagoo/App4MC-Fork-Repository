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
	 * @see #setApiSendMessage(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSendMessage()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiSendMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSendMessage <em>Api Send Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Send Message</em>' containment reference.
	 * @see #getApiSendMessage()
	 * @generated
	 */
	void setApiSendMessage(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Terminate Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Terminate Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Terminate Task</em>' containment reference.
	 * @see #setApiTerminateTask(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiTerminateTask()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiTerminateTask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiTerminateTask <em>Api Terminate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Terminate Task</em>' containment reference.
	 * @see #getApiTerminateTask()
	 * @generated
	 */
	void setApiTerminateTask(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Schedule</em>' containment reference.
	 * @see #setApiSchedule(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSchedule()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiSchedule();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSchedule <em>Api Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Schedule</em>' containment reference.
	 * @see #getApiSchedule()
	 * @generated
	 */
	void setApiSchedule(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Request Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Request Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Request Resource</em>' containment reference.
	 * @see #setApiRequestResource(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiRequestResource()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiRequestResource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiRequestResource <em>Api Request Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Request Resource</em>' containment reference.
	 * @see #getApiRequestResource()
	 * @generated
	 */
	void setApiRequestResource(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Release Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Release Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Release Resource</em>' containment reference.
	 * @see #setApiReleaseResource(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiReleaseResource()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiReleaseResource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiReleaseResource <em>Api Release Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Release Resource</em>' containment reference.
	 * @see #getApiReleaseResource()
	 * @generated
	 */
	void setApiReleaseResource(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Set Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Set Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Set Event</em>' containment reference.
	 * @see #setApiSetEvent(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSetEvent()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiSetEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSetEvent <em>Api Set Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Set Event</em>' containment reference.
	 * @see #getApiSetEvent()
	 * @generated
	 */
	void setApiSetEvent(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Wait Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Wait Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Wait Event</em>' containment reference.
	 * @see #setApiWaitEvent(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiWaitEvent()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiWaitEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiWaitEvent <em>Api Wait Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Wait Event</em>' containment reference.
	 * @see #getApiWaitEvent()
	 * @generated
	 */
	void setApiWaitEvent(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Clear Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Clear Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Clear Event</em>' containment reference.
	 * @see #setApiClearEvent(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiClearEvent()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiClearEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiClearEvent <em>Api Clear Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Clear Event</em>' containment reference.
	 * @see #getApiClearEvent()
	 * @generated
	 */
	void setApiClearEvent(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Activate Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Activate Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Activate Task</em>' containment reference.
	 * @see #setApiActivateTask(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiActivateTask()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiActivateTask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiActivateTask <em>Api Activate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Activate Task</em>' containment reference.
	 * @see #getApiActivateTask()
	 * @generated
	 */
	void setApiActivateTask(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Enforced Migration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Enforced Migration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Enforced Migration</em>' containment reference.
	 * @see #setApiEnforcedMigration(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiEnforcedMigration()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiEnforcedMigration();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiEnforcedMigration <em>Api Enforced Migration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Enforced Migration</em>' containment reference.
	 * @see #getApiEnforcedMigration()
	 * @generated
	 */
	void setApiEnforcedMigration(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Suspend Os Interrupts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Suspend Os Interrupts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Suspend Os Interrupts</em>' containment reference.
	 * @see #setApiSuspendOsInterrupts(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSuspendOsInterrupts()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiSuspendOsInterrupts();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSuspendOsInterrupts <em>Api Suspend Os Interrupts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Suspend Os Interrupts</em>' containment reference.
	 * @see #getApiSuspendOsInterrupts()
	 * @generated
	 */
	void setApiSuspendOsInterrupts(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Resume Os Interrupts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Resume Os Interrupts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Resume Os Interrupts</em>' containment reference.
	 * @see #setApiResumeOsInterrupts(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiResumeOsInterrupts()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiResumeOsInterrupts();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiResumeOsInterrupts <em>Api Resume Os Interrupts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Resume Os Interrupts</em>' containment reference.
	 * @see #getApiResumeOsInterrupts()
	 * @generated
	 */
	void setApiResumeOsInterrupts(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Request Spinlock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Request Spinlock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Request Spinlock</em>' containment reference.
	 * @see #setApiRequestSpinlock(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiRequestSpinlock()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiRequestSpinlock();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiRequestSpinlock <em>Api Request Spinlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Request Spinlock</em>' containment reference.
	 * @see #getApiRequestSpinlock()
	 * @generated
	 */
	void setApiRequestSpinlock(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Release Spinlock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Release Spinlock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Release Spinlock</em>' containment reference.
	 * @see #setApiReleaseSpinlock(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiReleaseSpinlock()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiReleaseSpinlock();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiReleaseSpinlock <em>Api Release Spinlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Release Spinlock</em>' containment reference.
	 * @see #getApiReleaseSpinlock()
	 * @generated
	 */
	void setApiReleaseSpinlock(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Sender Receiver Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Sender Receiver Read</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Sender Receiver Read</em>' containment reference.
	 * @see #setApiSenderReceiverRead(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSenderReceiverRead()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiSenderReceiverRead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSenderReceiverRead <em>Api Sender Receiver Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Sender Receiver Read</em>' containment reference.
	 * @see #getApiSenderReceiverRead()
	 * @generated
	 */
	void setApiSenderReceiverRead(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Sender Receiver Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Sender Receiver Write</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Sender Receiver Write</em>' containment reference.
	 * @see #setApiSenderReceiverWrite(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSenderReceiverWrite()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiSenderReceiverWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSenderReceiverWrite <em>Api Sender Receiver Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Sender Receiver Write</em>' containment reference.
	 * @see #getApiSenderReceiverWrite()
	 * @generated
	 */
	void setApiSenderReceiverWrite(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Synchronous Server Call Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Synchronous Server Call Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Synchronous Server Call Point</em>' containment reference.
	 * @see #setApiSynchronousServerCallPoint(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiSynchronousServerCallPoint()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiSynchronousServerCallPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiSynchronousServerCallPoint <em>Api Synchronous Server Call Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Synchronous Server Call Point</em>' containment reference.
	 * @see #getApiSynchronousServerCallPoint()
	 * @generated
	 */
	void setApiSynchronousServerCallPoint(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Ioc Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Ioc Read</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Ioc Read</em>' containment reference.
	 * @see #setApiIocRead(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiIocRead()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiIocRead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiIocRead <em>Api Ioc Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Ioc Read</em>' containment reference.
	 * @see #getApiIocRead()
	 * @generated
	 */
	void setApiIocRead(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Api Ioc Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Ioc Write</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Ioc Write</em>' containment reference.
	 * @see #setApiIocWrite(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIOverhead_ApiIocWrite()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getApiIocWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead#getApiIocWrite <em>Api Ioc Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Ioc Write</em>' containment reference.
	 * @see #getApiIocWrite()
	 * @generated
	 */
	void setApiIocWrite(ExecutionTicks value);

} // OsAPIOverhead