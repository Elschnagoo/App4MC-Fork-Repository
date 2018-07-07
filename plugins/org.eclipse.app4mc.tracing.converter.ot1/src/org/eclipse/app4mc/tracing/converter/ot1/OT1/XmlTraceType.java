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
 * A representation of the model object '<em><b>Xml Trace Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * "XmlTraceType" beschreibt einen OT1-Trace aus
 * 				XML-Elementen. Ein OT1-Trace kann 0..n Einträge/Events (TraceEntry)
 * 				haben und zusätzlich 0..n Kommentare (TraceComment).
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType#getTraceEntry <em>Trace Entry</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType#getTraceComment <em>Trace Comment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getXmlTraceType()
 * @model extendedMetaData="name='XmlTraceType' kind='elementOnly'"
 * @generated
 */
public interface XmlTraceType extends UniqueElementType {
	/**
	 * Returns the value of the '<em><b>Trace Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Entry</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getXmlTraceType_TraceEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TraceEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TraceEntryType> getTraceEntry();

	/**
	 * Returns the value of the '<em><b>Trace Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Comment</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getXmlTraceType_TraceComment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TraceComment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TraceCommentType> getTraceComment();

} // XmlTraceType
