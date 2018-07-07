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
 * A representation of the model object '<em><b>Event Chain Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein EventChainElementType definiert eine
 * 				"Event-Kette", bestehend aus beliebig vielen Events, mindestens aber
 * 				2.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType#getEventChain <em>Event Chain</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventChainElementType()
 * @model extendedMetaData="name='EventChainElementType' kind='elementOnly'"
 * @generated
 */
public interface EventChainElementType extends TimeRangeElementType {
	/**
	 * Returns the value of the '<em><b>Event Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Chain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Chain</em>' containment reference.
	 * @see #setEventChain(EventChainType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventChainElementType_EventChain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EventChain' namespace='##targetNamespace'"
	 * @generated
	 */
	EventChainType getEventChain();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType#getEventChain <em>Event Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Chain</em>' containment reference.
	 * @see #getEventChain()
	 * @generated
	 */
	void setEventChain(EventChainType value);

} // EventChainElementType
