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
 * A representation of the model object '<em><b>Event Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Jedes Event muss ein Mapping von einem Wert (value)
 * 				auf einen Event-Typ (eventType) und ein OT1-Element (elementRefId)
 * 				aufweisen. Nur so kann ein Event eindeutig die Frage "Was is bei wem
 * 				passiert?" beantworten.
 * 				Jede Event-Beschreibung hat seine eigene ID,
 * 				die innerhalb eines
 * 				SchedulingEntity eindeutig sein muss. Über diese
 * 				ID können weitere
 * 				Element sich auf eine Event-Beschreibung
 * 				referenzieren.
 * 				Optional kann pro Event eine weitere Beschreibung
 * 				(description) angegeben
 * 				werden.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getElementRefId <em>Element Ref Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventReferenceType()
 * @model extendedMetaData="name='EventReferenceType' kind='elementOnly'"
 * @generated
 */
public interface EventReferenceType extends OT1Type {
	/**
	 * Returns the value of the '<em><b>Element Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Ref Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Ref Id</em>' attribute.
	 * @see #setElementRefId(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventReferenceType_ElementRefId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='elementRefId' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getElementRefId();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getElementRefId <em>Element Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Ref Id</em>' attribute.
	 * @see #getElementRefId()
	 * @generated
	 */
	void setElementRefId(BigInteger value);

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
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventReferenceType_EventType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='eventType' namespace='##targetNamespace'"
	 * @generated
	 */
	EventTypeEnum getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getEventType <em>Event Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventTypeEnum)
	 * @generated
	 */
	void unsetEventType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getEventType <em>Event Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Type</em>' attribute is set.
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventTypeEnum)
	 * @generated
	 */
	boolean isSetEventType();

} // EventReferenceType
