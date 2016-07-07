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
 * A representation of the literals of the enumeration '<em><b>Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOrderType()
 * @model
 * @generated
 */
public enum OrderType implements Enumerator {
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
	 * The '<em><b>Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	ORDER(0, "order", "order"),

	/**
	 * The '<em><b>Direct Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_ORDER(0, "directOrder", "directOrder"),

	/**
	 * The '<em><b>Start Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	START_SEQUENCE(0, "startSequence", "startSequence"),

	/**
	 * The '<em><b>End Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	END_SEQUENCE(0, "endSequence", "endSequence");

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
	 * The '<em><b>Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a general order, the included elements must not follow directly
	 * <!-- end-model-doc -->
	 * @see #ORDER
	 * @model name="order"
	 * @generated
	 * @ordered
	 */
	public static final int ORDER_VALUE = 0;

	/**
	 * The '<em><b>Direct Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defined elements must follow directly
	 * <!-- end-model-doc -->
	 * @see #DIRECT_ORDER
	 * @model name="directOrder"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_ORDER_VALUE = 0;

	/**
	 * The '<em><b>Start Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_SEQUENCE
	 * @model name="startSequence"
	 * @generated
	 * @ordered
	 */
	public static final int START_SEQUENCE_VALUE = 0;

	/**
	 * The '<em><b>End Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END_SEQUENCE
	 * @model name="endSequence"
	 * @generated
	 * @ordered
	 */
	public static final int END_SEQUENCE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderType[] VALUES_ARRAY =
		new OrderType[] {
			_UNDEFINED_,
			ORDER,
			DIRECT_ORDER,
			START_SEQUENCE,
			END_SEQUENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType get(int value) {
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
	private OrderType(int value, String name, String literal) {
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
	
} //OrderType
