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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CPU Percentage Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCPUPercentageMetric()
 * @model
 * @generated
 */
public enum CPUPercentageMetric implements Enumerator {
	/**
	 * The '<em><b>undefined </b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_UNDEFINED__VALUE
	 * @generated
	 * @ordered
	 */
	_UNDEFINED_(0, "_undefined_", "_undefined_"),

	/**
	 * The '<em><b>CPU Buffering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_BUFFERING_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_BUFFERING(0, "CPUBuffering", "CPUBuffering"),

	/**
	 * The '<em><b>CPU Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_LOAD(0, "CPULoad", "CPULoad"),

	/**
	 * The '<em><b>CPU Parking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_PARKING_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_PARKING(0, "CPUParking", "CPUParking"),

	/**
	 * The '<em><b>CPU Polling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_POLLING_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_POLLING(0, "CPUPolling", "CPUPolling"),

	/**
	 * The '<em><b>CPU Ready</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_READY_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_READY(0, "CPUReady", "CPUReady"),

	/**
	 * The '<em><b>CPU Running</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_RUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_RUNNING(0, "CPURunning", "CPURunning"),

	/**
	 * The '<em><b>CPU Waiting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_WAITING(0, "CPUWaiting", "CPUWaiting");

	/**
	 * The '<em><b>undefined </b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>undefined </b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_UNDEFINED_
	 * @model name="_undefined_"
	 * @generated
	 * @ordered
	 */
	public static final int _UNDEFINED__VALUE = 0;

	/**
	 * The '<em><b>CPU Buffering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU Buffering</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_BUFFERING
	 * @model name="CPUBuffering"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_BUFFERING_VALUE = 0;

	/**
	 * The '<em><b>CPU Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_LOAD
	 * @model name="CPULoad"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_LOAD_VALUE = 0;

	/**
	 * The '<em><b>CPU Parking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU Parking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_PARKING
	 * @model name="CPUParking"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_PARKING_VALUE = 0;

	/**
	 * The '<em><b>CPU Polling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU Polling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_POLLING
	 * @model name="CPUPolling"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_POLLING_VALUE = 0;

	/**
	 * The '<em><b>CPU Ready</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU Ready</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_READY
	 * @model name="CPUReady"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_READY_VALUE = 0;

	/**
	 * The '<em><b>CPU Running</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU Running</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_RUNNING
	 * @model name="CPURunning"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_RUNNING_VALUE = 0;

	/**
	 * The '<em><b>CPU Waiting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU Waiting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_WAITING
	 * @model name="CPUWaiting"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_WAITING_VALUE = 0;

	/**
	 * An array of all the '<em><b>CPU Percentage Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CPUPercentageMetric[] VALUES_ARRAY =
		new CPUPercentageMetric[] {
			_UNDEFINED_,
			CPU_BUFFERING,
			CPU_LOAD,
			CPU_PARKING,
			CPU_POLLING,
			CPU_READY,
			CPU_RUNNING,
			CPU_WAITING,
		};

	/**
	 * A public read-only list of all the '<em><b>CPU Percentage Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CPUPercentageMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CPU Percentage Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPUPercentageMetric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPUPercentageMetric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPU Percentage Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPUPercentageMetric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPUPercentageMetric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPU Percentage Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPUPercentageMetric get(int value) {
		switch (value) {
			case _UNDEFINED__VALUE: return _UNDEFINED_;
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
	private CPUPercentageMetric(int value, String name, String literal) {
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
	
} //CPUPercentageMetric
