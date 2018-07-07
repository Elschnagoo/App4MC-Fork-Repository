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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Chain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eine Event-Kette kann über den Type
 * 				"EventChainDescriptionType" definiert werden. Diese Ketten bestehen
 * 				immer aus einem Start- und einem Ende-Event, die anhand der Event-ID
 * 				referenziert werden, und optional aus 0..n Kettenelementen/-events
 * 				(InterChainEventId).
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getStimulusEventReference <em>Stimulus Event Reference</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getInterChainEventReferenceId <em>Inter Chain Event Reference Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getResponseEventReference <em>Response Event Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventChainType()
 * @model extendedMetaData="name='EventChainType' kind='elementOnly'"
 * @generated
 */
public interface EventChainType extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Stimulus Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus Event Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus Event Reference</em>' containment reference.
	 * @see #setStimulusEventReference(EventReferenceType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventChainType_StimulusEventReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StimulusEventReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EventReferenceType getStimulusEventReference();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getStimulusEventReference <em>Stimulus Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Event Reference</em>' containment reference.
	 * @see #getStimulusEventReference()
	 * @generated
	 */
	void setStimulusEventReference(EventReferenceType value);

	/**
	 * Returns the value of the '<em><b>Inter Chain Event Reference Id</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Chain Event Reference Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Chain Event Reference Id</em>' attribute list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventChainType_InterChainEventReferenceId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='element' name='InterChainEventReferenceId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getInterChainEventReferenceId();

	/**
	 * Returns the value of the '<em><b>Response Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Event Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Event Reference</em>' containment reference.
	 * @see #setResponseEventReference(EventReferenceType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventChainType_ResponseEventReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResponseEventReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EventReferenceType getResponseEventReference();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getResponseEventReference <em>Response Event Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Event Reference</em>' containment reference.
	 * @see #getResponseEventReference()
	 * @generated
	 */
	void setResponseEventReference(EventReferenceType value);

} // EventChainType
