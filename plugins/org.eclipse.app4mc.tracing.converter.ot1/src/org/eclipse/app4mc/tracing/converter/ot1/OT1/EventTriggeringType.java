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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Triggering Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType#getEventReference <em>Event Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventTriggeringType()
 * @model extendedMetaData="name='EventTriggeringType' kind='elementOnly'"
 * @generated
 */
public interface EventTriggeringType extends TimingValueElementType {
	/**
	 * Returns the value of the '<em><b>Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Reference</em>' containment reference.
	 * @see #setEventReference(EventReferenceType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventTriggeringType_EventReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EventReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EventReferenceType getEventReference();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType#getEventReference <em>Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Reference</em>' containment reference.
	 * @see #getEventReference()
	 * @generated
	 */
	void setEventReference(EventReferenceType value);

} // EventTriggeringType
