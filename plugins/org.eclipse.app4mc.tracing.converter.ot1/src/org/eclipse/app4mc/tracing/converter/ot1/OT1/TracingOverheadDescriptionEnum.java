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
 * A representation of the literals of the enumeration '<em><b>Tracing Overhead Description Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Es gibt 3 Arten (Overhead-)Zeiten, die beim Messen
 * 				von Zeitstempeln beachtet werden müssen. Es ist möglich die Zeit von
 * 				Beginn der Trace-Prozedur bis zum Lesen der Systemzeit (before
 * 				taking time) anzugeben und die Zeit vom LEsen der Systemzeit bis zum
 * 				Ende der Tracing-Prozedur (after taking time) oder eine Zeit, die
 * 				die andern zwei Zeiten beinhaltet (total overhead).
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracingOverheadDescriptionEnum()
 * @model extendedMetaData="name='TracingOverheadDescriptionEnum'"
 * @generated
 */
public enum TracingOverheadDescriptionEnum implements Enumerator {
	/**
	 * The '<em><b>Total Overhead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTAL_OVERHEAD_VALUE
	 * @generated
	 * @ordered
	 */
	TOTAL_OVERHEAD(0, "totalOverhead", "total overhead"),

	/**
	 * The '<em><b>Before Taking Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_TAKING_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_TAKING_TIME(1, "beforeTakingTime", "before taking time"),

	/**
	 * The '<em><b>After Taking Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_TAKING_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_TAKING_TIME(2, "afterTakingTime", "after taking time");

	/**
	 * The '<em><b>Total Overhead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Total Overhead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOTAL_OVERHEAD
	 * @model name="totalOverhead" literal="total overhead"
	 * @generated
	 * @ordered
	 */
	public static final int TOTAL_OVERHEAD_VALUE = 0;

	/**
	 * The '<em><b>Before Taking Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before Taking Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_TAKING_TIME
	 * @model name="beforeTakingTime" literal="before taking time"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_TAKING_TIME_VALUE = 1;

	/**
	 * The '<em><b>After Taking Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After Taking Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_TAKING_TIME
	 * @model name="afterTakingTime" literal="after taking time"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_TAKING_TIME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tracing Overhead Description Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TracingOverheadDescriptionEnum[] VALUES_ARRAY =
		new TracingOverheadDescriptionEnum[] {
			TOTAL_OVERHEAD,
			BEFORE_TAKING_TIME,
			AFTER_TAKING_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Tracing Overhead Description Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TracingOverheadDescriptionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tracing Overhead Description Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TracingOverheadDescriptionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TracingOverheadDescriptionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tracing Overhead Description Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TracingOverheadDescriptionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TracingOverheadDescriptionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tracing Overhead Description Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TracingOverheadDescriptionEnum get(int value) {
		switch (value) {
			case TOTAL_OVERHEAD_VALUE: return TOTAL_OVERHEAD;
			case BEFORE_TAKING_TIME_VALUE: return BEFORE_TAKING_TIME;
			case AFTER_TAKING_TIME_VALUE: return AFTER_TAKING_TIME;
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
	private TracingOverheadDescriptionEnum(int value, String name, String literal) {
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
	
} //TracingOverheadDescriptionEnum
