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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der "EventDescriptionContainerType" beschreibt alle
 * 				möglichen Events vom Type EventDescriptionType" und EventChains vom
 * 				Typ "EventChainDescriptionType".
 * 				Jedes Event, das in den Messungen
 * 				oder Traces vorkommt muss in diesem
 * 				Container aufgelistet und
 * 				eindeutig referenzierbar sein.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType#getEventIdMapping <em>Event Id Mapping</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventDescriptionType()
 * @model extendedMetaData="name='EventDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface EventDescriptionType extends OT1Type {
	/**
	 * Returns the value of the '<em><b>Event Id Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Id Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Id Mapping</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getEventDescriptionType_EventIdMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventIdMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EventIdMappingType> getEventIdMapping();

} // EventDescriptionType
