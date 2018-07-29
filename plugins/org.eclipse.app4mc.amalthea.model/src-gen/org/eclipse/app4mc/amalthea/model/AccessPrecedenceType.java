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
 * A representation of the literals of the enumeration '<em><b>Access Precedence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the access precedence at the time of one task period.
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAccessPrecedenceType()
 * @model
 * @generated
 */
public enum AccessPrecedenceType implements Enumerator {
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
	 * The '<em><b>Default WR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Writer of label has to be performed before the reader.
	 * <!-- end-model-doc -->
	 * @see #DEFAULT_WR_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_WR(0, "defaultWR", "defaultWR"),

	/**
	 * The '<em><b>Ignore WR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dependency between writer and reader can be ignored.
	 * <!-- end-model-doc -->
	 * @see #IGNORE_WR_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE_WR(0, "ignoreWR", "ignoreWR"),

	/**
	 * The '<em><b>Enforce RW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reader of label has to be performed before the writer (delay unit of controller).
	 * <!-- end-model-doc -->
	 * @see #ENFORCE_RW_VALUE
	 * @generated
	 * @ordered
	 */
	ENFORCE_RW(0, "enforceRW", "enforceRW");

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
	 * The '<em><b>Default WR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Writer of label has to be performed before the reader.
	 * <!-- end-model-doc -->
	 * @see #DEFAULT_WR
	 * @model name="defaultWR"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_WR_VALUE = 0;

	/**
	 * The '<em><b>Ignore WR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dependency between writer and reader can be ignored.
	 * <!-- end-model-doc -->
	 * @see #IGNORE_WR
	 * @model name="ignoreWR"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_WR_VALUE = 0;

	/**
	 * The '<em><b>Enforce RW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reader of label has to be performed before the writer (delay unit of controller).
	 * <!-- end-model-doc -->
	 * @see #ENFORCE_RW
	 * @model name="enforceRW"
	 * @generated
	 * @ordered
	 */
	public static final int ENFORCE_RW_VALUE = 0;

	/**
	 * An array of all the '<em><b>Access Precedence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessPrecedenceType[] VALUES_ARRAY =
		new AccessPrecedenceType[] {
			_UNDEFINED_,
			DEFAULT_WR,
			IGNORE_WR,
			ENFORCE_RW,
		};

	/**
	 * A public read-only list of all the '<em><b>Access Precedence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessPrecedenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Precedence Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessPrecedenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessPrecedenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Precedence Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessPrecedenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessPrecedenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Precedence Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessPrecedenceType get(int value) {
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
	private AccessPrecedenceType(int value, String name, String literal) {
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
	
} //AccessPrecedenceType
