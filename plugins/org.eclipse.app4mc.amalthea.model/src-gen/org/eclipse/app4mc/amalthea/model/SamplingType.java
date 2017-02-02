/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
 * A representation of the literals of the enumeration '<em><b>Sampling Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The types of sampling
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSamplingType()
 * @model
 * @generated
 */
public enum SamplingType implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "default"),

	/**
	 * The '<em><b>Best Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_CASE(0, "BestCase", "BestCase"),

	/**
	 * The '<em><b>Worst Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORST_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	WORST_CASE(0, "WorstCase", "WorstCase"),

	/**
	 * The '<em><b>Average Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_CASE(0, "AverageCase", "AverageCase"),

	/**
	 * The '<em><b>Corner Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORNER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	CORNER_CASE(0, "CornerCase", "CornerCase"),

	/**
	 * The '<em><b>Uniform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFORM_VALUE
	 * @generated
	 * @ordered
	 */
	UNIFORM(0, "Uniform", "Uniform");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Best Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Best Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEST_CASE
	 * @model name="BestCase"
	 * @generated
	 * @ordered
	 */
	public static final int BEST_CASE_VALUE = 0;

	/**
	 * The '<em><b>Worst Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Worst Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORST_CASE
	 * @model name="WorstCase"
	 * @generated
	 * @ordered
	 */
	public static final int WORST_CASE_VALUE = 0;

	/**
	 * The '<em><b>Average Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_CASE
	 * @model name="AverageCase"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_CASE_VALUE = 0;

	/**
	 * The '<em><b>Corner Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Corner Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORNER_CASE
	 * @model name="CornerCase"
	 * @generated
	 * @ordered
	 */
	public static final int CORNER_CASE_VALUE = 0;

	/**
	 * The '<em><b>Uniform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uniform</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIFORM
	 * @model name="Uniform"
	 * @generated
	 * @ordered
	 */
	public static final int UNIFORM_VALUE = 0;

	/**
	 * An array of all the '<em><b>Sampling Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SamplingType[] VALUES_ARRAY =
		new SamplingType[] {
			DEFAULT,
			BEST_CASE,
			WORST_CASE,
			AVERAGE_CASE,
			CORNER_CASE,
			UNIFORM,
		};

	/**
	 * A public read-only list of all the '<em><b>Sampling Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SamplingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sampling Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SamplingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SamplingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sampling Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SamplingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SamplingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sampling Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SamplingType get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
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
	private SamplingType(int value, String name, String literal) {
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
	
} //SamplingType
