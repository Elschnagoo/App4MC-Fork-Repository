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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Process Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The types of a process event
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessEventType()
 * @model
 * @generated
 */
public enum ProcessEventType implements Enumerator {
	/**
	 * The '<em><b>all </b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_ALL__VALUE
	 * @generated
	 * @ordered
	 */
	_ALL_(0, "_all_", "_all_"),

	/**
	 * The '<em><b>Activate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATE(0, "activate", "activate"),

	/**
	 * The '<em><b>Deadline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEADLINE_VALUE
	 * @generated
	 * @ordered
	 */
	DEADLINE(0, "deadline", "deadline"),

	/**
	 * The '<em><b>Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_VALUE
	 * @generated
	 * @ordered
	 */
	START(0, "start", "start"),

	/**
	 * The '<em><b>Resume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESUME_VALUE
	 * @generated
	 * @ordered
	 */
	RESUME(0, "resume", "resume"),

	/**
	 * The '<em><b>Preempt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREEMPT_VALUE
	 * @generated
	 * @ordered
	 */
	PREEMPT(0, "preempt", "preempt"),

	/**
	 * The '<em><b>Poll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLL_VALUE
	 * @generated
	 * @ordered
	 */
	POLL(0, "poll", "poll"),

	/**
	 * The '<em><b>Run</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUN_VALUE
	 * @generated
	 * @ordered
	 */
	RUN(0, "run", "run"),

	/**
	 * The '<em><b>Wait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_VALUE
	 * @generated
	 * @ordered
	 */
	WAIT(0, "wait", "wait"),

	/**
	 * The '<em><b>Poll parking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLL_PARKING_VALUE
	 * @generated
	 * @ordered
	 */
	POLL_PARKING(0, "poll_parking", "poll_parking"),

	/**
	 * The '<em><b>Park</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARK_VALUE
	 * @generated
	 * @ordered
	 */
	PARK(0, "park", "park"),

	/**
	 * The '<em><b>Release parking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_PARKING_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE_PARKING(0, "release_parking", "release_parking"),

	/**
	 * The '<em><b>Release</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE(0, "release", "release"),

	/**
	 * The '<em><b>Terminate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATE_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINATE(0, "terminate", "terminate");

	/**
	 * The '<em><b>all </b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>all </b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_ALL_
	 * @model name="_all_"
	 * @generated
	 * @ordered
	 */
	public static final int _ALL__VALUE = 0;

	/**
	 * The '<em><b>Activate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE
	 * @model name="activate"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATE_VALUE = 0;

	/**
	 * The '<em><b>Deadline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deadline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEADLINE
	 * @model name="deadline"
	 * @generated
	 * @ordered
	 */
	public static final int DEADLINE_VALUE = 0;

	/**
	 * The '<em><b>Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START
	 * @model name="start"
	 * @generated
	 * @ordered
	 */
	public static final int START_VALUE = 0;

	/**
	 * The '<em><b>Resume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESUME
	 * @model name="resume"
	 * @generated
	 * @ordered
	 */
	public static final int RESUME_VALUE = 0;

	/**
	 * The '<em><b>Preempt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preempt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREEMPT
	 * @model name="preempt"
	 * @generated
	 * @ordered
	 */
	public static final int PREEMPT_VALUE = 0;

	/**
	 * The '<em><b>Poll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poll</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLL
	 * @model name="poll"
	 * @generated
	 * @ordered
	 */
	public static final int POLL_VALUE = 0;

	/**
	 * The '<em><b>Run</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Run</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUN
	 * @model name="run"
	 * @generated
	 * @ordered
	 */
	public static final int RUN_VALUE = 0;

	/**
	 * The '<em><b>Wait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAIT
	 * @model name="wait"
	 * @generated
	 * @ordered
	 */
	public static final int WAIT_VALUE = 0;

	/**
	 * The '<em><b>Poll parking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poll parking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLL_PARKING
	 * @model name="poll_parking"
	 * @generated
	 * @ordered
	 */
	public static final int POLL_PARKING_VALUE = 0;

	/**
	 * The '<em><b>Park</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Park</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARK
	 * @model name="park"
	 * @generated
	 * @ordered
	 */
	public static final int PARK_VALUE = 0;

	/**
	 * The '<em><b>Release parking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Release parking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELEASE_PARKING
	 * @model name="release_parking"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_PARKING_VALUE = 0;

	/**
	 * The '<em><b>Release</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Release</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELEASE
	 * @model name="release"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_VALUE = 0;

	/**
	 * The '<em><b>Terminate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Terminate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMINATE
	 * @model name="terminate"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Process Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessEventType[] VALUES_ARRAY =
		new ProcessEventType[] {
			_ALL_,
			ACTIVATE,
			DEADLINE,
			START,
			RESUME,
			PREEMPT,
			POLL,
			RUN,
			WAIT,
			POLL_PARKING,
			PARK,
			RELEASE_PARKING,
			RELEASE,
			TERMINATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Process Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Process Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Process Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Process Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessEventType get(int value) {
		switch (value) {
			case _ALL__VALUE: return _ALL_;
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
	private ProcessEventType(int value, String name, String literal) {
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
	
} //ProcessEventType
