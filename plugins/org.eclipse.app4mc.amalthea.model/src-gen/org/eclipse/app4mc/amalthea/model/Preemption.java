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
 * A representation of the literals of the enumeration '<em><b>Preemption</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Preemption type for scheduling
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPreemption()
 * @model
 * @generated
 */
public enum Preemption implements Enumerator {
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
	 * The '<em><b>Preemptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREEMPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PREEMPTIVE(0, "preemptive", "preemptive"),

	/**
	 * The '<em><b>Cooperative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOPERATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COOPERATIVE(0, "cooperative", "cooperative"),

	/**
	 * The '<em><b>Non preemptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_PREEMPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_PREEMPTIVE(0, "non_preemptive", "non_preemptive");

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
	 * The '<em><b>Preemptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preemptive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREEMPTIVE
	 * @model name="preemptive"
	 * @generated
	 * @ordered
	 */
	public static final int PREEMPTIVE_VALUE = 0;

	/**
	 * The '<em><b>Cooperative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cooperative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COOPERATIVE
	 * @model name="cooperative"
	 * @generated
	 * @ordered
	 */
	public static final int COOPERATIVE_VALUE = 0;

	/**
	 * The '<em><b>Non preemptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non preemptive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_PREEMPTIVE
	 * @model name="non_preemptive"
	 * @generated
	 * @ordered
	 */
	public static final int NON_PREEMPTIVE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Preemption</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Preemption[] VALUES_ARRAY =
		new Preemption[] {
			_UNDEFINED_,
			PREEMPTIVE,
			COOPERATIVE,
			NON_PREEMPTIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Preemption</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Preemption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Preemption</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Preemption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Preemption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Preemption</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Preemption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Preemption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Preemption</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Preemption get(int value) {
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
	private Preemption(int value, String name, String literal) {
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
	
} //Preemption
