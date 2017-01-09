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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os API Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSendMessage <em>Api Send Message</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiTerminateTask <em>Api Terminate Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSchedule <em>Api Schedule</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiRequestResource <em>Api Request Resource</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiReleaseResource <em>Api Release Resource</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSetEvent <em>Api Set Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiWaitEvent <em>Api Wait Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiClearEvent <em>Api Clear Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiActivateTask <em>Api Activate Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiEnforcedMigration <em>Api Enforced Migration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions()
 * @model
 * @generated
 */
public interface OsAPIInstructions extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Api Send Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Send Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Send Message</em>' containment reference.
	 * @see #setApiSendMessage(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiSendMessage()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiSendMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSendMessage <em>Api Send Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Send Message</em>' containment reference.
	 * @see #getApiSendMessage()
	 * @generated
	 */
	void setApiSendMessage(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Terminate Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Terminate Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Terminate Task</em>' containment reference.
	 * @see #setApiTerminateTask(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiTerminateTask()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiTerminateTask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiTerminateTask <em>Api Terminate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Terminate Task</em>' containment reference.
	 * @see #getApiTerminateTask()
	 * @generated
	 */
	void setApiTerminateTask(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Schedule</em>' containment reference.
	 * @see #setApiSchedule(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiSchedule()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiSchedule();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSchedule <em>Api Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Schedule</em>' containment reference.
	 * @see #getApiSchedule()
	 * @generated
	 */
	void setApiSchedule(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Request Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Request Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Request Resource</em>' containment reference.
	 * @see #setApiRequestResource(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiRequestResource()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiRequestResource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiRequestResource <em>Api Request Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Request Resource</em>' containment reference.
	 * @see #getApiRequestResource()
	 * @generated
	 */
	void setApiRequestResource(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Release Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Release Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Release Resource</em>' containment reference.
	 * @see #setApiReleaseResource(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiReleaseResource()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiReleaseResource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiReleaseResource <em>Api Release Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Release Resource</em>' containment reference.
	 * @see #getApiReleaseResource()
	 * @generated
	 */
	void setApiReleaseResource(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Set Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Set Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Set Event</em>' containment reference.
	 * @see #setApiSetEvent(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiSetEvent()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiSetEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSetEvent <em>Api Set Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Set Event</em>' containment reference.
	 * @see #getApiSetEvent()
	 * @generated
	 */
	void setApiSetEvent(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Wait Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Wait Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Wait Event</em>' containment reference.
	 * @see #setApiWaitEvent(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiWaitEvent()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiWaitEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiWaitEvent <em>Api Wait Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Wait Event</em>' containment reference.
	 * @see #getApiWaitEvent()
	 * @generated
	 */
	void setApiWaitEvent(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Clear Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Clear Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Clear Event</em>' containment reference.
	 * @see #setApiClearEvent(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiClearEvent()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiClearEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiClearEvent <em>Api Clear Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Clear Event</em>' containment reference.
	 * @see #getApiClearEvent()
	 * @generated
	 */
	void setApiClearEvent(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Activate Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Activate Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Activate Task</em>' containment reference.
	 * @see #setApiActivateTask(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiActivateTask()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiActivateTask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiActivateTask <em>Api Activate Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Activate Task</em>' containment reference.
	 * @see #getApiActivateTask()
	 * @generated
	 */
	void setApiActivateTask(Instructions value);

	/**
	 * Returns the value of the '<em><b>Api Enforced Migration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Enforced Migration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Enforced Migration</em>' containment reference.
	 * @see #setApiEnforcedMigration(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsAPIInstructions_ApiEnforcedMigration()
	 * @model containment="true"
	 * @generated
	 */
	Instructions getApiEnforcedMigration();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiEnforcedMigration <em>Api Enforced Migration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Enforced Migration</em>' containment reference.
	 * @see #getApiEnforcedMigration()
	 * @generated
	 */
	void setApiEnforcedMigration(Instructions value);

} // OsAPIInstructions
