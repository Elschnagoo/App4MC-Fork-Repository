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
 * A representation of the literals of the enumeration '<em><b>Count Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCountMetric()
 * @model
 * @generated
 */
public enum CountMetric implements Enumerator {
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
	 * The '<em><b>Activations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATIONS(0, "Activations", "Activations"),

	/**
	 * The '<em><b>Bounded Migrations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNDED_MIGRATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	BOUNDED_MIGRATIONS(0, "BoundedMigrations", "BoundedMigrations"),

	/**
	 * The '<em><b>Cache Hit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CACHE_HIT_VALUE
	 * @generated
	 * @ordered
	 */
	CACHE_HIT(0, "CacheHit", "CacheHit"),

	/**
	 * The '<em><b>Cache Miss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CACHE_MISS_VALUE
	 * @generated
	 * @ordered
	 */
	CACHE_MISS(0, "CacheMiss", "CacheMiss"),

	/**
	 * The '<em><b>Full Migrations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_MIGRATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_MIGRATIONS(0, "FullMigrations", "FullMigrations"),

	/**
	 * The '<em><b>Mta Limit Exceeding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTA_LIMIT_EXCEEDING_VALUE
	 * @generated
	 * @ordered
	 */
	MTA_LIMIT_EXCEEDING(0, "MtaLimitExceeding", "MtaLimitExceeding"),

	/**
	 * The '<em><b>Preemptions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREEMPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	PREEMPTIONS(0, "Preemptions", "Preemptions");

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
	 * The '<em><b>Activations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activations</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATIONS
	 * @model name="Activations"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATIONS_VALUE = 0;

	/**
	 * The '<em><b>Bounded Migrations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bounded Migrations</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOUNDED_MIGRATIONS
	 * @model name="BoundedMigrations"
	 * @generated
	 * @ordered
	 */
	public static final int BOUNDED_MIGRATIONS_VALUE = 0;

	/**
	 * The '<em><b>Cache Hit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cache Hit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CACHE_HIT
	 * @model name="CacheHit"
	 * @generated
	 * @ordered
	 */
	public static final int CACHE_HIT_VALUE = 0;

	/**
	 * The '<em><b>Cache Miss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cache Miss</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CACHE_MISS
	 * @model name="CacheMiss"
	 * @generated
	 * @ordered
	 */
	public static final int CACHE_MISS_VALUE = 0;

	/**
	 * The '<em><b>Full Migrations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full Migrations</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_MIGRATIONS
	 * @model name="FullMigrations"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_MIGRATIONS_VALUE = 0;

	/**
	 * The '<em><b>Mta Limit Exceeding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mta Limit Exceeding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MTA_LIMIT_EXCEEDING
	 * @model name="MtaLimitExceeding"
	 * @generated
	 * @ordered
	 */
	public static final int MTA_LIMIT_EXCEEDING_VALUE = 0;

	/**
	 * The '<em><b>Preemptions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preemptions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREEMPTIONS
	 * @model name="Preemptions"
	 * @generated
	 * @ordered
	 */
	public static final int PREEMPTIONS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Count Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CountMetric[] VALUES_ARRAY =
		new CountMetric[] {
			_UNDEFINED_,
			ACTIVATIONS,
			BOUNDED_MIGRATIONS,
			CACHE_HIT,
			CACHE_MISS,
			FULL_MIGRATIONS,
			MTA_LIMIT_EXCEEDING,
			PREEMPTIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>Count Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CountMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Count Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CountMetric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CountMetric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Count Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CountMetric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CountMetric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Count Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CountMetric get(int value) {
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
	private CountMetric(int value, String name, String literal) {
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
	
} //CountMetric
