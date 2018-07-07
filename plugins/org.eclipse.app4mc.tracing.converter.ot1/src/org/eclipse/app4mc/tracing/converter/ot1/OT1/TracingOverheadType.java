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
 * A representation of the model object '<em><b>Tracing Overhead Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein Tracing-Overhead muss imer eine Zeit angeben,
 * 				die für das Tracen eines Events verbraucht wird.
 * 				Dieser Typ ist
 * 				allgemein gehalten, daher ist es auch möglich einen
 * 				Overhead
 * 				anzugeben, ohne ein direkte Referenz zu einem Event. In
 * 				diesem Fall
 * 				gilt dieser Overhead für alle Events, für die es keinen
 * 				expliziten
 * 				Overhead gibt.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracingOverheadType()
 * @model extendedMetaData="name='TracingOverheadType' kind='elementOnly'"
 * @generated
 */
public interface TracingOverheadType extends OT1Type {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracingOverheadType_Time()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Time' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Id</em>' attribute.
	 * @see #setEventId(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracingOverheadType_EventId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='eventId' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEventId();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getEventId <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Id</em>' attribute.
	 * @see #getEventId()
	 * @generated
	 */
	void setEventId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TracingOverheadDescriptionEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracingOverheadType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TracingOverheadDescriptionEnum getType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TracingOverheadDescriptionEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TracingOverheadDescriptionEnum)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TracingOverheadDescriptionEnum)
	 * @generated
	 */
	boolean isSetType();

} // TracingOverheadType
