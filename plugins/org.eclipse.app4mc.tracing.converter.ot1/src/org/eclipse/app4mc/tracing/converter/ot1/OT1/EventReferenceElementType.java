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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Reference Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieses Element beschreibt eine Referenz auf ein
 * 				bestimmtes Event.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType#getEventReference <em>Event Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventReferenceElementType()
 * @model extendedMetaData="name='EventReferenceElementType' kind='elementOnly'"
 * @generated
 */
public interface EventReferenceElementType extends TimeStampElementType {
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
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventReferenceElementType_EventReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EventReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EventReferenceType getEventReference();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType#getEventReference <em>Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Reference</em>' containment reference.
	 * @see #getEventReference()
	 * @generated
	 */
	void setEventReference(EventReferenceType value);

} // EventReferenceElementType
