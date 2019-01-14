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
package org.eclipse.app4mc.amalthea.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Percentage Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPercentageMetric()
 * @model
 * @generated
 */
public enum PercentageMetric implements Enumerator {
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
	 * The '<em><b>Cache Hit Ratio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CACHE_HIT_RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	CACHE_HIT_RATIO(0, "CacheHitRatio", "CacheHitRatio"),

	/**
	 * The '<em><b>Cache Miss Ratio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CACHE_MISS_RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	CACHE_MISS_RATIO(0, "CacheMissRatio", "CacheMissRatio"),

	/**
	 * The '<em><b>Core Execution Time Relative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_EXECUTION_TIME_RELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_EXECUTION_TIME_RELATIVE(0, "CoreExecutionTimeRelative", "CoreExecutionTimeRelative"),

	/**
	 * The '<em><b>Memory Access Time Relative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_ACCESS_TIME_RELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_ACCESS_TIME_RELATIVE(0, "MemoryAccessTimeRelative", "MemoryAccessTimeRelative"),

	/**
	 * The '<em><b>Normalized Lateness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_LATENESS_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALIZED_LATENESS(0, "NormalizedLateness", "NormalizedLateness"),

	/**
	 * The '<em><b>Normalized Response Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_RESPONSE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALIZED_RESPONSE_TIME(0, "NormalizedResponseTime", "NormalizedResponseTime"),

	/**
	 * The '<em><b>Os Overhead Relative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_OVERHEAD_RELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	OS_OVERHEAD_RELATIVE(0, "OsOverheadRelative", "OsOverheadRelative");

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
	 * The '<em><b>Cache Hit Ratio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cache Hit Ratio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CACHE_HIT_RATIO
	 * @model name="CacheHitRatio"
	 * @generated
	 * @ordered
	 */
	public static final int CACHE_HIT_RATIO_VALUE = 0;

	/**
	 * The '<em><b>Cache Miss Ratio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cache Miss Ratio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CACHE_MISS_RATIO
	 * @model name="CacheMissRatio"
	 * @generated
	 * @ordered
	 */
	public static final int CACHE_MISS_RATIO_VALUE = 0;

	/**
	 * The '<em><b>Core Execution Time Relative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Core Execution Time Relative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORE_EXECUTION_TIME_RELATIVE
	 * @model name="CoreExecutionTimeRelative"
	 * @generated
	 * @ordered
	 */
	public static final int CORE_EXECUTION_TIME_RELATIVE_VALUE = 0;

	/**
	 * The '<em><b>Memory Access Time Relative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory Access Time Relative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY_ACCESS_TIME_RELATIVE
	 * @model name="MemoryAccessTimeRelative"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_ACCESS_TIME_RELATIVE_VALUE = 0;

	/**
	 * The '<em><b>Normalized Lateness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normalized Lateness</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_LATENESS
	 * @model name="NormalizedLateness"
	 * @generated
	 * @ordered
	 */
	public static final int NORMALIZED_LATENESS_VALUE = 0;

	/**
	 * The '<em><b>Normalized Response Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normalized Response Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_RESPONSE_TIME
	 * @model name="NormalizedResponseTime"
	 * @generated
	 * @ordered
	 */
	public static final int NORMALIZED_RESPONSE_TIME_VALUE = 0;

	/**
	 * The '<em><b>Os Overhead Relative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Os Overhead Relative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS_OVERHEAD_RELATIVE
	 * @model name="OsOverheadRelative"
	 * @generated
	 * @ordered
	 */
	public static final int OS_OVERHEAD_RELATIVE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Percentage Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PercentageMetric[] VALUES_ARRAY =
		new PercentageMetric[] {
			_UNDEFINED_,
			CACHE_HIT_RATIO,
			CACHE_MISS_RATIO,
			CORE_EXECUTION_TIME_RELATIVE,
			MEMORY_ACCESS_TIME_RELATIVE,
			NORMALIZED_LATENESS,
			NORMALIZED_RESPONSE_TIME,
			OS_OVERHEAD_RELATIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Percentage Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PercentageMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Percentage Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PercentageMetric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PercentageMetric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Percentage Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PercentageMetric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PercentageMetric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Percentage Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PercentageMetric get(int value) {
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
	private PercentageMetric(int value, String name, String literal) {
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
	
} //PercentageMetric
