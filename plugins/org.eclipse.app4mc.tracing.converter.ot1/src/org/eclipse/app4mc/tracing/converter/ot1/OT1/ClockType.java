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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Typ "ClockType" beschreibt die Basisgrößen über
 * 				den zum Messen/Tracen verwendeten Timer, wie "tickduration" und die
 * 				maximale, absolute Zeit des Timers (maxAbsTime).
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType#getTickduration <em>Tickduration</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType#getMaxAbsTime <em>Max Abs Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getClockType()
 * @model extendedMetaData="name='ClockType' kind='elementOnly'"
 * @generated
 */
public interface ClockType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tickduration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tickduration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tickduration</em>' containment reference.
	 * @see #setTickduration(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getClockType_Tickduration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Tickduration' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getTickduration();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType#getTickduration <em>Tickduration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tickduration</em>' containment reference.
	 * @see #getTickduration()
	 * @generated
	 */
	void setTickduration(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Max Abs Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Abs Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Abs Time</em>' attribute.
	 * @see #setMaxAbsTime(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getClockType_MaxAbsTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='maxAbsTime' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxAbsTime();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType#getMaxAbsTime <em>Max Abs Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Abs Time</em>' attribute.
	 * @see #getMaxAbsTime()
	 * @generated
	 */
	void setMaxAbsTime(BigInteger value);

} // ClockType
