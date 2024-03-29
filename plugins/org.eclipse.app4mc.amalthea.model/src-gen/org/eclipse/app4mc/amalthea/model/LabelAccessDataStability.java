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
 * A representation of the literals of the enumeration '<em><b>Label Access Data Stability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the data stability needs of a label access.
 * Inherited means that the setting of the Label is used
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccessDataStability()
 * @model
 * @generated
 */
public enum LabelAccessDataStability implements Enumerator {
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
	 * The '<em><b>Inherited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERITED_VALUE
	 * @generated
	 * @ordered
	 */
	INHERITED(0, "inherited", "inherited"),

	/**
	 * The '<em><b>No Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_PROTECTION(0, "noProtection", "noProtection"),

	/**
	 * The '<em><b>Automatic Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC_PROTECTION(0, "automaticProtection", "automaticProtection"),

	/**
	 * The '<em><b>Custom Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_PROTECTION(0, "customProtection", "customProtection"),

	/**
	 * The '<em><b>Handled By Model Elements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDLED_BY_MODEL_ELEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	HANDLED_BY_MODEL_ELEMENTS(0, "handledByModelElements", "handledByModelElements");

	/**
	 * The '<em><b>undefined </b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_UNDEFINED_
	 * @model name="_undefined_"
	 * @generated
	 * @ordered
	 */
	public static final int _UNDEFINED__VALUE = 0;

	/**
	 * The '<em><b>Inherited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERITED
	 * @model name="inherited"
	 * @generated
	 * @ordered
	 */
	public static final int INHERITED_VALUE = 0;

	/**
	 * The '<em><b>No Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PROTECTION
	 * @model name="noProtection"
	 * @generated
	 * @ordered
	 */
	public static final int NO_PROTECTION_VALUE = 0;

	/**
	 * The '<em><b>Automatic Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_PROTECTION
	 * @model name="automaticProtection"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_PROTECTION_VALUE = 0;

	/**
	 * The '<em><b>Custom Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PROTECTION
	 * @model name="customProtection"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_PROTECTION_VALUE = 0;

	/**
	 * The '<em><b>Handled By Model Elements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDLED_BY_MODEL_ELEMENTS
	 * @model name="handledByModelElements"
	 * @generated
	 * @ordered
	 */
	public static final int HANDLED_BY_MODEL_ELEMENTS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Label Access Data Stability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LabelAccessDataStability[] VALUES_ARRAY =
		new LabelAccessDataStability[] {
			_UNDEFINED_,
			INHERITED,
			NO_PROTECTION,
			AUTOMATIC_PROTECTION,
			CUSTOM_PROTECTION,
			HANDLED_BY_MODEL_ELEMENTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Label Access Data Stability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LabelAccessDataStability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Label Access Data Stability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelAccessDataStability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelAccessDataStability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Access Data Stability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelAccessDataStability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelAccessDataStability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Access Data Stability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelAccessDataStability get(int value) {
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
	private LabelAccessDataStability(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //LabelAccessDataStability
