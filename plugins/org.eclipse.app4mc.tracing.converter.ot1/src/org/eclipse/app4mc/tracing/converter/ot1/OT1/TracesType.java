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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getOT1TraceLink <em>OT1 Trace Link</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getOT1HexTrace <em>OT1 Hex Trace</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getXmlTrace <em>Xml Trace</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracesType()
 * @model extendedMetaData="name='Traces_._type' kind='elementOnly'"
 * @generated
 */
public interface TracesType extends EObject {
	/**
	 * Returns the value of the '<em><b>OT1 Trace Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OT1 Trace Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OT1 Trace Link</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracesType_OT1TraceLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OT1TraceLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OT1TraceLinkType> getOT1TraceLink();

	/**
	 * Returns the value of the '<em><b>OT1 Hex Trace</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OT1 Hex Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OT1 Hex Trace</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracesType_OT1HexTrace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OT1HexTrace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OT1HexTraceType> getOT1HexTrace();

	/**
	 * Returns the value of the '<em><b>Xml Trace</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Trace</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracesType_XmlTrace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XmlTrace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XmlTraceType> getXmlTrace();

} // TracesType
