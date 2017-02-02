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
 * A representation of the literals of the enumeration '<em><b>Runnable Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableOrderType()
 * @model
 * @generated
 */
public enum RunnableOrderType implements Enumerator {
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
	 * The '<em><b>Successor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESSOR(0, "successor", "successor"),

	/**
	 * The '<em><b>Immediate Successor Start Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_SUCCESSOR_START_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	IMMEDIATE_SUCCESSOR_START_SEQUENCE(0, "immediateSuccessorStartSequence", "immediateSuccessorStartSequence"),

	/**
	 * The '<em><b>Immediate Successor Any Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_SUCCESSOR_ANY_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	IMMEDIATE_SUCCESSOR_ANY_SEQUENCE(0, "immediateSuccessorAnySequence", "immediateSuccessorAnySequence"),

	/**
	 * The '<em><b>Immediate Successor End Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_SUCCESSOR_END_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	IMMEDIATE_SUCCESSOR_END_SEQUENCE(0, "immediateSuccessorEndSequence", "immediateSuccessorEndSequence");

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
	 * The '<em><b>Successor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Successor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESSOR
	 * @model name="successor"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESSOR_VALUE = 0;

	/**
	 * The '<em><b>Immediate Successor Start Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Immediate Successor Start Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_SUCCESSOR_START_SEQUENCE
	 * @model name="immediateSuccessorStartSequence"
	 * @generated
	 * @ordered
	 */
	public static final int IMMEDIATE_SUCCESSOR_START_SEQUENCE_VALUE = 0;

	/**
	 * The '<em><b>Immediate Successor Any Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Immediate Successor Any Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_SUCCESSOR_ANY_SEQUENCE
	 * @model name="immediateSuccessorAnySequence"
	 * @generated
	 * @ordered
	 */
	public static final int IMMEDIATE_SUCCESSOR_ANY_SEQUENCE_VALUE = 0;

	/**
	 * The '<em><b>Immediate Successor End Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Immediate Successor End Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_SUCCESSOR_END_SEQUENCE
	 * @model name="immediateSuccessorEndSequence"
	 * @generated
	 * @ordered
	 */
	public static final int IMMEDIATE_SUCCESSOR_END_SEQUENCE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Runnable Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RunnableOrderType[] VALUES_ARRAY =
		new RunnableOrderType[] {
			_UNDEFINED_,
			SUCCESSOR,
			IMMEDIATE_SUCCESSOR_START_SEQUENCE,
			IMMEDIATE_SUCCESSOR_ANY_SEQUENCE,
			IMMEDIATE_SUCCESSOR_END_SEQUENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Runnable Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RunnableOrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Runnable Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RunnableOrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RunnableOrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Runnable Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RunnableOrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RunnableOrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Runnable Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RunnableOrderType get(int value) {
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
	private RunnableOrderType(int value, String name, String literal) {
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
	
} //RunnableOrderType
