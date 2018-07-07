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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latency Timing Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * siehe AUTOSAR_TPS_TimingExtensions.pdf
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getEventChainId <em>Event Chain Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getLatencyTimingConstraintType()
 * @model extendedMetaData="name='LatencyTimingConstraintType' kind='elementOnly'"
 * @generated
 */
public interface LatencyTimingConstraintType extends TimingConstraintElementType {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' containment reference.
	 * @see #setMinimum(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getLatencyTimingConstraintType_Minimum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getMinimum <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' containment reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' containment reference.
	 * @see #setMaximum(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getLatencyTimingConstraintType_Maximum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getMaximum <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' containment reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Event Chain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Chain Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Chain Id</em>' attribute.
	 * @see #setEventChainId(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getLatencyTimingConstraintType_EventChainId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='eventChainId' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEventChainId();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getEventChainId <em>Event Chain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Chain Id</em>' attribute.
	 * @see #getEventChainId()
	 * @generated
	 */
	void setEventChainId(BigInteger value);

} // LatencyTimingConstraintType
