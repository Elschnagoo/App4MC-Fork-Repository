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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Typ "TimeValueType"
 * 				beschreibt ein Zeitstempel oder ein Zeitbereich anhand Zähler,
 * 				Nenner und Einheit.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getNominator <em>Nominator</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimeValueType()
 * @model extendedMetaData="name='TimeValueType' kind='empty'"
 * @generated
 */
public interface TimeValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #setDenominator(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimeValueType_Denominator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='denominator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDenominator();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Nominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominator</em>' attribute.
	 * @see #setNominator(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimeValueType_Nominator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='nominator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNominator();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getNominator <em>Nominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominator</em>' attribute.
	 * @see #getNominator()
	 * @generated
	 */
	void setNominator(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(TimeBaseEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimeValueType_Unit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeBaseEnum getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeBaseEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TimeBaseEnum)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TimeBaseEnum)
	 * @generated
	 */
	boolean isSetUnit();

} // TimeValueType
