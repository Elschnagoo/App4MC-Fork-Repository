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
 * A representation of the literals of the enumeration '<em><b>Timing Information Source Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Die Auflistung aller Timing-Quellen.
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationSourceEnum()
 * @model extendedMetaData="name='TimingInformationSourceEnum'"
 * @generated
 */
public enum TimingInformationSourceEnum implements Enumerator {
	/**
	 * The '<em><b>Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION(0, "configuration", "configuration"),

	/**
	 * The '<em><b>Trace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE(1, "trace", "trace"),

	/**
	 * The '<em><b>Simulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULATION_VALUE
	 * @generated
	 * @ordered
	 */
	SIMULATION(2, "simulation", "simulation"),

	/**
	 * The '<em><b>Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYSIS(3, "analysis", "analysis"),

	/**
	 * The '<em><b>Budget</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUDGET_VALUE
	 * @generated
	 * @ordered
	 */
	BUDGET(4, "budget", "budget"),

	/**
	 * The '<em><b>Estimation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTIMATION_VALUE
	 * @generated
	 * @ordered
	 */
	ESTIMATION(5, "estimation", "estimation"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(6, "unknown", "unknown");

	/**
	 * The '<em><b>Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configuration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION
	 * @model name="configuration"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_VALUE = 0;

	/**
	 * The '<em><b>Trace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trace</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACE
	 * @model name="trace"
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_VALUE = 1;

	/**
	 * The '<em><b>Simulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simulation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMULATION
	 * @model name="simulation"
	 * @generated
	 * @ordered
	 */
	public static final int SIMULATION_VALUE = 2;

	/**
	 * The '<em><b>Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analysis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS
	 * @model name="analysis"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS_VALUE = 3;

	/**
	 * The '<em><b>Budget</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Budget</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUDGET
	 * @model name="budget"
	 * @generated
	 * @ordered
	 */
	public static final int BUDGET_VALUE = 4;

	/**
	 * The '<em><b>Estimation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Estimation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTIMATION
	 * @model name="estimation"
	 * @generated
	 * @ordered
	 */
	public static final int ESTIMATION_VALUE = 5;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Timing Information Source Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimingInformationSourceEnum[] VALUES_ARRAY =
		new TimingInformationSourceEnum[] {
			CONFIGURATION,
			TRACE,
			SIMULATION,
			ANALYSIS,
			BUDGET,
			ESTIMATION,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Timing Information Source Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimingInformationSourceEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timing Information Source Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationSourceEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingInformationSourceEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Information Source Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationSourceEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingInformationSourceEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Information Source Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingInformationSourceEnum get(int value) {
		switch (value) {
			case CONFIGURATION_VALUE: return CONFIGURATION;
			case TRACE_VALUE: return TRACE;
			case SIMULATION_VALUE: return SIMULATION;
			case ANALYSIS_VALUE: return ANALYSIS;
			case BUDGET_VALUE: return BUDGET;
			case ESTIMATION_VALUE: return ESTIMATION;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private TimingInformationSourceEnum(int value, String name, String literal) {
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
	
} //TimingInformationSourceEnum
