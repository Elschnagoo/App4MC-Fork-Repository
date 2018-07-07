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
 * A representation of the model object '<em><b>Event Id Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventIdMappingType()
 * @model extendedMetaData="name='EventIdMappingType' kind='empty'"
 * @generated
 */
public interface EventIdMappingType extends EObject {
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
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventIdMappingType_EventId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='eventId' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEventId();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventId <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Id</em>' attribute.
	 * @see #getEventId()
	 * @generated
	 */
	void setEventId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum
	 * @see #isSetEventType()
	 * @see #unsetEventType()
	 * @see #setEventType(EventTypeEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventIdMappingType_EventType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='eventType' namespace='##targetNamespace'"
	 * @generated
	 */
	EventTypeEnum getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum
	 * @see #isSetEventType()
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventTypeEnum)
	 * @generated
	 */
	void unsetEventType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventType <em>Event Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Type</em>' attribute is set.
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventTypeEnum)
	 * @generated
	 */
	boolean isSetEventType();

} // EventIdMappingType
