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
 * A representation of the model object '<em><b>Tracing Overhead Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Container ist eine Ansammlung aller
 * 				Overhead-Elemente.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType#getTracingOverhead <em>Tracing Overhead</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracingOverheadContainerType()
 * @model extendedMetaData="name='TracingOverheadContainerType' kind='elementOnly'"
 * @generated
 */
public interface TracingOverheadContainerType extends OT1Type {
	/**
	 * Returns the value of the '<em><b>Tracing Overhead</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracing Overhead</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracing Overhead</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTracingOverheadContainerType_TracingOverhead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TracingOverhead' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TracingOverheadType> getTracingOverhead();

} // TracingOverheadContainerType
