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
 * A representation of the model object '<em><b>Scheduling Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein "SchedulingEntityType" bescheibt eine
 * 				Basiseinheit, die einem Scheduler unterliegt. Diese global
 * 				eindeutige Einheit muss über weitere SchedulingEnityTypes hinweg
 * 				eindeutig sein (uuid).
 * 				Jeder SchedulingEntity muss eine "Clock" vom
 * 				Type "ClockType" definieren,
 * 				die Aufschluß über den zum Messen
 * 				verwendeten Timer gibt.
 * 				Ein solches "SchedulingEntity" kann beleibeig
 * 				viele Elemente vom Typ
 * 				"SchedulingEntityElementType" haben, die das
 * 				System beschreiben.
 * 				Ein SchedulingEntity beinhaltet auch die
 * 				komplette Beschreibung aller
 * 				möglichen Events und EventChains, die in
 * 				den Traces vorkommen
 * 				dürfen.
 * 				Jeder Trace gehört zu genau einer
 * 				SchedulingEntity, daher kann eine
 * 				SchdulingEntity 0..n Traces haben.
 * 				Die Referenzgröße, die die
 * 				Zusammengehärigkeit definiert ist die
 * 				"uuid".
 * 				Weiter kann im Element "TracingOverheadContainer" der
 * 				Mess-Overhead für
 * 				beliebeige Events definiert werden. Diese Größen
 * 				können zur
 * 				Korrectur der Messergebnisse herangezogen werden.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getClock <em>Clock</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getEventDescription <em>Event Description</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getTracingOverheadContainer <em>Tracing Overhead Container</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getTraces <em>Traces</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityType()
 * @model abstract="true"
 *        extendedMetaData="name='SchedulingEntityType' kind='elementOnly'"
 * @generated
 */
public interface SchedulingEntityType extends UniqueElementType {
	/**
	 * Returns the value of the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' containment reference.
	 * @see #setClock(ClockType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityType_Clock()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Clock' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockType getClock();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getClock <em>Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' containment reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(ClockType value);

	/**
	 * Returns the value of the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Description</em>' containment reference.
	 * @see #setEventDescription(EventDescriptionType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityType_EventDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EventDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EventDescriptionType getEventDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getEventDescription <em>Event Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Description</em>' containment reference.
	 * @see #getEventDescription()
	 * @generated
	 */
	void setEventDescription(EventDescriptionType value);

	/**
	 * Returns the value of the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracing Overhead Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracing Overhead Container</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityType_TracingOverheadContainer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TracingOverheadContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TracingOverheadContainerType> getTracingOverheadContainer();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityType_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SchedulingEntityElementType> getElement();

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference.
	 * @see #setTraces(TracesType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityType_Traces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Traces' namespace='##targetNamespace'"
	 * @generated
	 */
	TracesType getTraces();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getTraces <em>Traces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traces</em>' containment reference.
	 * @see #getTraces()
	 * @generated
	 */
	void setTraces(TracesType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SchedulingEntityType
