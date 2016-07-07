/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Timing Information Sub Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Die Auflistung aller Basis-Timing-Sub-Typen.
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationSubTypeEnum()
 * @model extendedMetaData="name='TimingInformationSubTypeEnum'"
 * @generated
 */
public enum TimingInformationSubTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(0, "min", "min"),

	/**
	 * The '<em><b>Max</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(1, "max", "max"),

	/**
	 * The '<em><b>Average</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE(2, "average", "average"),

	/**
	 * The '<em><b>Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN(3, "mean", "mean"),

	/**
	 * The '<em><b>Std Deviation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STD_DEVIATION_VALUE
	 * @generated
	 * @ordered
	 */
	STD_DEVIATION(4, "stdDeviation", "stdDeviation"),

	/**
	 * The '<em><b>Frequency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENCY(5, "frequency", "frequency");

	/**
	 * The '<em><b>Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model name="min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 0;

	/**
	 * The '<em><b>Max</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model name="max"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 1;

	/**
	 * The '<em><b>Average</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE
	 * @model name="average"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_VALUE = 2;

	/**
	 * The '<em><b>Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEAN
	 * @model name="mean"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_VALUE = 3;

	/**
	 * The '<em><b>Std Deviation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Std Deviation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STD_DEVIATION
	 * @model name="stdDeviation"
	 * @generated
	 * @ordered
	 */
	public static final int STD_DEVIATION_VALUE = 4;

	/**
	 * The '<em><b>Frequency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frequency</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY
	 * @model name="frequency"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Timing Information Sub Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimingInformationSubTypeEnum[] VALUES_ARRAY =
		new TimingInformationSubTypeEnum[] {
			MIN,
			MAX,
			AVERAGE,
			MEAN,
			STD_DEVIATION,
			FREQUENCY,
		};

	/**
	 * A public read-only list of all the '<em><b>Timing Information Sub Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimingInformationSubTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timing Information Sub Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationSubTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingInformationSubTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Information Sub Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationSubTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingInformationSubTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Information Sub Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationSubTypeEnum get(int value) {
		switch (value) {
			case MIN_VALUE: return MIN;
			case MAX_VALUE: return MAX;
			case AVERAGE_VALUE: return AVERAGE;
			case MEAN_VALUE: return MEAN;
			case STD_DEVIATION_VALUE: return STD_DEVIATION;
			case FREQUENCY_VALUE: return FREQUENCY;
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
	private TimingInformationSubTypeEnum(int value, String name, String literal) {
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
	
} //TimingInformationSubTypeEnum
