/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *     Generated using Eclipse EMF
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.ot1.OT1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Diese Enumeration listet alle EventTypen auf.
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventTypeEnum()
 * @model extendedMetaData="name='EventTypeEnum'"
 * @generated
 */
public enum EventTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Sched Activation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_ACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_ACTIVATION(0, "schedActivation", "sched_activation"),

	/**
	 * The '<em><b>Sched Activation Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_ACTIVATION_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_ACTIVATION_FAILED(1, "schedActivationFailed", "sched_activationFailed"),

	/**
	 * The '<em><b>Sched Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_START_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_START(2, "schedStart", "sched_start"),

	/**
	 * The '<em><b>Sched Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_STOP(3, "schedStop", "sched_stop"),

	/**
	 * The '<em><b>Sched Wait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_WAIT_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_WAIT(4, "schedWait", "sched_wait"),

	/**
	 * The '<em><b>Sched Release</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_RELEASE_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_RELEASE(5, "schedRelease", "sched_release"),

	/**
	 * The '<em><b>Sched Preempt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_PREEMPT_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_PREEMPT(6, "schedPreempt", "sched_preempt"),

	/**
	 * The '<em><b>Sched Resume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_RESUME_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_RESUME(7, "schedResume", "sched_resume"),

	/**
	 * The '<em><b>Sched Terminate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHED_TERMINATE_VALUE
	 * @generated
	 * @ordered
	 */
	SCHED_TERMINATE(8, "schedTerminate", "sched_terminate"),

	/**
	 * The '<em><b>Runnable Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNABLE_START_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNABLE_START(9, "runnableStart", "runnable_start"),

	/**
	 * The '<em><b>Runnable Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNABLE_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNABLE_STOP(10, "runnableStop", "runnable_stop"),

	/**
	 * The '<em><b>Timestamp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP(11, "timestamp", "timestamp"),

	/**
	 * The '<em><b>Timestamp Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP_DATA(12, "timestampData", "timestamp_data"),

	/**
	 * The '<em><b>Timerange Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMERANGE_START_VALUE
	 * @generated
	 * @ordered
	 */
	TIMERANGE_START(13, "timerangeStart", "timerange_start"),

	/**
	 * The '<em><b>Timerange Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMERANGE_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMERANGE_STOP(14, "timerangeStop", "timerange_stop"),

	/**
	 * The '<em><b>Function Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_START_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_START(15, "functionStart", "function_start"),

	/**
	 * The '<em><b>Function Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_STOP(16, "functionStop", "function_stop"),

	/**
	 * The '<em><b>Codeblock Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEBLOCK_START_VALUE
	 * @generated
	 * @ordered
	 */
	CODEBLOCK_START(17, "codeblockStart", "codeblock_start"),

	/**
	 * The '<em><b>Codeblock Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEBLOCK_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	CODEBLOCK_STOP(18, "codeblockStop", "codeblock_stop"),

	/**
	 * The '<em><b>Pdu Transmit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDU_TRANSMIT_VALUE
	 * @generated
	 * @ordered
	 */
	PDU_TRANSMIT(19, "pduTransmit", "pdu_transmit"),

	/**
	 * The '<em><b>Pdu Receive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDU_RECEIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PDU_RECEIVE(20, "pduReceive", "pdu_receive"),

	/**
	 * The '<em><b>Sig Transmit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIG_TRANSMIT_VALUE
	 * @generated
	 * @ordered
	 */
	SIG_TRANSMIT(21, "sigTransmit", "sig_transmit"),

	/**
	 * The '<em><b>Sig Receive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIG_RECEIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SIG_RECEIVE(22, "sigReceive", "sig_receive"),

	/**
	 * The '<em><b>Frame Transmit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_TRANSMIT_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_TRANSMIT(23, "frameTransmit", "frame_transmit"),

	/**
	 * The '<em><b>Frame Receive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_RECEIVE_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME_RECEIVE(24, "frameReceive", "frame_receive"),

	/**
	 * The '<em><b>Msg Transmit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_TRANSMIT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_TRANSMIT(25, "msgTransmit", "msg_transmit"),

	/**
	 * The '<em><b>Msg Receive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_RECEIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_RECEIVE(26, "msgReceive", "msg_receive"),

	/**
	 * The '<em><b>Sync</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNC_VALUE
	 * @generated
	 * @ordered
	 */
	SYNC(27, "sync", "sync"),

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(28, "error", "error");

	/**
	 * The '<em><b>Sched Activation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Activation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_ACTIVATION
	 * @model name="schedActivation" literal="sched_activation"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_ACTIVATION_VALUE = 0;

	/**
	 * The '<em><b>Sched Activation Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Activation Failed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_ACTIVATION_FAILED
	 * @model name="schedActivationFailed" literal="sched_activationFailed"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_ACTIVATION_FAILED_VALUE = 1;

	/**
	 * The '<em><b>Sched Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_START
	 * @model name="schedStart" literal="sched_start"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_START_VALUE = 2;

	/**
	 * The '<em><b>Sched Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_STOP
	 * @model name="schedStop" literal="sched_stop"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_STOP_VALUE = 3;

	/**
	 * The '<em><b>Sched Wait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Wait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_WAIT
	 * @model name="schedWait" literal="sched_wait"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_WAIT_VALUE = 4;

	/**
	 * The '<em><b>Sched Release</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Release</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_RELEASE
	 * @model name="schedRelease" literal="sched_release"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_RELEASE_VALUE = 5;

	/**
	 * The '<em><b>Sched Preempt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Preempt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_PREEMPT
	 * @model name="schedPreempt" literal="sched_preempt"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_PREEMPT_VALUE = 6;

	/**
	 * The '<em><b>Sched Resume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Resume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_RESUME
	 * @model name="schedResume" literal="sched_resume"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_RESUME_VALUE = 7;

	/**
	 * The '<em><b>Sched Terminate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sched Terminate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHED_TERMINATE
	 * @model name="schedTerminate" literal="sched_terminate"
	 * @generated
	 * @ordered
	 */
	public static final int SCHED_TERMINATE_VALUE = 8;

	/**
	 * The '<em><b>Runnable Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Runnable Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNNABLE_START
	 * @model name="runnableStart" literal="runnable_start"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNABLE_START_VALUE = 9;

	/**
	 * The '<em><b>Runnable Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Runnable Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNNABLE_STOP
	 * @model name="runnableStop" literal="runnable_stop"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNABLE_STOP_VALUE = 10;

	/**
	 * The '<em><b>Timestamp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timestamp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @model name="timestamp"
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_VALUE = 11;

	/**
	 * The '<em><b>Timestamp Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timestamp Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_DATA
	 * @model name="timestampData" literal="timestamp_data"
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_DATA_VALUE = 12;

	/**
	 * The '<em><b>Timerange Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timerange Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMERANGE_START
	 * @model name="timerangeStart" literal="timerange_start"
	 * @generated
	 * @ordered
	 */
	public static final int TIMERANGE_START_VALUE = 13;

	/**
	 * The '<em><b>Timerange Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timerange Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMERANGE_STOP
	 * @model name="timerangeStop" literal="timerange_stop"
	 * @generated
	 * @ordered
	 */
	public static final int TIMERANGE_STOP_VALUE = 14;

	/**
	 * The '<em><b>Function Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_START
	 * @model name="functionStart" literal="function_start"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_START_VALUE = 15;

	/**
	 * The '<em><b>Function Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_STOP
	 * @model name="functionStop" literal="function_stop"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_STOP_VALUE = 16;

	/**
	 * The '<em><b>Codeblock Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Codeblock Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODEBLOCK_START
	 * @model name="codeblockStart" literal="codeblock_start"
	 * @generated
	 * @ordered
	 */
	public static final int CODEBLOCK_START_VALUE = 17;

	/**
	 * The '<em><b>Codeblock Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Codeblock Stop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODEBLOCK_STOP
	 * @model name="codeblockStop" literal="codeblock_stop"
	 * @generated
	 * @ordered
	 */
	public static final int CODEBLOCK_STOP_VALUE = 18;

	/**
	 * The '<em><b>Pdu Transmit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pdu Transmit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDU_TRANSMIT
	 * @model name="pduTransmit" literal="pdu_transmit"
	 * @generated
	 * @ordered
	 */
	public static final int PDU_TRANSMIT_VALUE = 19;

	/**
	 * The '<em><b>Pdu Receive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pdu Receive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDU_RECEIVE
	 * @model name="pduReceive" literal="pdu_receive"
	 * @generated
	 * @ordered
	 */
	public static final int PDU_RECEIVE_VALUE = 20;

	/**
	 * The '<em><b>Sig Transmit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sig Transmit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIG_TRANSMIT
	 * @model name="sigTransmit" literal="sig_transmit"
	 * @generated
	 * @ordered
	 */
	public static final int SIG_TRANSMIT_VALUE = 21;

	/**
	 * The '<em><b>Sig Receive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sig Receive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIG_RECEIVE
	 * @model name="sigReceive" literal="sig_receive"
	 * @generated
	 * @ordered
	 */
	public static final int SIG_RECEIVE_VALUE = 22;

	/**
	 * The '<em><b>Frame Transmit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frame Transmit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME_TRANSMIT
	 * @model name="frameTransmit" literal="frame_transmit"
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_TRANSMIT_VALUE = 23;

	/**
	 * The '<em><b>Frame Receive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frame Receive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME_RECEIVE
	 * @model name="frameReceive" literal="frame_receive"
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_RECEIVE_VALUE = 24;

	/**
	 * The '<em><b>Msg Transmit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Transmit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_TRANSMIT
	 * @model name="msgTransmit" literal="msg_transmit"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_TRANSMIT_VALUE = 25;

	/**
	 * The '<em><b>Msg Receive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Receive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_RECEIVE
	 * @model name="msgReceive" literal="msg_receive"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_RECEIVE_VALUE = 26;

	/**
	 * The '<em><b>Sync</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sync</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNC
	 * @model name="sync"
	 * @generated
	 * @ordered
	 */
	public static final int SYNC_VALUE = 27;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 28;

	/**
	 * An array of all the '<em><b>Event Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventTypeEnum[] VALUES_ARRAY =
		new EventTypeEnum[] {
			SCHED_ACTIVATION,
			SCHED_ACTIVATION_FAILED,
			SCHED_START,
			SCHED_STOP,
			SCHED_WAIT,
			SCHED_RELEASE,
			SCHED_PREEMPT,
			SCHED_RESUME,
			SCHED_TERMINATE,
			RUNNABLE_START,
			RUNNABLE_STOP,
			TIMESTAMP,
			TIMESTAMP_DATA,
			TIMERANGE_START,
			TIMERANGE_STOP,
			FUNCTION_START,
			FUNCTION_STOP,
			CODEBLOCK_START,
			CODEBLOCK_STOP,
			PDU_TRANSMIT,
			PDU_RECEIVE,
			SIG_TRANSMIT,
			SIG_RECEIVE,
			FRAME_TRANSMIT,
			FRAME_RECEIVE,
			MSG_TRANSMIT,
			MSG_RECEIVE,
			SYNC,
			ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTypeEnum get(int value) {
		switch (value) {
			case SCHED_ACTIVATION_VALUE: return SCHED_ACTIVATION;
			case SCHED_ACTIVATION_FAILED_VALUE: return SCHED_ACTIVATION_FAILED;
			case SCHED_START_VALUE: return SCHED_START;
			case SCHED_STOP_VALUE: return SCHED_STOP;
			case SCHED_WAIT_VALUE: return SCHED_WAIT;
			case SCHED_RELEASE_VALUE: return SCHED_RELEASE;
			case SCHED_PREEMPT_VALUE: return SCHED_PREEMPT;
			case SCHED_RESUME_VALUE: return SCHED_RESUME;
			case SCHED_TERMINATE_VALUE: return SCHED_TERMINATE;
			case RUNNABLE_START_VALUE: return RUNNABLE_START;
			case RUNNABLE_STOP_VALUE: return RUNNABLE_STOP;
			case TIMESTAMP_VALUE: return TIMESTAMP;
			case TIMESTAMP_DATA_VALUE: return TIMESTAMP_DATA;
			case TIMERANGE_START_VALUE: return TIMERANGE_START;
			case TIMERANGE_STOP_VALUE: return TIMERANGE_STOP;
			case FUNCTION_START_VALUE: return FUNCTION_START;
			case FUNCTION_STOP_VALUE: return FUNCTION_STOP;
			case CODEBLOCK_START_VALUE: return CODEBLOCK_START;
			case CODEBLOCK_STOP_VALUE: return CODEBLOCK_STOP;
			case PDU_TRANSMIT_VALUE: return PDU_TRANSMIT;
			case PDU_RECEIVE_VALUE: return PDU_RECEIVE;
			case SIG_TRANSMIT_VALUE: return SIG_TRANSMIT;
			case SIG_RECEIVE_VALUE: return SIG_RECEIVE;
			case FRAME_TRANSMIT_VALUE: return FRAME_TRANSMIT;
			case FRAME_RECEIVE_VALUE: return FRAME_RECEIVE;
			case MSG_TRANSMIT_VALUE: return MSG_TRANSMIT;
			case MSG_RECEIVE_VALUE: return MSG_RECEIVE;
			case SYNC_VALUE: return SYNC;
			case ERROR_VALUE: return ERROR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EventTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EventTypeEnum
